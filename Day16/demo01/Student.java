package ringo.day16.demo01;

import java.util.Objects;

public class Student implements Comparable<Student> {

    private String name;
    private int age;
    private String sex;

    // 构造方法
    public Student(String name, int chineseScore, int mathScore, int englishScore) {
    }


    public Student(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name) &&
                Objects.equals(sex, student.sex);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age, sex);
    }

    @Override
    public int compareTo(Student o) {
        // 按照姓名长度排序
        int num = this.name.length() - o.name.length();
        int num2 = num == 0 ? (this.age - o.age) : num;
        return num2;
//        int num = this.age - o.age;
//        int num2 = num == 0 ? this.name.compareTo(o.name) : num;
//        return num2;
    }
}
