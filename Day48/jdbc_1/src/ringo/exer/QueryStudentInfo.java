package ringo.exer;

import java.util.Scanner;

import org.junit.Test;

import ringo.bean.Student;
import ringo.preparedstatement.crud.PreparedStamentQueryTest;

public class QueryStudentInfo {
	@Test
	public void queryStudentInfo() {
		// 输入准考证号或身份证号，查询学生信息
		Scanner sc = new Scanner(System.in);
		System.out.println("请选择您要输入的类型：");
		System.out.println("a.准考证号");
		System.out.println("b.身份证号");
		String num = sc.next();

		if ("a".equalsIgnoreCase(num)) {
			System.out.println("请输入准考证号：");
			// 验证输入的准考证号是否正确
			String cardId = sc.next();
			String sql = "SELECT FlowID as FlowId, Type as levelType, IDCard as idCard, ExamCard as examCard, StudentName as studentName, Location as location, Grade as grade FROM `examstudent`"
							+ " where ExamCard = ?;";
			Student result = new PreparedStamentQueryTest().preparedStamentQuery(Student.class, sql, cardId);
			if (result != null) {
				System.out.println(result);
			} else {
				System.out.println("查无此人，请重新进入程序！");
			}
					
		} else if ("b".equalsIgnoreCase(num)) {
			System.out.println("请输入身份证号：");
		} else {
			System.out.println("您的输入有误请重新进入程序");

		}
	}
}
