package ringo.day16.demo01;


import java.util.HashSet;

/**
 * @author ringo
 * @version 1.0
 * @date 2020/4/17 10:44
 */
public class StudentHashSetTest {
    public static void main(String[] args) {
        // 创建HashSet
        HashSet<Student> hashset = new HashSet<Student>();

        // 创建对象
        Student student1 = new Student("ringo", 25, "male");
        Student student2 = new Student("lily", 22, "female");
        Student student3 = new Student("ringo", 25, "male");
        Student student4 = new Student("ringolip", 22, "male");
        Student student5 = new Student("dan", 21, "male");
        Student student6 = new Student("lily", 29, "female");
        Student student7 = new Student("ringo", 25, "male");
        Student student8 = new Student("tom", 25, "male");

        // HashSet中加入对象
        hashset.add(student1);
        hashset.add(student2);
        hashset.add(student3);
        hashset.add(student4);
        hashset.add(student5);
        hashset.add(student6);
        hashset.add(student7);
        hashset.add(student8);

        // 遍历
        for (Student student : hashset) {
            System.out.println(student.getName() + "---" + student.getAge() + "---" + student.getSex());
        }
    }
}
