package ringo.day15.demo01;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author ringo
 * @version 1.0
 * @date 2020/4/16 10:42
 */

// 集合的嵌套
public class CollectionNesting {
    public static void main(String[] args) {
        // 大集合
        ArrayList<ArrayList<Student>> bigArray = new ArrayList<ArrayList<Student>>();
        // 小集合
        ArrayList<Student> studentArray1 = new ArrayList<Student>();
        ArrayList<Student> studentArray2 = new ArrayList<Student>();
        ArrayList<Student> studentArray3 = new ArrayList<Student>();
        ArrayList<Student> studentArray4 = new ArrayList<Student>();

        // 创建学生对象
        Student student1 = new Student("ringo", 22);
        Student student2 = new Student("lily", 24);
        Student student3 = new Student("tom", 23);
        Student student4 = new Student("tim", 22);
        Student student5 = new Student("lisa", 29);
        Student student6 = new Student("lip", 27);
        Student student7 = new Student("cris", 42);
        Student student8 = new Student("buffon", 41);
        Student student9 = new Student("dybala", 27);
        Student student10 = new Student("ben", 32);

        // 对象加入集合
        studentArray1.add(student1);
        studentArray1.add(student2);
        studentArray1.add(student3);
        studentArray2.add(student4);
        studentArray2.add(student5);
        studentArray2.add(student6);
        studentArray3.add(student7);
        studentArray3.add(student8);
        studentArray4.add(student9);
        studentArray4.add(student10);

        // 对象集合加入大集合
        bigArray.add(studentArray1);
        bigArray.add(studentArray2);
        bigArray.add(studentArray3);
        bigArray.add(studentArray4);

        // 增强for遍历集合
        for (ArrayList<Student> array : bigArray) {
            for (Student student : array) {
                System.out.println(student.getName() + " --- " + student.getAge());
            }
        }

    }
}
