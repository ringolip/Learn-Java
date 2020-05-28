package ringo.preparedstatement.crud;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import org.junit.Test;

import ringo.bean.Customers;
import ringo.util.JDBCUtils;


/**
 * Description 针对于Customers表的查询操作
 * @author ringo
 *
 */
public class CustomerForQuery {
	
	@Test
	public void testQueryForCustomers() {
		String sql = "select id, name, birth, email from customers where id = ?;";
		Customers queryForCustomers = queryForCustomers(sql, 13);
		System.out.println(queryForCustomers);
	}
	
	public Customers queryForCustomers(String sql, Object ...args) {
		// 获取连接
		Connection connection = null;
		// 预编译SQL语句，获取PreparedStatement
		PreparedStatement prepareStatement = null;
		// 执行SQl
		ResultSet result = null;
		try {
			connection = JDBCUtils.getConnection();
			
			prepareStatement = connection.prepareStatement(sql);
			
			// 填充占位符
			for (int i = 0; i < args.length; i++) {
				prepareStatement.setObject(i+ 1, args[i]);
			}
			
			// 获取结果集
			result = prepareStatement.executeQuery();
			// 获取结果集元数据
			ResultSetMetaData metaData = result.getMetaData();
			int columnCount = metaData.getColumnCount(); // 获取结果级的列数
			
			if (result.next()) {
				Customers customers = new Customers();
				for (int i = 0; i < columnCount; i++) {
					Object value = result.getObject(i + 1); // 获取列值
					String columnLabel = metaData.getColumnLabel(i + 1); // 获取列的名称
					
					// 为Customers对象的属性赋值
					Field declaredField = Customers.class.getDeclaredField(columnLabel); // 获取属性
					declaredField.setAccessible(true); // 允许访问私有属性
					declaredField.set(customers, value); // 为属性赋值
				}
				return customers;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtils.closeResource(connection, prepareStatement, result);
		}
		
		return null;
	}
}
