package ringo.dao.junit;

import static org.hamcrest.CoreMatchers.nullValue;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.MapHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.junit.Test;

import ringo.bean.Customers;
import ringo.util.JDBCUtils;

public class QueryRunnerTest {
	@Test
	public void testInsert(){
		Connection druidConnection = null;
		try {
			QueryRunner runner = new QueryRunner();
			druidConnection = JDBCUtils.getDruidConnection();
			String sql = "insert into customers(name, email, birth) "
					+ "values(?, ?, ?)";
			
			int insertCount = runner.update(druidConnection, sql, "蔡徐坤", "caixukun@126.com", "1998-08-09");
			System.out.println("添加了" + insertCount + "条记录");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCUtils.closeResource(druidConnection, null);
		}
	}
	
	@Test
	public void testQuery() throws SQLException {
		QueryRunner runner = new QueryRunner();
		Connection druidConnection = JDBCUtils.getDruidConnection();
		String sql = "select id, name, email, birth from customers where id = ?";
		// BeanHandler：是ResultSetHandler接口的实现类，用于封装表中的一条记录
		BeanHandler<Customers> handler = new BeanHandler<>(Customers.class);
		Customers customer = runner.query(druidConnection, sql, handler, 7);
		System.out.println(customer);
	}
	
	@Test
	public void testQueryList() throws SQLException {
		QueryRunner runner = new QueryRunner();
		Connection druidConnection = JDBCUtils.getDruidConnection();
		String sql = "select id, name, email, birth from customers where id > ?";
		BeanListHandler<Customers> handler = new BeanListHandler<>(Customers.class);
		List<Customers> customerList = runner.query(druidConnection, sql, handler, 7);
		customerList.forEach(System.out::println);
	}
	
	@Test
	public void testQueryMap() throws SQLException {
		QueryRunner runner = new QueryRunner();
		Connection druidConnection = JDBCUtils.getDruidConnection();
		String sql = "select id, name, email, birth from customers where id = ?";
		MapHandler mapHandler = new MapHandler();
		Map<String, Object> customerMap = runner.query(druidConnection, sql, mapHandler, 25);
		System.out.println(customerMap);
	}
	
	@Test
	public void testQueryMapList() throws SQLException {
		QueryRunner runner = new QueryRunner();
		Connection druidConnection = JDBCUtils.getDruidConnection();
		String sql = "select id, name, email, birth from customers where id < ?";
		MapListHandler handler = new MapListHandler();
		List<Map<String, Object>> customerList = runner.query(druidConnection, sql, handler, 25);
		customerList.forEach(System.out::println);
	}
	
	@Test
	public void testQueryScalar() throws SQLException {
		QueryRunner runner = new QueryRunner();
		Connection druidConnection = JDBCUtils.getDruidConnection();
		String sql = "select count(*) from customers";
		ScalarHandler scalarHandler = new ScalarHandler();
		
		Long query = (Long) runner.query(druidConnection, sql, scalarHandler);
		System.out.println("一共有" + query + "条记录");
	}
	
	
	/**
	 * 自定义ResultSetHandler实现类
	 * @throws SQLException 
	 */
	@Test
	public void testQueryDIY() throws SQLException {
		QueryRunner runner = new QueryRunner();
		Connection druidConnection = JDBCUtils.getDruidConnection();
		String sql = "select id, name, email, birth from customers where id = ?";
		// 匿名内部类
		ResultSetHandler<Customers> resultSetHandler = new ResultSetHandler<Customers>() {
			/**
			 * handle的返回值，即为query方法的返回值
			**/
			@Override
			public Customers handle(ResultSet rs) throws SQLException {
				if (rs.next()) { // 调用next()方法查看下一行是否有数据
					int id = rs.getInt("id");
					String name = rs.getString("name");
					String email = rs.getString("email");
					Date birth = rs.getDate("birth");
					Customers customer = new Customers(id, name, email, birth);
					return customer;
				}
				return null;
			}
		};
		
		// query的返回值即为ResultSetHandler中handle方法的返回值
		Customers customer = runner.query(druidConnection, sql, resultSetHandler, 25);
		System.out.println(customer);
	}
	
}



