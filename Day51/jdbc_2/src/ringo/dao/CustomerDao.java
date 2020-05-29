package ringo.dao;

import java.sql.Connection;
import java.sql.Date;
import java.util.List;

import ringo.bean.Customers;

/**
 * 此接口用于规范针对于Customer表的常用操作
 * @author ringo
 *
 */
public interface CustomerDao {
	
	/**
	 * @Description 将cust对象添加到数据库中
	 * @param conn
	 * @param cust
	 */
	void insert(Connection conn, Customers cust);
	
	/**
	 * @Description 根据cust对象，修改数据库的记录
	 * @param conn
	 * @param cust
	 */
	void update(Connection conn, Customers cust);
	
	/**
	 * @Description 根据指定id，删除数据库中的一行记录
	 * @param conn
	 * @param id
	 */
	void deleteById(Connection conn, int id);
	
	/**
	 * @Description 根据指定id，返回对应的Customers对象
	 * @param conn
	 * @param id
	 * @return
	 */
	Customers getCustomerById(Connection conn, int id);
	
	/**
	 * @Description 返回表中所有记录构成的集合
	 * @param conn
	 * @return
	 */
	List<Customers> getAll(Connection conn);
	
	/**
	 * @Description 返回表中数据的条目数
	 * @param conn
	 * @return
	 */
	Long getCount(Connection conn);
	
	/**
	 * @Description 返回数据表中最大的生日
	 * @param conn
	 * @return
	 */
	Date getMaxBirth(Connection conn);
	
}
