package ringo.day23.functionInterface;

/**
 * @author ringo
 * @version 1.0
 * @date 2020/4/24 15:50
 */
//定义一个类(RunnableDemo)，在类中提供两个方法
//        一个方法是：startThread(Runnable r)   方法参数Runnable是一个函数式接口
//        一个方法是主方法，在主方法中调用startThread方法
public class RunnableDemo {
    public static void main(String[] args) {
        startThread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        });

        // lambda
        startThread(() -> System.out.println(Thread.currentThread().getName()));
    }

    private static void startThread(Runnable r) {
        new Thread(r).start();
    }
}
