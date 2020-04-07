package ringo.day07.demo01;

import java.util.Scanner;

public class Demo03ScnnerMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 获取三个输入的int
        System.out.print("请输入数字：");
        int num1 = sc.nextInt();
        System.out.print("请输入数字：");
        int num2 = sc.nextInt();
        System.out.print("请输入数字：");
        int num3 = sc.nextInt();
        // 比较，获取最大值
        int temp = num1 >= num2 ? num1: num2;
        int max = temp >= num3 ? temp: num3;

        System.out.println("最大值为：" + max);
    }
}
