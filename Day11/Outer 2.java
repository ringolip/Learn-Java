package ringo.day11.demo04;

public class Outer {

    // 外部类成员方法
    public void methodOuter() {
        // 定义局部内部类
        class Inner {
            int num = 0;
            // 内部类成员方法
            public void methodInner() {
                System.out.println("局部内部类");
                System.out.println(num);
            }
        }

        // 访问局部内部类
        Inner inner = new Inner();
        inner.methodInner();
    }
}
