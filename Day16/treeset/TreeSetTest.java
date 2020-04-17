package ringo.day16.treeset;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * 键盘录入5个学生信息（姓名，语文成绩，数学成绩，英语成绩），按照总分从低到高输出到控制台
 *
 * @author ringo
 * @version 1.0
 * @date 2020/4/17 20:50
 */
public class TreeSetTest {
    public static void main(String[] args) {
        // 创建一个集合类
        TreeSet<Student> set = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                // 按照总分排序
                int num = o1.getSum() - o2.getSum();
                // 总分相同，按照语文成绩排序
                int num2 = num == 0 ? o1.getChineseScore() - o2.getChineseScore() : num;
                int num3 = num2 == 0 ? o1.getMathScore() - o2.getMathScore() : num2;
                int num4 = num3 == 0 ? o1.getEnglishScore() - o2.getEnglishScore() : num3;
                // 全都相同，比较姓名
                int num5 = num4 == 0 ? o1.getName().compareTo(o2.getName()) : num4;
                return num5;
            }
        });

        // 键盘录入5个学生信息
        Scanner sc = new Scanner(System.in);
        // 姓名
        String name;
        // 语文
        int chineseScore;
        // 数学
        int mathScore;
        // 英语
        int englishScore;

        for (int i = 1; i <= 5; i++) {
            System.out.println("输入姓名" + i);
            name = sc.nextLine();

            System.out.println("输入语文分数");
            chineseScore = Integer.parseInt(sc.nextLine());

            System.out.println("输入数学分数");
            mathScore = Integer.parseInt(sc.nextLine());

            System.out.println("输入英语分数");
            englishScore = Integer.parseInt(sc.nextLine());

            // 创建对象
            Student student = new Student(name, chineseScore, mathScore, englishScore);
            // 加入集合
            set.add(student);
        }
        for (Student student : set) {
            System.out.println(student.getName() + " --- " + student.getSum());
        }
    }
}
