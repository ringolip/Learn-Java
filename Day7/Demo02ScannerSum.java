package ringo.day07.demo01;

import java.util.Scanner;

public class Demo02ScannerSum {
    public static void main(String[] args) {
        // 输入两个int数字并求和
        // 使用构造方法，创建对象
        Scanner sc = new Scanner(System.in);
        // 使用成员方法
        int num1 =  sc.nextInt();
        System.out.println("第一个输入的数字为：" + num1);
        int num2 = sc.nextInt();
        System.out.println("第二个输入的数字为：" + num2);
        int sum = num1 + num2;
        System.out.println("输入数字的和为：" + sum);
    }

}
