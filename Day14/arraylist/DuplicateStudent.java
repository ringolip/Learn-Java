package ringo.day14.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

// 去掉重复对象
public class DuplicateStudent {
    public static void main(String[] args) {
        // 创建对象
        Student student1 = new Student("john", 22);
        Student student2 = new Student("ringo", 25);
        Student student3 = new Student("dan", 18);
        Student student4 = new Student("lip", 27);
        Student student5 = new Student("lily", 18);
        Student student6 = new Student("dan", 18);
        Student student7 = new Student("dan", 29);
        
        // 创建集合并加入对象
        ArrayList arrayStudent = new ArrayList();
        arrayStudent.add(student1);
        arrayStudent.add(student2);
        arrayStudent.add(student3);
        arrayStudent.add(student4);
        arrayStudent.add(student5);
        arrayStudent.add(student6);
        arrayStudent.add(student7);

        // 新集合
        ArrayList newArray = new ArrayList();
        // 迭代器
        Iterator ite = arrayStudent.iterator();

        // 遍历
        while (ite.hasNext()) {
            Student student = (Student) ite.next();
            if (newArray.contains(student) == false) {
                newArray.add(student);
            }
    }

        for (int i = 0; i < newArray.size(); i++) {
            Student student = (Student) newArray.get(i);
            System.out.println(student.getName() + " --- " + student.getAge());
        }
    }
}
