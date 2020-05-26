package ringo.connection;

import static org.hamcrest.CoreMatchers.nullValue;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.junit.Test;



public class TestConnection {
	@Test
	public void testConnection() throws SQLException {
		Driver driver = new com.mysql.jdbc.Driver();
		
		String url = "jdbc:mysql://localhost:3306/test";
		
		Properties info = new Properties();
		info.setProperty("user", "root");
		info.setProperty("password", "ringo");
		
		Connection conn = driver.connect(url, info);
		System.out.println(conn);
	}
	
	@Test
	public void testConnection2() throws Exception {
//		通过反射获取实现类对象，不出现第三方API
		Class classDriver = Class.forName("com.mysql.jdbc.Driver");
		Driver driver = (Driver) classDriver.newInstance(); // 实例化对象
		
		String url = "jdbc:mysql://localhost:3306/test";
		
		Properties info = new Properties();
		info.setProperty("user", "root");
		info.setProperty("password", "ringo");
		
		Connection conn = driver.connect(url, info);
		System.out.println(conn);
	}
	
	@Test
	public void testConnection3() throws Exception {
//		通过反射获取实现类对象，不出现第三方API
		Class classDriver = Class.forName("com.mysql.jdbc.Driver");
		Driver driver = (Driver) classDriver.newInstance(); // 实例化对象
		
		String url = "jdbc:mysql://localhost:3306/test";
		String user = "root";
		String password = "ringo";
		
		DriverManager.registerDriver(driver);
		Connection conn = DriverManager.getConnection(url, user, password);
		System.out.println(conn);
		
	}
	
}
