package ringo.day16.demo01;

import java.util.TreeSet;

/**
 * @author ringo
 * @version 1.0
 * @date 2020/4/17 14:08
 */
public class TreeSetTest {
    public static void main(String[] args) {
//                new TreeSet(Comparator<? super E> comparator);
        TreeSet<Student> treeset = new TreeSet<Student>(new MyComparator());


        Student student1 = new Student("ringo", 25, "male");
        Student student2 = new Student("lily", 22, "female");
        Student student3 = new Student("ringo", 25, "male");
        Student student4 = new Student("ringolip", 22, "male");
        Student student5 = new Student("dan", 21, "male");
        Student student6 = new Student("lily", 29, "female");
        Student student7 = new Student("ringo", 25, "male");
        Student student8 = new Student("tom", 25, "male");

        treeset.add(student1);
        treeset.add(student2);
        treeset.add(student3);
        treeset.add(student4);
        treeset.add(student5);
        treeset.add(student6);
        treeset.add(student7);
        treeset.add(student8);


        for (Student student : treeset) {
            System.out.println(student.getName() + " --- " + student.getAge());
        }
    }
}
