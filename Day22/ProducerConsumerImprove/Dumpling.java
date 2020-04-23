package ringo.day22.ProducerConsumerImprove;


/**
 * @author ringo
 * @version 1.0
 * @date 2020/4/23 12:55
 */
public class Dumpling {

    private String skin;
    private String stuffing;
    private boolean flag = false;

    // 做饺子
    public synchronized void set(String skin, String stuffing) {

        if (this.flag) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        this.skin = skin;
        this.stuffing = stuffing;

        this.flag = true;
        this.notify();

    }

    // 吃饺子
    public synchronized void get() {

        if (!this.flag) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(this.skin + " -- " + this.stuffing);

        this.flag = false;
        this.notify();

    }

}
