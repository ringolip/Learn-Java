package ringo.day20.io;

/**
 * 使用递归方法计算斐波那契数列
 *
 * @author ringo
 * @version 1.0
 * @date 2020/4/21 10:31
 */
public class Recursion {
    public static void main(String[] args) {
        System.out.println(fibonacci(20));
    }

    // 方法
    public static int fibonacci(int day) {
        // 出口
        if (day == 1 || day == 2) {
            return 1;
        } else {
            // 规律
            return fibonacci((day - 1)) + fibonacci((day - 2));
        }
    }
}
