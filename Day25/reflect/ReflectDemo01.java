package ringo.day25.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author ringo
 * @version 1.0
 * @date 2020/4/26 11:04
 */
/*
    通过反射实现如下的操作：
        Student s = new Student("林青霞",30,"西安");
        System.out.println(s);
 */

public class ReflectDemo01 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        // 创建Class字节码文件对象
        Class<?> c = Class.forName("ringo.day25.reflect.Student");

        // 通过参数列表创建指定的构造方法对象
        Constructor<?> constructor = c.getConstructor(String.class, int.class, String.class);
        // 创建对象
        Object obj = constructor.newInstance("林青霞", 30, "西安");
        System.out.println(obj);
    }
}
