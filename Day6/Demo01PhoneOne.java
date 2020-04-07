package ringo.day06.demo02;

public class Demo01PhoneOne {
    public static void main(String[] args) {
        // 创建一个Phone的对象
        Phone one = new Phone();

        System.out.println(one.brand);
        System.out.println(one.color);
        System.out.println(one.price);

        one.call("C罗");
        one.sendMessage();
    }
}
