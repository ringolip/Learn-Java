package ringo.transaction;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import ringo.bean.User;
import ringo.util.JDBCUtils;

public class TransactionTest {

	@Test
	public void testUpdate() {
		Connection conn = null;
		try {
			// 获取连接
			conn = JDBCUtils.getConnection();
			// 1.取消自动提交
			System.out.println(conn.getAutoCommit());
			conn.setAutoCommit(false);

			String sql1 = "update user_table set balance = balance - 100 where user = ?";
			update(conn, sql1, "AA");

			// 模拟异常
			System.out.println(10 / 0);

			String sql2 = "update user_table set balance = balance + 100 where user = ?";
			update(conn, sql2, "BB");

			// 2.提交数据
			conn.commit();
		} catch (Exception e) {
			e.printStackTrace();
			try {
				// 异常时回滚数据
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			// 关闭连接
			JDBCUtils.closeResource(conn, null);
		}
	}

	@Test
	public void testTransactionSelect() throws Exception{
		Connection conn = JDBCUtils.getConnection();
		
		System.out.println(conn.getTransactionIsolation());
		// 设置隔离级别
		conn.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
		
		// 取消自动提交
		conn.setAutoCommit(false);
		
		String sql = "select user,password,balance from user_table where user = ?;";
		List<User> list = listQuery(conn, User.class ,sql , "cc");
		
		list.forEach(System.out::println);
		
	}
	
	@Test
	public void testTransactionUpdate() throws Exception{
		Connection conn = JDBCUtils.getConnection();
		
		// 取消自动提交
		conn.setAutoCommit(false);
		
		String sql = "update user_table set balance = ? where user = ?";
		
		update(conn, sql, 5000, "cc");
		
		Thread.sleep(15000);
		
		System.out.println("修改结束");
	}
	
	/**
	 * Description 查询多行数据
	 * 
	 * @param <T>
	 * @return
	 */
	public <T> List<T> listQuery(Connection conn, Class<T> clazz, String sql, Object... args) {
		// 预编译SQL语句，获取PreparedStatement
		PreparedStatement prepareStatement = null;
		// 执行SQl
		ResultSet result = null;
		try {
			// 预编译SQL
			prepareStatement = conn.prepareStatement(sql);

			ArrayList<T> arrayList = new ArrayList<T>();

			// 填充占位符
			for (int i = 0; i < args.length; i++) {
				prepareStatement.setObject(i + 1, args[i]);
			}

			// 获取结果集
			result = prepareStatement.executeQuery();
			// 获取结果集元数据
			ResultSetMetaData metaData = result.getMetaData();
			int columnCount = metaData.getColumnCount(); // 获取结果集的列数

			while (result.next()) {
				// 通用类
				T newInstance = clazz.newInstance(); // 获取对象

				for (int i = 0; i < columnCount; i++) {
					Object value = result.getObject(i + 1); // 获取列值
					String columnLabel = metaData.getColumnLabel(i + 1); // 获取列的名称

					// 为对象的属性赋值
					Field declaredField = clazz.getDeclaredField(columnLabel); // 获取属性
					declaredField.setAccessible(true); // 允许访问私有属性
					declaredField.set(newInstance, value); // 为属性赋值

				}

				// 存储赋值好的对象
				arrayList.add(newInstance);
			}
			return arrayList;

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtils.closeResource(null, prepareStatement, result);
		}

		return null;
	}

	// 通用的增删改操作 --支持事务
	public int update(Connection conn, String sql, Object... args) {
		PreparedStatement prepareStatement = null;

		try {
			// 2. 预编译SQL语句，返回PreparedStament
			prepareStatement = conn.prepareStatement(sql);
			// 3.填充占位符
			for (int i = 0; i < args.length; i++) {
				prepareStatement.setObject(i + 1, args[i]);
			}
			// 4.执行SQL
			// prepareStatement.execute();
			return prepareStatement.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 关闭
			JDBCUtils.closeResource(null, prepareStatement); // 不关闭连接，也就不会自动提交数据
		}

		return 0;
	}
}
