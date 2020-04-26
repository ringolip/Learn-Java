package ringo.day25.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * @author ringo
 * @version 1.0
 * @date 2020/4/26 14:19
 */
/*
    练习1：我有一个ArrayList<Integer>集合，现在我想在这个集合中添加一个字符串数据，如何实现？
 */
public class ReflectArrayList {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);

        Class<? extends ArrayList> c = arrayList.getClass();

        Method addObject = c.getDeclaredMethod("add", Object.class);

        addObject.invoke(arrayList,"hello");
        addObject.invoke(arrayList, "world");
        addObject.invoke(arrayList, "java");
        System.out.println(arrayList);
    }
}
