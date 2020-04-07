package ringo.day06.demo05;

public class Demo01Student {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setAge(20);
        student1.setName("玛尔扎哈");
        System.out.println(student1.getName() + student1.getAge());

        Student student2 = new Student("尼古拉斯", 21);
        System.out.println(student2.getName() + student2.getAge());
    }
}
