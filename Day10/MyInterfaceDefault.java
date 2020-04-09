package ringo.day10.demo01;

//
public interface MyInterfaceDefault {
    // 抽象方法
    public abstract void methodAbs();

    // 新添加的默认方法
    public default void methodDefault() {
        System.out.println("这是新添加的默认方法");
    }

}
