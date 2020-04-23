package ringo.day22.ProducerConsumer;

/**
 * @author ringo
 * @version 1.0
 * @date 2020/4/23 11:37
 */
public class Consumer implements Runnable{

    private Dumpling dumpling;

    public Consumer(Dumpling dumpling) {
        this.dumpling = dumpling;
    }

    @Override
    public void run() {
        while (true) {
            // 上锁
            synchronized (dumpling) {
                // 如果没有饺子
                if (!dumpling.flag) {
                    try {
                        // 等待
                        dumpling.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                // 吃饺子
                System.out.println(dumpling.skin + " -- " + dumpling.stuffing);
                dumpling.flag = false;
                // 唤醒
                dumpling.notify();
            }
        }

    }
}
