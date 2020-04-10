package ringo.day10.PC;

// 鼠标就是一种USB设备
public class Mouse implements USB{


    @Override
    public void openDevice() {
        System.out.println("打开鼠标");
    }

    @Override
    public void offDevice() {
        System.out.println("关闭鼠标");
    }

    public void click() {
        System.out.println("点击鼠标");
    }
}
