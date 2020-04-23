package ringo.day22.ProducerConsumerImprove;

/**
 * @author ringo
 * @version 1.0
 * @date 2020/4/23 12:56
 */
public class Consumer implements Runnable{
    private Dumpling dumpling;

    public Consumer(Dumpling dumpling) {
        this.dumpling = dumpling;
    }

    @Override
    public void run() {
        while (true) {
            dumpling.get();
        }
    }
    // 消费者
}
