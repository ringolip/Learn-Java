package ringo.bean;

import java.sql.Date;

/**
 * ORM
 * 一张表对应一个类
 * 一列对应一个属性
 * 一行对应一个对象
 * @author ringo
 *
 */
public class Customers {
//	  `id` int(10) NOT NULL AUTO_INCREMENT,
//	  `name` varchar(15) DEFAULT NULL,
//	  `email` varchar(20) DEFAULT NULL,
//	  `birth` date DEFAULT NULL,
//	  `photo` mediumblob,
	private int id;
	private String name;
	private String email;
	private Date birth;
	
	public Customers() {
		super();
	}

	public Customers(int id, String name, String email, Date birth) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.birth = birth;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	@Override
	public String toString() {
		return "Customers [id=" + id + ", name=" + name + ", email=" + email + ", birth=" + birth + "]";
	}
	
	
}