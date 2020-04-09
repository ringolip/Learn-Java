package ringo.day10.demo01;

// 2. 实现接口
public class MyInterfaceAbstractImpl implements MyInterfaceAbstract{

    // 3. 读该重写接口的所有抽象方法
    @Override
    public void methodAbs() {
        System.out.println("重写抽象方法");
    }


}
