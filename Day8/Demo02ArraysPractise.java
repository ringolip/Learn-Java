package ringo.day08.demo04;

import java.util.Arrays;

public class Demo02ArraysPractise {
    public static void main(String[] args) {
        // 将随机字符串升序排列并倒序打印
        String str = "adsknasdjk821e";
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        System.out.println(ch);

        for (int i = ch.length - 1; i >= 0; i--) {
            System.out.println(ch[i]);
        }
    }
}
