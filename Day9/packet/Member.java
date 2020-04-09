package ringo.day09.packet;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User{

    // 构造方法
    public Member() {
    }

    public Member(String name, int balance) {
        super(name, balance);
    }

    // 成员方法：收红包
    public void receive(ArrayList<Integer> moneyArray) {
        // 虽仅获取一个列表索引
        int index = new Random().nextInt(moneyArray.size());
        // 取出列表中的一份，并删除
        int delta = moneyArray.remove(index);
        int money = super.getBalance();
        // 加入到自己的余额
        super.setBalance(delta + money);
        System.out.println(moneyArray.size());
    }
}
