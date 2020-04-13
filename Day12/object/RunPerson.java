package ringo.day12.object;

public class RunPerson {
    public static void main(String[] args) {
        Person person1 = new Person("ringo", 25);
        Person person2 = new Person("ringo", 25);
        System.out.println(person1.toString());

        System.out.println(person1.equals(person2));
    }
}
