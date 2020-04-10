package ringo.day10.PC;

public class Interactive {
    public static void main(String[] args) {

        Laptop laptop = new Laptop();

        laptop.powerOn();

        // 使用USB设备
        USB mouse = new Mouse();
        laptop.useDevice(mouse);

        KeyBoard keyboard = new KeyBoard();
        // 向上自动类型转换
        System.out.println(keyboard instanceof USB);

        laptop.useDevice(keyboard);

        laptop.powerOff();


    }
}
