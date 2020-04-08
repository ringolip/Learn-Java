package ringo.day07.demo05;

import java.util.Random;
import java.util.ArrayList;

public class Demo01ArrayListRandom {
    public static void main(String[] args) {
        // 生成6个1-33的随机数，并添加到集合，遍历集合

        Random random = new Random();
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            // 1.生成随机数
            int num =  random.nextInt(33) + 1; // 随机数范围1-3
            // 2.添加到集合
            arr.add(num);
        }

        // 3.遍历集合
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }
}
