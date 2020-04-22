package ringo.day21.thread;

/**
 * @author ringo
 * @version 1.0
 * @date 2020/4/22 14:40
 */
public class MyThread extends Thread{
    public MyThread() {
    }

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        // 需要执行的代码
        for (int i = 0; i < 1000; i++) {
            System.out.println(i + Thread.currentThread().getName());

        }
    }
}
