package ringo.day07.demo05;

public class Student {
    // Student类
    private String school;
    private String name;
    private int grade;

    // 构造方法
    public Student() {
    }

    public Student(String school, String name, int grade) {
        this.school = school;
        this.name = name;
        this.grade = grade;
    }

    // Setter & Getter

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
