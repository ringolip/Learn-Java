package ringo.day22.MyCallable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author ringo
 * @version 1.0
 * @date 2020/4/23 15:04
 */
public class MyPool {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService pool = Executors.newFixedThreadPool(2);

        Future<Integer> f1 = pool.submit(new MyCallable(10));
        Future<Integer> f2 = pool.submit(new MyCallable(20));

        Integer sum1 = f1.get();
        Integer sum2 = f2.get();

        System.out.println(sum1);
        System.out.println(sum2);

        pool.shutdown();


    }
}
