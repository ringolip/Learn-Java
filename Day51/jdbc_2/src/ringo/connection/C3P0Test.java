package ringo.connection;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;

import org.junit.Test;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class C3P0Test {
	@Test
	public void testGetConnection() throws PropertyVetoException, SQLException {
		// 获取C3P0数据库连接池
		ComboPooledDataSource cpds = new ComboPooledDataSource();
		
		cpds.setDriverClass( "com.mysql.jdbc.Driver" ); //loads the jdbc driver            
		cpds.setJdbcUrl( "jdbc:mysql://localhost:3306/test" );
		cpds.setUser("root");                                  
		cpds.setPassword("ringo"); 
		
		// 通过设置相关的参数，对数据库连接池进行管理
		// 设置初始时数据库连接池的连接数
		cpds.setInitialPoolSize(10);
		
		Connection conn = cpds.getConnection();
		System.out.println(conn);
	}
	
	@Test
	public void testGetConnection1() throws SQLException {
		ComboPooledDataSource cpds = new ComboPooledDataSource("helloc3p0");  
		Connection conn = cpds.getConnection();
		System.out.println(conn);
	}
}
