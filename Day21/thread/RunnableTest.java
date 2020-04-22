package ringo.day21.thread;

/**
 * @author ringo
 * @version 1.0
 * @date 2020/4/22 16:55
 */
public class RunnableTest {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread1 = new Thread(myRunnable);
        Thread thread2 = new Thread(myRunnable);

        thread1.start();
        thread2.start();

    }
}
