package ringo.day13.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

// 测试Collection的方法
public class CollectionDemo {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        Collection collection1 = new ArrayList();

        // add
        collection.add("hello");
        collection.add("world");
        collection.add("java");
        collection.add("java");
        collection.add("java");
        collection.add("java");
        System.out.println(collection);

        collection1.add("java");

        // clear
//        collection.clear();
//        System.out.println(collection);

        // remove
        collection.remove("hello");
        System.out.println(collection);

        // contains
        System.out.println(collection.contains("hello"));
        System.out.println(collection.contains("world"));

        // removeAll
        System.out.println(collection);
//        collection.removeAll(collection1);
//        System.out.println(collection);

        // toArray
        // 遍历集合
        Object[] object = collection.toArray();
        for (int i = 0; i < object.length; i++) {
            System.out.print(object[i] + "---");
            // 向下转型
            String str = (String) object[i];
            System.out.println(str.length());
        }

        // Iterator迭代器
        Iterator ite = collection.iterator();
        while (ite.hasNext() == true) {
            String str = (String) ite.next();
            System.out.print(str);
            System.out.println("---"+str.length());
        }


    }
}
