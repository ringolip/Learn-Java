package ringo.day07.demo05;

import java.util.Random;
import java.util.ArrayList;

public class Demo04ArrayListReturn {
    // 用大集合存入20个随机数字，然后筛选其中的偶数元素，放到小集合中
    // 要求使用自定义的方法来实现筛选
    public static void main(String[] args) {
        ArrayList<Integer> arrBigger = new ArrayList<>();
        ArrayList<Integer> arrSmaller;
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            // 获取随机数
            int num = random.nextInt(101); // 0-100
            // 加入大集合
            arrBigger.add(num);
        }
        System.out.println(arrBigger);

        // 使用方法筛选
        arrSmaller = getEven(arrBigger);
        System.out.println(arrSmaller);
    }

    // 筛选偶数
    public static ArrayList<Integer> getEven(ArrayList<Integer> arr) {
        ArrayList<Integer> arrSmaller = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            // 筛选大集合中的偶数
            int num = arr.get(i);
            if (num % 2 == 0) {
                // 添加到小集合中
                arrSmaller.add(num);
            }

        }
        return arrSmaller;
    }
}
