package ringo.day25.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * @author ringo
 * @version 1.0
 * @date 2020/4/26 11:58
 */
public class ReflectDemo03 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        // 创建Class字节码文件对象
        Class<?> c = Class.forName("ringo.day25.reflect.Student");
        // 指定成员变量创建成员变量对象
        Field address = c.getDeclaredField("address");
        Field name = c.getDeclaredField("name");
        Field age = c.getDeclaredField("age");
        // 创建构造方法对象
        Constructor<?> constructor = c.getConstructor(); // 无参构造方法对象
        // 创建实例对象
        Object obj = constructor.newInstance();

        // 为成员变量对象赋值
        address.set(obj, "西安");
        name.setAccessible(true);
        name.set(obj, "ringo");
        age.setAccessible(true);
        age.set(obj, 25);

        System.out.println(obj);
    }
}
