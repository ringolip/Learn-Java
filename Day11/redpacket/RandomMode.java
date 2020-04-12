package ringo.day11.redpacket;

import ringo.day11.red.OpenMode;

import java.util.ArrayList;
import java.util.Random;

// 红包金额随机分配
public class RandomMode implements OpenMode {

    @Override
    public ArrayList<Integer> divide(final int totalMoney, final int totalCount) {

        ArrayList<Integer> array = new ArrayList<>();
        Random random = new Random();

        // 剩余钱数
        int leftMoney = totalMoney;
        // 剩余发送红包个数
        int leftCount = totalCount;

        for (int i = 0; i < totalCount - 1; i++) {
            // 本次塞进红包的金额，不超过剩余金额平均数的两倍
            int money = random.nextInt(leftMoney / leftCount * 2) + 1;
            // 将钱塞进红包
            array.add(money);

            // 剩余的金额和塞进红包的次数
            leftMoney -= money;
            leftCount--;
        }

        array.add(leftMoney);

        return array;
    }
}
