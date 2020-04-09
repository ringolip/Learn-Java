package ringo.day09.packet;

import java.util.ArrayList;

public class RedPacketMoney {
    /* 群主发普通红包。某群有多名成员，群主给成员发普通红包。普通红包的规则：
       1. 群主的一笔金额，从群主余额中扣除，平均分成n等份，让成员领取。
       2. 成员领取红包后，保存到成员余额中。*/

    public static void main(String[] args) {
        // 群主
        Admin admin = new Admin("ringo", 100);
        // 群成员
        Member member1 = new Member("路人1", 0);
        Member member2 = new Member("路人2", 0);
        Member member3 = new Member("路人3", 0);

        admin.show();

        // 发红包
        ArrayList<Integer> moneyPacket = admin.send(20, 3);

        // 拿红包
        member1.receive(moneyPacket);
        member2.receive(moneyPacket);
        member3.receive(moneyPacket);

        admin.show();
        member1.show();
        member2.show();
        member3.show();
    }
}
