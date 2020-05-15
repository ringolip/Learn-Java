package ringo.bean;

public class Person {
	private String lastName;
	private Integer age;
	private String gender;
	private String email;
	
	public Person() {
		System.out.println("创建person对象");
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
		System.out.println("创建对象lastName属性" + lastName);
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Person [lastName=" + lastName + ", age=" + age + ", gender=" + gender + ", email=" + email + "]";
	}
	
}
