package ringo.day13.collection;

import java.util.ArrayList;
import java.util.Collection;

// 使用集合存储学生对象，并进行遍历
public class StoreStudentCollection {
    public static void main(String[] args) {
        // 创建学生对象
        Student student1 = new Student("迪丽热巴", 21);
        Student student2 = new Student("古力娜扎", 20);
        Student student3 = new Student("玛尔扎哈", 22);

        // 存储到集合
        Collection collection = new ArrayList<>();
        collection.add(student1);
        collection.add(student2);
        collection.add(student3);

        // 遍历
        Object[] studentsArray = collection.toArray();
        for (int i = 0; i < studentsArray.length; i++) {
            // 输出学生信息
            Student student = (Student) studentsArray[i];
            System.out.println("姓名：" + student.getName() + " - 年龄" + student.getAge());

        }
    }

}
