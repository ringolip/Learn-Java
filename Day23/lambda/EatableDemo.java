package ringo.day23.lambda;

/**
 *
 * @author ringo
 * @version 1.0
 * @date 2020/4/24 09:53
 */

//定义一个测试类(EatableDemo)，在测试类中提供两个方法
//        一个方法是：useEatable(Eatable e)
//        一个方法是主方法，在主方法中调用useEatable方法

public class EatableDemo {
    public static void main(String[] args) {

        useEatable(() -> {
            System.out.println("一天一苹果，医生远离我");
        } );



    }

    private static void useEatable(Eatable e) {
        e.eat();
    }
}

