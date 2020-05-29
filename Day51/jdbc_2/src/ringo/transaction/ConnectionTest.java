package ringo.transaction;

import java.sql.Connection;

import org.junit.Test;

import ringo.util.JDBCUtils;

public class ConnectionTest {
	
	@Test
	public void testGetConnection() throws Exception{
		Connection conn = JDBCUtils.getConnection();
		System.out.println(conn);
		
	}
}
