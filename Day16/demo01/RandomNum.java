package ringo.day16.demo01;

import java.util.HashSet;
import java.util.Random;

/**
 * 获取10个1-20的随机数，要求随机数不能重复
 *
 * @author ringo
 * @version 1.0
 * @date 2020/4/17 20:22
 */
public class RandomNum {
    public static void main(String[] args) {
        // 创建随机数对象
        Random random = new Random();
        // 创建Set集合
        HashSet<Integer> set = new HashSet<Integer>();
        // 判断集合的长度是否小于10
        while (set.size() < 10) {
            // 创建随机数
            int num = random.nextInt(20) + 1;
            set.add(num);
        }

        System.out.println(set);
    }
}
