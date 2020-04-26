package ringo.day25.reflectconfig;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @author ringo
 * @version 1.0
 * @date 2020/4/26 19:39
 */
@Pro(className = "ringo.day25.reflectconfig.Teacher", methodName = "teach")
public class ReflectConfig02 {
    public static void main(String[] args) {
        //1.获取注释对象
        Class<ReflectConfig02> c = ReflectConfig02.class;
        Pro annotation = c.getAnnotation(Pro.class); // 其实就是在内存中生成一个该注解接口的实现类对象

        //2.调用注释对象抽象方法，获取返回值
        String classString = annotation.className();
        String methodString = annotation.methodName();

        System.out.println(classString);
        System.out.println(methodString);


    }
}
