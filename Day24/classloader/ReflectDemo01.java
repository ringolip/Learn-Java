package ringo.day24.classloader;

import java.lang.reflect.Constructor;

/**
 * @author ringo
 * @version 1.0
 * @date 2020/4/25 11:08
 */

public class ReflectDemo01 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        // 获取Class对象
        Class<?> c = Class.forName("ringo.day24.classloader.Student");

        // 返回该类公共构造方法的数组
        Constructor<?>[] constructors = c.getConstructors();
        for (Constructor con : constructors) {
            System.out.println(con);
        }

        System.out.println("==================");

        // 返回所有构造方法对象的数组
        Constructor<?>[] declaredConstructors = c.getDeclaredConstructors();
        for (Constructor con : declaredConstructors) {
            System.out.println(con);
        }


    }
}
