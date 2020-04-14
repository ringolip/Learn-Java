package ringo.day13.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

// 使用集合存储学生对象，并用迭代器进行遍历
public class StoreStudentIterator {
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

        // 使用迭代器进行遍历
        Iterator ite = collection.iterator();
        while (ite.hasNext() == true) {
//            Object object = ite.next();
//            Student student = (Student) object;
//            System.out.println("姓名：" + student.getName() + " - 年龄：" + student.getAge());
            System.out.println("姓名：" + ((Student) ite.next()).getName() + " - 年龄" + ((Student) ite.next()).getAge());
        }

//        // for循环遍历，更好的回收资源
//        for (Iterator ite = collection.iterator(); ite.hasNext() == true;) {
//            Object object = ite.next();
//            Student student = (Student) object;
//            System.out.println("姓名：" + student.getName() + " - 年龄：" + student.getAge());
//        }
    }
}
