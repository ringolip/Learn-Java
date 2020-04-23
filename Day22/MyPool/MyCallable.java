package ringo.day22.MyPool;

import java.util.concurrent.Callable;

/**
 * @author ringo
 * @version 1.0
 * @date 2020/4/23 14:49
 */
public class MyCallable implements Callable {
    @Override
    public Object call() throws Exception {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "---" + i);
        }
        return null;
    }
}
