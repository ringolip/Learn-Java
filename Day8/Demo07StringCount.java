package ringo.day08.demo02;

import java.util.Scanner;

public class Demo07StringCount {
    public static void main(String[] args) {
        // 键盘输入一个字符串，并且统计其中个字符出现的次数
        // 种类：大写字母、小写字母、数字、其他

        Scanner sc = new Scanner(System.in);
        // 接收输入
        System.out.println("给👴随便写点东西8：");
        String input = sc.next();
        System.out.println(input);

        // 转换字符串为char类型
        char[] charInput = input.toCharArray();
        int capital = 0;
        int lowercase = 0;
        int number = 0;
        int others = 0;

        for (int i = 0; i < charInput.length; i++) {
        // 比较字符ASCII码，确定所属的类型
            if (charInput[i] >= 'a' && charInput[i] <= 'z') {
                lowercase++;
            } else if (charInput[i] >= 'A' && charInput[i] <= 'Z') {
                capital++;
            } else if (charInput[i] >= '0' && charInput[i] <= '9') {
                number++;
            } else {
                others++;
            }
        }

        System.out.println("大写字母出现的次数：" + capital);
        System.out.println("小写字母出现的次数：" + lowercase);
        System.out.println("数字出现的次数：" + number);
        System.out.println("其他字符出现的数字" + others);
        System.out.println("Vans了，给👴爬");

    }
}
