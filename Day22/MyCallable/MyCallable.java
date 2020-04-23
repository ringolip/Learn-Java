package ringo.day22.MyCallable;

import java.util.concurrent.Callable;

/**
 * @author ringo
 * @version 1.0
 * @date 2020/4/23 15:02
 */
public class MyCallable implements Callable<Integer>{
    private int num;

    public MyCallable(int num) {
        this.num = num;
    }

    @Override
    public Integer call() throws Exception {
        int sum = 0;

        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        return sum;
    }
}
