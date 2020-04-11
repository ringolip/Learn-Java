package ringo.day11.demo03;

public class Run {
    public static void main(String[] args) {
        // 创建内部类对象
        Body.Heart heart = new Body().new Heart();
        // 使用内部类对象访问内部类方法
        heart.methodHeart();

        Outer.Inner inner = new Outer().new Inner();
        inner.method();

    }
}
