package ringo.beans;

public class HelloWorld {
	
	private String name;
	
	public void setName(String name) {
		System.out.println("setName: " + name);
		this.name = name;
	}
	
	public void hello() {
		System.out.println("hello: " + name);
	}
	
	/**
	 * 无参构造方法
	 */
	public HelloWorld() {
		System.out.println("HelloWorld's Constructor...");
	}
}
