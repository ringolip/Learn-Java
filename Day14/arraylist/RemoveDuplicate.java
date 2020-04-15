package ringo.day14.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

// 去除集合中字符串的重复值
public class RemoveDuplicate {
    public static void main(String[] args) {

        ArrayList array = new ArrayList();

        // 创建字符串对象
        String str1 = "hello";
        String str2 = "world";
        String str3 = "java";
        String str4 = "scala";
        String str5 = "world";

        // 添加
        array.add(str1);
        array.add(str2);
        array.add(str3);
        array.add(str4);
        array.add(str5);


        // 迭代器
        Iterator ite = array.iterator();

//        ArrayList newArray = new ArrayList();

        // 遍历
//        while (ite.hasNext()) {
//            Object nextElement = ite.next();
//            // indexOf查看列表中是否有该元素
////            if (newArray.indexOf(nextElement) == -1) {
//            if (newArray.contains(nextElement) == false) {
//                    newArray.add(nextElement);
//            }
//        }

        // 使用同一集合来遍历
        for (int i = 0; i < array.size() - 1; i++) {
            for (int j = i + 1; j < array.size(); j++) {
                // 对比集合中的所有元素
                if (array.get(i).equals(array.get(j))) {
                    array.remove(j);
                }
            }
        }
        System.out.println(array);
//        System.out.println(newArray);
    }

}
