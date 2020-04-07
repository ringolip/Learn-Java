package ringo.day06.demo04;

public class Student {
    private int age;
    String name;

    // 创建无参数构造方法
    public Student(){
        System.out.println("无参数构造方法执行啦");
    }
    public Student(int age, String name){
        System.out.println("有参数构造方法执行啦");
        this.age = age;
        this.name = name;
    }
}
