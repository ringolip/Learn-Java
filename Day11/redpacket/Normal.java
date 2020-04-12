package ringo.day11.redpacket;

import ringo.day11.red.OpenMode;

import java.util.ArrayList;

// 平均分配
public class Normal implements OpenMode{
    @Override
    public ArrayList<Integer> divide(final int totalMoney, final int totalCount) {
        ArrayList<Integer> array = new ArrayList<>();

        // 平均数
        int average = totalMoney / totalCount;
        int mod = totalMoney % totalCount;

        // 将每份的钱加入红包
        for (int i = 0; i < totalCount - 1; i++) {
            array.add(average);
        }
        array.add(average + mod);

        return array;
    }
}
