package ringo.day25.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author ringo
 * @version 1.0
 * @date 2020/4/26 13:32
 */
public class ReflectFunction {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        // 反射获取成员方法并使用
        Class<?> c = Class.forName("ringo.day25.reflect.Student");


        Method functionObject = c.getDeclaredMethod("function");

        Constructor<?> constructor = c.getConstructor();

        Object obj = constructor.newInstance();

        functionObject.setAccessible(true);
        functionObject.invoke(obj);


    }
}

