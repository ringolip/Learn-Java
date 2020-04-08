package ringo.day08.demo01;

public class Demo01String {
    // 三种构造方法创建String对象
    public static void main(String[] args) {
        // 1.直接创建空字符串
        String string1 = new String();
        System.out.println(string1);

        // 2.使用字符数组创建
        char[] ch = {'a', 'b', 'c'};
        String string2 = new String(ch);
        System.out.println(string2);

        // 3.使用字节数组创建
        byte[] by = {89, 90, 91};
        String string3 = new String(by);
        System.out.println(string3);
    }

}
