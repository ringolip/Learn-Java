package ringo.day13.collection;

import java.util.ArrayList;

public class StoreStudentInformation {
    // 5个学生的信息，把5个学生的信息存储到数组中，遍历数组，获取每个学生的信息
    public static void main(String[] args) {
        // 创建学生对象
        Student student1 = new Student("迪丽热巴", 21);
        Student student2 = new Student("古力娜扎", 20);
        Student student3 = new Student("玛尔扎哈", 22);

        // 数组
        ArrayList<Student> arrayStudent = new ArrayList<>();

        // 存储学生对象到数组
        arrayStudent.add(student1);
        arrayStudent.add(student2);
        arrayStudent.add(student3);

        // 遍历数组，获取每个学生的信息
        for (int i = 0; i < arrayStudent.size(); i++) {
            Student student = arrayStudent.get(i);
            System.out.println("姓名：" + student.getName() + "，年龄：" + student.getAge());
        }
    }

}
