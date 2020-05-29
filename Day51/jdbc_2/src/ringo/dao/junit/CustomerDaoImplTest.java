package ringo.dao.junit;

import java.sql.Connection;
import java.sql.Date;
import java.util.List;

import org.junit.Test;

import ringo.bean.Customers;
import ringo.dao.CustomerDaoImpl;
import ringo.util.JDBCUtils;

public class CustomerDaoImplTest {
	
	private CustomerDaoImpl dao  = new CustomerDaoImpl();
	
	@Test
	public void testInsert() {
		Connection conn = null;
		try {
			conn = JDBCUtils.getConnection();
			Customers cust = new Customers(1, "广坤", "guangkun@gmail.com", new Date(14213123213L));

			dao.insert(conn, cust);
			System.out.println("添加成功");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtils.closeResource(conn, null);
		}
		
	}

	@Test
	public void testUpdateConnectionCustomers() {
		Connection conn = null;
		try {
			conn = JDBCUtils.getConnection();
			Customers cust = new Customers(18, "贝多芬", "dofen@gmail.com", new Date(14213123213L));

			dao.update(conn, cust);
			System.out.println("修改成功");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtils.closeResource(conn, null);
		}
	}

	@Test
	public void testDeleteById() {
		Connection conn = null;
		try {
			conn = JDBCUtils.getConnection();

			dao.deleteById(conn, 21);
			System.out.println("删除成功");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtils.closeResource(conn, null);
		}
	}

	@Test
	public void testGetCustomerById() {
		Connection conn = null;
		try {
			conn = JDBCUtils.getConnection();

			Customers customer = dao.getCustomerById(conn, 5);
			System.out.println(customer);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtils.closeResource(conn, null);
		}
	}

	@Test
	public void testGetAll() {
		Connection conn = null;
		try {
			conn = JDBCUtils.getConnection();

			List<Customers> all = dao.getAll(conn);
			all.forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtils.closeResource(conn, null);
		}
	}

	@Test
	public void testGetCount() {
		Connection conn = null;
		try {
			conn = JDBCUtils.getConnection();

			Long count = dao.getCount(conn);
			System.out.println("表中的记录数为：" + count);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtils.closeResource(conn, null);
		}
	}

	@Test
	public void testGetMaxBirth() {
		Connection conn = null;
		try {
			conn = JDBCUtils.getConnection();

			Date maxBirth = dao.getMaxBirth(conn);
			System.out.println("最大的生日为：" + maxBirth);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtils.closeResource(conn, null);
		}
	}

}
