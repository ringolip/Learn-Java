package ringo.day10.PC;

public class Laptop {
    // 开机
    public void powerOn(){
        System.out.println("笔记本开机");
    }

    // 关机
    public void powerOff(){
        System.out.println("笔记本关机");
    }

    // 使用USB设备，使用接口作为方法的参数
    public void useDevice(USB usb) {
        usb.openDevice(); // 打开设备

        if (usb instanceof Mouse) {
            // 向下转型
            Mouse mouse = (Mouse) usb;
            mouse.click();
        } else if (usb instanceof KeyBoard) {
            KeyBoard keyboard = (KeyBoard) usb;
            keyboard.type();
        }

        usb.offDevice(); // 关闭设备
    }
}
