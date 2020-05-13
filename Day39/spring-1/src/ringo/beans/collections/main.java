package ringo.beans.collections;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Person person = (Person) ctx.getBean("person3");
		
		System.out.println(person);
		
		NewPerson newPerson = (NewPerson) ctx.getBean("newperson");
		System.out.println(newPerson);
		
		DataSource dataSource = (DataSource) ctx.getBean("dataSource");
		System.out.println(dataSource.getProperties());
		
		Person person5 = (Person) ctx.getBean("person5");
		System.out.println(person5);
		
	}
}
