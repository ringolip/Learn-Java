package ringo.day15.set;

import java.util.HashSet;
import java.util.Set;

/**
 * @author ringo
 * @version 1.0
 * @date 2020/4/16 18:06
 */
public class SetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("hello");
        set.add("world");
        set.add("java");

        for (String str : set) {
            System.out.println(str);
        }

    }
}
