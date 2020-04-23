package ringo.day22.ProducerConsumer;

/**
 * @author ringo
 * @version 1.0
 * @date 2020/4/23 11:37
 */
public class Producer implements Runnable{

    private  Dumpling dumpling;
    private int num = 0;

    public Producer(Dumpling dumpling) {
        this.dumpling = dumpling;
    }

    @Override
    public void run() {

        while (true) {
            // 加锁
            synchronized (dumpling) {
                // 如果还有饺子
                if (dumpling.flag) {
                    try {
                        dumpling.wait(); // 等待
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                if (num % 2 == 0) {
                    // 生产饺子
                    dumpling.skin = "薄皮";
                    dumpling.stuffing = "虾仁";

                } else {
                    dumpling.skin = "厚皮";
                    dumpling.stuffing = "韭菜鸡蛋";
                }

                num++;
                dumpling.flag = true;
                dumpling.notify(); // 唤醒
            }

        }


    }
}
