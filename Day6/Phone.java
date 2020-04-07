package ringo.day06.demo02;

public class Phone {
    // 定义一个类，用来模拟"手机"事物

    // 成员变量
    String brand;
    double price;
    String color;

    // 成员方法
    public void call(String who) {
        System.out.println("打给" + who);
    }

    public void sendMessage(){
        System.out.println("群发短信");
    }
}
