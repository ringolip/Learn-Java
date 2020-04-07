package ringo.day07.demo03;

import java.util.Scanner;
import java.util.Random;

public class Demo03Random {

    public static void main(String[] args) {
        // 根据int变量的值，来获取随机数字，范围为[1,n]
        // 获取键盘输入int n
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字，确定随机数的范围：");
        int n = sc.nextInt();
        System.out.println("您所获取的随机数范围为：1~" + n);

        // 随机范围[0,n)
        Random ran = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.println(ran.nextInt(n) + 1);
        }
    }

}
