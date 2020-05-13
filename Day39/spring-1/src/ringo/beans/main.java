package ringo.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
	public static void main(String[] args) {
		
//		HelloWorld helloWorld = new HelloWorld();
		
//		helloWorld.setName("lilneng");
		
		// 1. 创建Spring的IOC容器对象
		// ApplicationContext代表IOC容器
		// ClassPathXmlApplicationConetext是ApplicationContext的接口实现类，该实现类从类路径下加载实现类
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// 2. 从IOC容器中获取Bean对象
//		HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloWorld2");
//		HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
		Car car = (Car) ctx.getBean("car2");
		System.out.println(car);
//		Person person = (Person) ctx.getBean("person");
		Person person2 = (Person) ctx.getBean("person2");
		
//		helloWorld.hello();
//		System.out.println(person);
		System.out.println(person2);
	}
}
