package ringo.util;

import java.sql.Connection;
import java.sql.SQLException;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class C3P0Utils {
	public static Connection getConnection() throws SQLException {
		ComboPooledDataSource cpds = new ComboPooledDataSource("helloc3p0");  
		Connection conn = cpds.getConnection();
		
		return conn;
	}
}
