package ringo.day09.packet;

import java.util.ArrayList;

public class Admin extends User{

    // 构造方法
    public Admin() {
    }

    public Admin(String name, int balance) {
        super(name, balance);
    }

    // 成员方法：发红包
    // 参数：totalMoney红包总额，count收红包的人数
    // 返回：红包列表
    public ArrayList<Integer> send(int totalMoney, int count) {
        int total = super.getBalance();
        super.setBalance(total - totalMoney);

        ArrayList<Integer> moneyArray = new ArrayList<>();

        // 每份红包的金额
        int everyMoney = totalMoney / count;
        int lastMoney = totalMoney % count; // 除不尽的钱

        // 根据人数确定红包个数
        for (int i = 0; i < count - 1; i++) {
            moneyArray.add(everyMoney);
        }
        // 最后一份加入除不尽的钱
        moneyArray.add(everyMoney+lastMoney);
        System.out.println(moneyArray.size());
        return moneyArray;
    }
}
