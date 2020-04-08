package ringo.day07.demo05;

import java.util.ArrayList;

public class Demo02ArrayListStudent {
    public static void main(String[] args) {
        // 自定义四个学生对象，添加到集合，并遍历
        // 1.创建学生对象
        Student student1 = new Student("西光", "Lily", 3);
        Student student2 = new Student("西光", "Amy", 6);
        Student student3 = new Student("黄河", "Robert", 4);
        Student student4 = new Student("华山", "Cole", 1);

        // 2.添加对象到集合
        ArrayList<Student> arr = new ArrayList<>();
        arr.add(student1);
        arr.add(student2);
        arr.add(student3);
        arr.add(student4);

        // 3.遍历集合
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i).getSchool());
            System.out.println(arr.get(i).getName());
            System.out.println(arr.get(i).getGrade());
        }
    }
}
