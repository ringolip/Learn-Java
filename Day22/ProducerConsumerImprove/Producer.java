package ringo.day22.ProducerConsumerImprove;

/**
 * @author ringo
 * @version 1.0
 * @date 2020/4/23 12:56
 */
public class Producer implements Runnable{

    private Dumpling dumpling;
    private int x = 0;


    public Producer(Dumpling dumpling) {
        this.dumpling = dumpling;
    }

    @Override
    public void run() {
        while (true) {
            if (x % 2 == 0) {
                dumpling.set("厚皮", "鲜肉");
            } else {
                dumpling.set("薄皮", "韭菜");
            }
            x++;
        }
    }
    // 生产者
}
