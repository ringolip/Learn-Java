package ringo.bean;

public class Student {
	private Integer stuId;
	private String stuName;
	private Integer stuAge;
	public Student() {
		System.out.println("创建对象...");
	}
	public Integer getStuId() {
		return stuId;
	}
	public void setStuId(Integer stuId) {
		this.stuId = stuId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public Integer getStuAge() {
		return stuAge;
	}
	public void setStuAge(Integer stuAge) {
		this.stuAge = stuAge;
	}
	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuName=" + stuName + ", stuAge=" + stuAge + "]";
	}
	
	
	
	
}
