package ringo.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ringo.bean.Airplain;
import ringo.bean.Person;
import ringo.bean.Student;

public class SpringTest {
	//1.创建IOC容器对象
	ApplicationContext iocContainer = 
			new ClassPathXmlApplicationContext("ioc2.xml");

//	@Test
//	public void test() {
		//2.根据id值获取bean实例对象
//		Student student = (Student) iocContainer.getBean("student01");
//		Person person01 = (Person) iocContainer.getBean("person01");

		//3.打印bean
//		System.out.println(student);
//		System.out.println(person01);
//	}
	
//	@Test
//	public void test07() {
//		Person person02 = (Person) iocContainer.getBean("person02");
//		System.out.println(person02);
//	}
	
//	@Test
//	public void test09() {
//		Person bean3 = (Person) iocContainer.getBean("person02");
//		Person bean4 = (Person) iocContainer.getBean("person02");
//		System.out.println(bean3 == bean4);
//
//		Student bean = (Student) iocContainer.getBean("student01");
//		Student bean2 = (Student) iocContainer.getBean("student01");
//		System.out.println(bean == bean2);
//
//	}
	
	@Test
	public void test05() {
		// 使用静态工厂方法创建bean对象
//		Airplain bean = (Airplain) iocContainer.getBean("airplain01");
//		System.out.println(bean);
//		Airplain bean2 = (Airplain) iocContainer.getBean("airplain02");
//		System.out.println(bean2);
		Airplain bean3 = (Airplain) iocContainer.getBean("myFactoryBeanImpl");
		System.out.println(bean3);
	}
	
}





