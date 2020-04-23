package ringo.day22.MutualExclusion;

/**
 * @author ringo
 * @version 1.0
 * @date 2020/4/23 10:04
 */
public class LockTest {
    public static void main(String[] args) {
        DieLock dieLockTrue = new DieLock(true);
        DieLock dieLockFalse = new DieLock(false);

        dieLockTrue.start();
        dieLockFalse.start();


    }
}
