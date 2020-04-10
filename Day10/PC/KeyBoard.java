package ringo.day10.PC;

// 键盘就是一种USB设备
public class KeyBoard implements USB{


    @Override
    public void openDevice() {
        System.out.println("打开键盘");
    }

    @Override
    public void offDevice() {
        System.out.println("关闭键盘");
    }

    public void type() {
        System.out.println("键盘输入");
    }
}
