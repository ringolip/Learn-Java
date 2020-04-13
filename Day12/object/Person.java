package ringo.day12.object;

import java.util.Objects;

public class Person extends Object {
    // 成员变量
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    @Override
//    public String toString() {
//
//        return name+ ": " + age;
//    }

//    @Override
//    public boolean equals(Object obj) {
//        Person person = (Person) obj;
//        // 比较对象的属性是否相等
//        boolean bool = this.name.equals(person.name) && this.age == person.age;
//        return bool;
//
//
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // 同一对象
        if (o == null || getClass() != o.getClass()) return false; // 为空
        Person person = (Person) o; // 向下转型
        return age == person.age && // 判断
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age);
    }
}
