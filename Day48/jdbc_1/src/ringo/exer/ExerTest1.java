package ringo.exer;

import java.util.Scanner;

import org.junit.Test;

import ringo.preparedstatement.crud.PreparedStatementUpdateTest;

public class ExerTest1 {
	@Test
	public void testInsert() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入用户名：");
		String username = scanner.next();
		System.out.println("输入邮箱：");
		String email = scanner.next();
		
		String sql = "insert into customers (name, email) values (?, ?);";
		
		PreparedStatementUpdateTest statement = new PreparedStatementUpdateTest();
		statement.update(sql, username, email);
	}
}
