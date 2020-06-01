package ringo.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbutils.DbUtils;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.mysql.jdbc.Statement;

import java.sql.Connection;

/**
 * 
 * @Description 操作数据库的工具类
 * @author ringo
 *
 */
public class JDBCUtils {
	public static Connection getConnection() throws IOException, ClassNotFoundException, SQLException {
		// 1.读取配置文件的4个基本信息
		InputStream inputStream = ClassLoader.getSystemClassLoader().getResourceAsStream("jdbc.properties");

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
		return conn;
	}
	
	/**
	 * 使用Druid数据库连接池技术
	 */
	private static DataSource sourceDruid;
	
	static{
		try {
			Properties pros = new Properties();
			
			InputStream is = ClassLoader.getSystemClassLoader().getResourceAsStream("druid.properties");
			
			pros.load(is);
			
			sourceDruid = DruidDataSourceFactory.createDataSource(pros);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getDruidConnection() throws SQLException{
		
		Connection conn = sourceDruid.getConnection();
		return conn;
	}
	
	/**
	 * @Description 关闭连接和Statement操作
	 * @param conn
	 * @param preparedStatement
	 */
	public static void closeResource(Connection conn, PreparedStatement preparedStatement) {
		try {
			if (preparedStatement != null) // 避免对象没有创建出现异常
				preparedStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		try {
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void closeResource(Connection conn, PreparedStatement preparedStatement, ResultSet resultSet) {
		try {
			if (preparedStatement != null) // 避免对象没有创建出现异常
				preparedStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		try {
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			if (resultSet != null)
				resultSet.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	/**
	 * 使用DbUtils关闭资源
	 * @param conn
	 * @param ps
	 * @param rs
	 */
	public static void closeResourceDbUtils(Connection conn, Statement ps, ResultSet rs) {
//		try {
//			DbUtils.close(conn);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		try {
//			DbUtils.close(ps);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		try {
//			DbUtils.close(rs);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		DbUtils.closeQuietly(conn);
		DbUtils.closeQuietly(ps);
		DbUtils.closeQuietly(rs);
	}
	
}
