package ringo.day11.demo03;

public class Outer {
    // 外部类成员变量
    int num = 30;

    // 内部类
    public class Inner {
        // 内部类成员变量
        int num = 20;

        public void method() {
            // 局部变量
            int num = 10;

            System.out.println(num);
            System.out.println(this.num);
            System.out.println(Outer.this.num);
        }
    }
}
