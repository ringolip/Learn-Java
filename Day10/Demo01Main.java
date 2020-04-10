package ringo.day10.demo06;

public class Demo01Main {
    public static void main(String[] args) {
        // 向上引用：父类引用指向子类对象
        Animal animal = new Cat();
        animal.eat();

        Cat cat = (Cat) animal;
        cat.catchMouse();
    }
}
