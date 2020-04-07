package ringo.day06.demo02;

public class Demo05PhoneReturn {
    public static void main(String[] args) {
        Phone two = object();
        System.out.println(two.price);
    }

    // 将对象作为方法的返回值
    public static Phone object() {
        Phone one = new Phone();
        one.price = 8848.0;

        return one;
    }
}
