package ringo.beans;

import javax.sound.midi.Soundbank;

public class Person {
	private String name;
	private int age;
	
	private Car car;
	
	public Person() {
		System.out.println("执行Person的无参构造方法...");
	}

	
	public Person(String name, int age, Car car) {
		super();
		this.name = name;
		this.age = age;
		this.car = car;
		System.out.println("执行Person的有参构造方法...");
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", car=" + car + "]";
	}
	
}
