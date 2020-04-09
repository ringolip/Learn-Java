package ringo.day10.demo01;

public class Demo01Interface {

    public static void main(String[] args) {
        // 4. 创建实现类的对象进行使用
        MyInterfaceAbstractImpl impl = new MyInterfaceAbstractImpl();
        impl.methodAbs();
    }
}
