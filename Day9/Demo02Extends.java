package ringo.day09.demo01;

public class Demo02Extends {
    public static void main(String[] args) {
        // 创建一个Teacher类对象
        Teacher teacher1 = new Teacher();
        // 调用父类方法
        teacher1.method();

        Assistant assistant = new Assistant();
        assistant.method();
    }
}
