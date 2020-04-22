package ringo.day21.thread;

/**
 * @author ringo
 * @version 1.0
 * @date 2020/4/22 14:10
 */
public class ThreadTest {
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread("aa");
        MyThread myThread2 = new MyThread("fffff");
        System.out.println(Thread.currentThread().getName());
//        myThread1.setName("ss");
//        myThread2.setName("aa");
        myThread1.start();

        myThread2.start();

    }
}
