package ringo.day09.demo11;

public class Cat extends Animal{

    // 子类构造方法
    public Cat(){
        System.out.println("子类构造方法执行");
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}
