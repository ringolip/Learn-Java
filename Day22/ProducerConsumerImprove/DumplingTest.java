package ringo.day22.ProducerConsumerImprove;

/**
 * @author ringo
 * @version 1.0
 * @date 2020/4/23 12:57
 */
public class DumplingTest {
    public static void main(String[] args) {

        Dumpling dumpling = new Dumpling();

        Producer producer = new Producer(dumpling);
        Consumer consumer = new Consumer(dumpling);

        Thread threadProducer = new Thread(producer);
        Thread threadConsumer = new Thread(consumer);

        threadProducer.start();
        threadConsumer.start();
    }
}
