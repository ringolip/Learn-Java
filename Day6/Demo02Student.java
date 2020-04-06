package ringo.day06.demo01;

public class Demo02Student {
    public static void main(String[] args) {
        // 导包
        // 创建对象
        Student student = new Student();
        // 使用
        System.out.println(student.age);
        System.out.println(student.name);

        // 改变对象中成员变量内容
        student.age = 25;
        student.name = "ringo";

        System.out.println(student.age);
        System.out.println(student.name);

        student.eat();
        student.sleep();
        student.study();
    }
}
