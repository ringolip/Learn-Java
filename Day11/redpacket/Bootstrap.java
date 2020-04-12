package ringo.day11.redpacket;

// setOwnerName 设置群主
// setOpenWay 设置红包类型，平均/随机

public class Bootstrap {
    public static void main(String[] args) {
        MyRed red = new MyRed("ringo的红包");
        // 设置群主
        red.setOwnerName("王思聪");
        Normal normal = new Normal();
        RandomMode random = new RandomMode();
        red.setOpenWay(random);
    }
}
