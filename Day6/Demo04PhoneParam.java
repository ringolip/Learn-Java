package ringo.day06.demo02;

public class Demo04PhoneParam {

    public static void main(String[] args) {
        Phone one = new Phone();
        one.brand = "Sumsung";
        one.price = 5999.0;

        method(one);

    }

    // 将对象作为方法的参数
    public static void method(Phone param) {
        System.out.println("将对象作为方法的参数");
        System.out.println(param.brand);
        System.out.println(param.price);
    }
}
