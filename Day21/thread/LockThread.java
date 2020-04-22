package ringo.day21.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Lock解决进程安全问题
 *
 * @author ringo
 * @version 1.0
 * @date 2020/4/22 19:43
 */
public class LockThread implements Runnable{

    private int ticket = 100;

    @Override
    public void run() {
        // 实现多线程代码

        Lock lock = new ReentrantLock();

        while (true) {
            lock.lock();
            if (ticket > 1) {
                // 休息
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(Thread.currentThread().getName() + "卖出了第" + (ticket--) + "张票");
            }
            lock.unlock();
        }

    }
}
