package ringo.day25.reflectconfig;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author ringo
 * @version 1.0
 * @date 2020/4/26 14:45
 */

/*
    练习2：通过配置文件运行类中的方法
 */

public class ReflectConfig {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        // 创建集合对象
        Properties properties = new Properties();
        // 创建字节流对象
        FileReader fileReader = new FileReader("day25-class/src/ringo/day25/reflectconfig/config.txt");
        // 从输入字节流读取属性列表
        properties.load(fileReader);
        // 关闭字节流
        fileReader.close();

        // 获取配置文件中的值
        String className = properties.getProperty("className");
        String methodName = properties.getProperty("methodName");

        // 反射
        Class<?> c = Class.forName(className);
        Constructor<?> constructor = c.getConstructor();

        Object obj = constructor.newInstance();

        Method declaredMethod = c.getDeclaredMethod(methodName);

        declaredMethod.invoke(obj);

    }
}
