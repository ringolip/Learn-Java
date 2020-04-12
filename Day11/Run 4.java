package ringo.day11.demo05;

public class Run {
    public static void main(String[] args) {
        // 使用接口对象
        MyInterface interfaceObj = new MyInterface() {

            @Override
            public void method() {
                System.out.println("匿名内部类实现了方法");
            }
        };
        interfaceObj.method();
    }
}
