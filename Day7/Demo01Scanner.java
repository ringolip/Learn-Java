package ringo.day07.demo01;
import java.util.Scanner;


public class Demo01Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 获取键盘输入的int数字
        int num = scanner.nextInt();
        System.out.println("输入的int数字是：" + num);

        String str = scanner.next();
        System.out.println("输入的字符串是：" + str);
    }
}
