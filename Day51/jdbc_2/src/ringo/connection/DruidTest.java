package ringo.connection;

import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

import javax.sql.DataSource;

import org.junit.Test;

import com.alibaba.druid.pool.DruidDataSourceFactory;

public class DruidTest {
	@Test
	public void getConnection() throws Exception {
		// 通过配置文件读取配置参数
		Properties prop= new Properties();
		InputStream inStream = ClassLoader.getSystemClassLoader().getResourceAsStream("druid.properties");
		prop.load(inStream);
		
		DataSource source = DruidDataSourceFactory.createDataSource(prop);
		Connection conn = source.getConnection();
		System.out.println(conn);
	}
}
