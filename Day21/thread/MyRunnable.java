package ringo.day21.thread;

/**
 * @author ringo
 * @version 1.0
 * @date 2020/4/22 16:54
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + Thread.currentThread().getName());
        }
    }
}
