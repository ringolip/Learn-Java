package ringo.day23.lambda;

/**
 * @author ringo
 * @version 1.0
 * @date 2020/4/24 10:31
 */
//练习2：
//        1:定义一个接口(Flyable)，里面定义一个抽象方法：void fly(String s);
//        2:定义一个测试类(FlyableDemo)，在测试类中提供两个方法
//        一个方法是：useFlyable(Flyable f)
//        一个方法是主方法，在主方法中调用useFlyable方法

public class FlyableDemo {
    public static void main(String[] args) {
        useFlyable(new Flyable() {
            @Override
            public void fly(String s) {
                System.out.println(s);
                System.out.println("飞起来了");
            }
        });

        System.out.println("---------");

        useFlyable((String s) -> {
            System.out.println(s);
            System.out.println("Lambda");
        });
    }

    static void useFlyable(Flyable f) {
        f.fly("useFlyable方法");
    }
}
