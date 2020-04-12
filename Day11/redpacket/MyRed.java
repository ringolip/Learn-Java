package ringo.day11.redpacket;

import ringo.day11.red.RedPacketFrame;

// 子类
public class MyRed extends RedPacketFrame{

    /**
     * 构造方法：生成红包界面。
     *
     * @param title 界面的标题
     */
    public MyRed(String title) {
        super(title);
    }
}
