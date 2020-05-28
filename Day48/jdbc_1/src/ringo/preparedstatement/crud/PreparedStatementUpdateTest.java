package ringo.preparedstatement.crud;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Properties;

import org.junit.Test;

import ringo.util.JDBCUtils;

public class PreparedStatementUpdateTest {
	
	@Test
	public void testCommonUpdate() {
		String sql = "delete from customers where id= ?;";
		update(sql, 3);
	}
	
	
	// 通用的增删改操作
	public int update(String sql, Object... args) {
		Connection conn = null;
		PreparedStatement prepareStatement = null;
		
		try {
			// 1.获取数据库连接
			conn = JDBCUtils.getConnection();
			// 2. 预编译SQL语句，返回PreparedStament
			String sqlString = sql;
			prepareStatement = conn.prepareStatement(sqlString);
			// 3.填充占位符
			for (int i = 0; i < args.length; i++) {
				prepareStatement.setObject(i + 1, args[i]);
			}
			// 4.执行SQL
//			prepareStatement.execute();
			return prepareStatement.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtils.closeResource(conn, prepareStatement);
		}
		
		return 0;
	}

	@Test
	public void testUpdate() {
		// 1.获取数据库的连接
		Connection conn = null;
		PreparedStatement prepareStatement = null;
		try {
			conn = JDBCUtils.getConnection();
			// 2.预编译SQL语句，返回PreparedStatment
			String sql = "update customers set name= ? where id = ?;";
			prepareStatement = conn.prepareStatement(sql);

			// 3.填充占位符
			prepareStatement.setObject(1, "莫扎特");
			prepareStatement.setObject(2, 18);
			// 4.执行
			prepareStatement.execute();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 5.资源的关闭
			JDBCUtils.closeResource(conn, prepareStatement);
		}
	}

	@Test
	public void testInsert() {
		// 1.读取配置文件的4个基本信息
		Connection conn = null;
		PreparedStatement prepareStatement = null;
		try {
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
			conn = DriverManager.getConnection(url, user, password);
			System.out.println(conn);

			// 4. 预编译sql语句，返回PareparedStament的实例
			String sql = "insert into customers(name, email, birth) values(?, ?, ?);";
			prepareStatement = conn.prepareStatement(sql);

			// 5. 填充占位符
			prepareStatement.setString(1, "刘能");
			prepareStatement.setString(2, "lilneng@gmail.com");
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
			java.util.Date date = simpleDateFormat.parse("1991-08-06");
			prepareStatement.setDate(3, new Date(date.getTime()));

			// 6. 执行SQL
			prepareStatement.execute();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 7. 资源的关闭

			try {
				if (prepareStatement != null) // 避免对象没有创建出现异常
					prepareStatement.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
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

	}
}
