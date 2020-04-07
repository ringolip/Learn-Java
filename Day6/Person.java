package ringo.day06.demo03;

public class Person {
    private int age;
    String name;
    private boolean male;

    public void setAge(int number) {
        if (number <= 0 || number >= 120) {
            System.out.println("无效的输入");
        } else {
            age = number;
        }
    }

    public void setMale(boolean b) {
        male = b;
    }

    public boolean isMale() {
        return male;
    }

    public int getAge() {
        return age;
    }

    public void printProfile() {
        System.out.println("我是" + name + "，今年" + age);
    }
}
