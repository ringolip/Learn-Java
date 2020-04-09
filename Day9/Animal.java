package ringo.day09.demo11;

// 定义抽象类
public abstract class Animal {
    // 定义构造方法
    public Animal() {
        System.out.println("抽象父类构造方法执行");
    }

    // 定义抽象方法
    public abstract void eat();

    // 普通成员方法
    public void normalMethod() {

    }
}
