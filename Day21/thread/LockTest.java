package ringo.day21.thread;

/**
 * @author ringo
 * @version 1.0
 * @date 2020/4/22 19:51
 */
public class LockTest {
    public static void main(String[] args) {
        LockThread lockThread = new LockThread();
        Thread thread1 = new Thread(lockThread);
        Thread thread2 = new Thread(lockThread);
        Thread thread3 = new Thread(lockThread);

        thread1.start();
        thread2.start();
        thread3.start();

    }
}
