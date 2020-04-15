package ringo.day14.arraylist;

import java.util.Enumeration;
import java.util.Vector;

// 遍历
public class VectorDemo {
    public static void main(String[] args) {
        // 创建集合对象
        Vector vector = new Vector<>();

        // 创建字符串对象
        String str1 = "hello";
        String str2 = "world";
        String str3 = "java";
        String str4 = "scala";

        // 在集合中加入字符串
        vector.addElement(str1);
        vector.addElement(str2);
        vector.addElement(str3);
        vector.addElement(str4);
        System.out.println(vector);
        // 遍历字符串
        Enumeration en = vector.elements();
        while (en.hasMoreElements()) {
            String str = (String) en.nextElement();
            System.out.println(str);
        }
    }
}
