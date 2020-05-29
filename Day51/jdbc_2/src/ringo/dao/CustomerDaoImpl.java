package ringo.dao;

import java.sql.Connection;
import java.sql.Date;
import java.util.List;

import ringo.bean.Customers;

public class CustomerDaoImpl extends BaseDao<Customers> implements CustomerDao{ // 指明操作表对应的类

	@Override
	public void insert(Connection conn, Customers cust) {
		String sql = "insert into customers (name, email, birth)"
				+ "values(?, ?, ?)";;
		update(conn, sql, cust.getName(), cust.getEmail(), cust.getBirth());
	}

	@Override
	public void update(Connection conn, Customers cust) {
		String sql = "update customers set name = ?, email = ?, birth = ?"
				+ "where id= ?;";
		update(conn, sql, cust.getName(), cust.getEmail(), cust.getBirth(), cust.getId());
		
	}

	@Override
	public void deleteById(Connection conn, int id) {
		String sql = "delete from customers where id = ?;";
		update(conn, sql, id);
	}

	@Override
	public Customers getCustomerById(Connection conn, int id) {
		String sql = "select id,name,email,birth from customers where id = ?;";
		Customers bean = getBean(conn, sql, id); // 去除类的参数
		return bean;
	}

	@Override
	public List<Customers> getAll(Connection conn) {
		String sql = "select id, name, email, birth from customers;";
		List<Customers> beanList = getBeanList(conn, sql);
		return beanList;
	}

	@Override
	public Long getCount(Connection conn) {
		String sql = "select count(*) from customers;";
		return getValue(conn, sql);
	}

	@Override
	public Date getMaxBirth(Connection conn) {
		String sql = "select max(birth) from customers;";
		return getValue(conn, sql);
	}

}
