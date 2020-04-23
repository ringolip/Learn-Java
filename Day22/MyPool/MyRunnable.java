package ringo.day22.MyPool;

/**
 * @author ringo
 * @version 1.0
 * @date 2020/4/23 14:33
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "---" + i);
        }
    }
}
