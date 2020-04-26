package ringo.day25.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author ringo
 * @version 1.0
 * @date 2020/4/26 13:50
 */
public class ReflectDemo04 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> c = Class.forName("ringo.day25.reflect.Student");

        // method1
        Method method1 = c.getDeclaredMethod("method1");
        // method2
        Method method2 = c.getDeclaredMethod("method2", String.class);
        //method3
        Method method3 = c.getDeclaredMethod("method3", String.class, int.class);

        Constructor<?> declaredConstructor = c.getDeclaredConstructor();

        Object obj = declaredConstructor.newInstance();

        method1.invoke(obj);
        method2.invoke(obj, "林青霞");
        Object obj3 = method3.invoke(obj, "林青霞", 30);
        System.out.println(obj3);



    }
}
