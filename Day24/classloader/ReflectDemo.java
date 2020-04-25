package ringo.day24.classloader;

/**
 * @author ringo
 * @version 1.0
 * @date 2020/4/25 10:53
 */
public class ReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        // 类.class
        Class<Student> studentClass1 = Student.class;
        System.out.println(studentClass1);

        Class<Student> studentClass2 = Student.class;
        System.out.println(studentClass1 == studentClass2);
        System.out.println(studentClass2);

        // 对象.getClass()
        Student student = new Student();
        Class<? extends Student> studentClass3 = student.getClass();
        System.out.println(studentClass3);

        // Class中的静态方法Class.forName(类所在路径)
        Class<?> studentClass4 = Class.forName("ringo.day24.classloader.Student");
        System.out.println(studentClass4);

    }
}
