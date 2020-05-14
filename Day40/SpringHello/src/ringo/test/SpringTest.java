package ringo.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ringo.bean.Student;

public class SpringTest {

	@Test
	public void test() {
		//1.创建IOC容器对象
		ApplicationContext iocContainer = 
				new ClassPathXmlApplicationContext("ioc.xml");
		System.out.println("容器创建完成");

		//2.根据id值获取bean实例对象
		Student student = (Student) iocContainer.getBean("student01");
		
		//3.打印bean
		System.out.println(student);
	}

}
