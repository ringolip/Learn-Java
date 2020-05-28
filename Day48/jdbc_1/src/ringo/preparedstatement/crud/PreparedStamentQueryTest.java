package ringo.preparedstatement.crud;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;

import org.junit.Test;
import java.util.List;

import ringo.bean.Customers;
import ringo.bean.Order;
import ringo.util.JDBCUtils;

/**
 * Description 通用的表的查询
 * 
 * @author ringo
 *
 */
public class PreparedStamentQueryTest {
	
	@Test
	public void testQuery() {
		String sql = "select id, name, birth, email from customers where id = ?;";
		Customers query = preparedStamentQuery(Customers.class, sql, 1);
		System.out.println(query);
		
		String sql2 = "select order_id as orderId, order_name as orderName, order_date as orderDate "
				+ "from `order` where order_id = ?;";
		Order query2 = preparedStamentQuery(Order.class, sql2, 2);
		System.out.println(query2);
	}
	
	@Test
	public void testListQuery() {
		String sql = "select id, name, birth, email from customers where id < ?;";
		List<Customers> query1 = listQuery(Customers.class, sql, 10);
		query1.forEach(System.out::println);

		
		String sql2 = "select order_id as orderId, order_name as orderName, order_date as orderDate "
				+ "from `order`;";
		List<Order> query2 = listQuery(Order.class, sql2);
		query2.forEach(System.out::println);
	}
	
	/**
	 * Description 查询多行数据
	 * @param <T>
	 * @return
	 */
	public <T> List<T> listQuery(Class<T> clazz, String sql, Object ...args) {
		Connection connection = null;
		// 预编译SQL语句，获取PreparedStatement
		PreparedStatement prepareStatement = null;
		// 执行SQl
		ResultSet result = null;
		try {
			// 获取连接
			connection = JDBCUtils.getConnection();

			prepareStatement = connection.prepareStatement(sql);
			
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
			JDBCUtils.closeResource(connection, prepareStatement, result);
		}

		return null;
	}
	
	public <T> T preparedStamentQuery(Class<T> clazz, String sql, Object ...args) {
		Connection connection = null;
		// 预编译SQL语句，获取PreparedStatement
		PreparedStatement prepareStatement = null;
		// 执行SQl
		ResultSet result = null;
		try {
			// 获取连接
			connection = JDBCUtils.getConnection();

			prepareStatement = connection.prepareStatement(sql);

			// 填充占位符
			for (int i = 0; i < args.length; i++) {
				prepareStatement.setObject(i + 1, args[i]);
			}

			// 获取结果集
			result = prepareStatement.executeQuery();
			// 获取结果集元数据
			ResultSetMetaData metaData = result.getMetaData();
			int columnCount = metaData.getColumnCount(); // 获取结果集的列数

			if (result.next()) {
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
				return newInstance;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtils.closeResource(connection, prepareStatement, result);
		}

		return null;
	}

}
