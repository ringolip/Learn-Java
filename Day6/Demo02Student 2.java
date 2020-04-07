package ringo.day06.demo04;

public class Demo02Student {
    public static void main(String[] args) {
        Student student = new Student();
        Student student2 = new Student(25, "ringo");
        System.out.println(student.name);
        System.out.println(student2.name);
    }
}
