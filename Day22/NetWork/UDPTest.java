package ringo.day22.NetWork;

import java.io.IOException;
import java.net.*;

/**
 * @author ringo
 * @version 1.0
 * @date 2020/4/23 18:10
 */
public class UDPTest {
    public static void main(String[] args) throws IOException {
        // 创建UDP套接字对象
        DatagramSocket datagramSocket = new DatagramSocket();

        // 创建数据，并打包数据
        byte[] bytes = "UDP我来了".getBytes();
        // 调用Socket对象的方法发送数据包
        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length,
                InetAddress.getByName("kun.local"), 10000);
        // 发送数据
        datagramSocket.send(datagramPacket);

        // 释放资源
        datagramSocket.close();

    }
}
