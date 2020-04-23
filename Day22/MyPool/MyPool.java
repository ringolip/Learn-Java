package ringo.day22.MyPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author ringo
 * @version 1.0
 * @date 2020/4/23 14:33
 */
public class MyPool {
    public static void main(String[] args) {
        // 创建线程池对象
        ExecutorService pool = Executors.newFixedThreadPool(2);
        // 执行线程
//        pool.submit(new MyRunnable());
//        pool.submit(new MyRunnable());
        pool.submit(new MyCallable());
        pool.submit(new MyCallable());
        // 关闭线程池
        pool.shutdown();


    }
}
