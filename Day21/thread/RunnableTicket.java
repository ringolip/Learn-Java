package ringo.day21.thread;

/**
 * @author ringo
 * @version 1.0
 * @date 2020/4/22 18:07
 */
public class RunnableTicket implements Runnable {
    private int tickets = 100;
//    Object obj = new Object();

    @Override
    public void run() {
        // 卖票
            while (true) {
                sales();
            }

    }

    // 同步方法的锁对象是this
    private synchronized void sales() {
            if (tickets > 0) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "正在售出第" + (tickets--) + "张票");
            }
    }

}
