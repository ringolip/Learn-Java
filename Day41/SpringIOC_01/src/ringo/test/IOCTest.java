package ringo.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ringo.beans.Person;

public class IOCTest {
	ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");

	@Test
	public void test() {
//		Person bean = (Person) ioc.getBean("person01");
//		System.out.println(bean);
		
	}

}


