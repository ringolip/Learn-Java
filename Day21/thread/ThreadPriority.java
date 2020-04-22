package ringo.day21.thread;

/**
 * @author ringo
 * @version 1.0
 * @date 2020/4/22 15:36
 */
public class ThreadPriority {
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();

        System.out.println(myThread1.getPriority());
        System.out.println(myThread2.getPriority());

        myThread1.setPriority(1);
        myThread2.setPriority(10);

        myThread1.start();
        myThread2.start();

    }
}
