package ringo.day23.lambda;

/**
 * @author ringo
 * @version 1.0
 * @date 2020/4/24 10:50
 */
//练习3：
//        1:定义一个接口(Addable)，里面定义一个抽象方法：int add(int x,int y);
//        2:定义一个测试类(AddableDemo)，在测试类中提供两个方法
//        一个方法是：useAddable(Addable a)
//        一个方法是主方法，在主方法中调用useAddable方法
public class AddableDemo {
    public static void main(String[] args) {
        useAddable((int a, int b) -> {
            return a + b;
        });
    }

    // 参数为接口的实现类
    private static void useAddable(Addable a) {
        int sum = a.add(10, 20);
        System.out.println(sum);
    }
}
