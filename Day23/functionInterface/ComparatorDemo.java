package ringo.day23.functionInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author ringo
 * @version 1.0
 * @date 2020/4/24 16:06
 */
//定义一个类(ComparatorDemo)，在类中提供两个方法
//        一个方法是：Comparator<String> getComparator()   方法返回值Comparator是一个函数式接口
//        一个方法是主方法，在主方法中调用getComparator方法
public class ComparatorDemo {
    public static void main(String[] args) {
        //定义集合，存储字符串元素
        ArrayList<String> array = new ArrayList<String>();

        array.add("cccc");
        array.add("aa");
        array.add("b");
        array.add("ddd");

        System.out.println("排序前：" + array);

//        Collections.sort(array);
        Collections.sort(array, getComparator());

        System.out.println("排序后：" + array);
    }

    private static Comparator<String> getComparator() {

//        Comparator<String> stringComparator = new Comparator<>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length() - o2.length();
//            }
//        };
//        return stringComparator;

        // lambda
        return (s1, s2) -> s1.length() - s2.length();


    }

}
