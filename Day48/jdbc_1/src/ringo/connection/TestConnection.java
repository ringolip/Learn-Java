package ringo.connection;

import static org.hamcrest.CoreMatchers.nullValue;

import java.io.IOException;
import java.io.InputStream;
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
	
	@Test
	public void testConnection4() throws Exception {
		// 1.提供三个连接对象的基本信息
		String url = "jdbc:mysql://localhost:3306/test";
		String user = "root";
		String password = "ringo";
		
		// 2.获取Driver实现类的对象
		Class.forName("com.mysql.jdbc.Driver");
//		Driver driver = (Driver) classDriver.newInstance(); // 实例化对象
//		// 注册驱动
//		DriverManager.registerDriver(driver);
		
		// 3.获取连接
		Connection conn = DriverManager.getConnection(url, user, password);
		System.out.println(conn);
		
	}
	
	// 最终版
	// 将数据库连接需要的4个基本信息声明在配置文件中，通过读取配置文件的方式，获取链接
	
	/**
	 * 实现了数据与代码的分离，实现了解耦
	 */
	@Test
	public void testConnection5() throws IOException, ClassNotFoundException, SQLException {
		// 1.读取配置文件的4个基本信息
		InputStream inputStream = TestConnection.class.getClassLoader().getResourceAsStream("jdbc.properties");
		
		Properties properties = new Properties();
		properties.load(inputStream);
		
		String user = properties.getProperty("user");
		String password = properties.getProperty("password");
		String url = properties.getProperty("url");
		String classDriver = properties.getProperty("classDriver");
		
		// 2.加载驱动
		Class.forName(classDriver);
		
		// 3. 获取连接
		Connection conn = DriverManager.getConnection(url, user, password);
		System.out.println(conn);
		
	}
	
	
	
}
