package ringo.day22.MutualExclusion;

import java.awt.geom.FlatteningPathIterator;

/**
 * @author ringo
 * @version 1.0
 * @date 2020/4/23 10:01
 */
public class DieLock extends Thread{
    private boolean flag;
    public DieLock(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        if (flag) {
            // 加A锁
            synchronized (MyLock.objA) {
                System.out.println("flag=true,加A锁");
                synchronized (MyLock.objB) {
                    System.out.println("flag=true,加B锁");
                }
            }
        } else {
            // 加B锁
            synchronized (MyLock.objB) {
                System.out.println("flag=false,加B锁");
                synchronized (MyLock.objA) {
                    System.out.println("flag=false,加A锁");
                }
            }
        }
    }
}
