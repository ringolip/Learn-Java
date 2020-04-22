package ringo.day21.thread;

/**
 * @author ringo
 * @version 1.0
 * @date 2020/4/22 18:16
 */
public class Sale {
    public static void main(String[] args) {
        RunnableTicket runnableTicket = new RunnableTicket();
        Thread thread1 = new Thread(runnableTicket);
        Thread thread2 = new Thread(runnableTicket);
        Thread thread3 = new Thread(runnableTicket);

        thread1.start();
        thread2.start();
        thread3.start();

    }
}
