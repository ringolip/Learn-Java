package ringo.day16.demo01;

import java.util.Comparator;

/**
 * @author ringo
 * @version 1.0
 * @date 2020/4/17 16:29
 */
public class MyComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
//        return 0;
        int num = o1.getName().length() - o2.getName().length();
        int num2 = num == 0 ? (o1.getAge() - o2.getAge()) : num;
        return num2;
    }
}
