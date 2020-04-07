package ringo.day06.demo03;

public class Demo03Person {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(25);
        person.name = "ringo";
//        person.printProfile();
        person.setMale(true);

        System.out.println(person.getAge());
        System.out.println(person.isMale());
    }
}
