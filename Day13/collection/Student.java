package ringo.day13.collection;

public class Student {
    /*
        学生：Student
        成员变量：name，age
        构造方法：无参数，带参数
        成员方法：Getter，Setter
    */
    private String name;
    private int age;

    // 构造方法
    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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


}
