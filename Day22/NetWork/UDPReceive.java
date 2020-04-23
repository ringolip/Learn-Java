package ringo.day22.NetWork;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * @author ringo
 * @version 1.0
 * @date 2020/4/23 18:46
 */
public class UDPReceive {
    public static void main(String[] args) throws IOException {
        // 创建socket，并监听一个端口
        DatagramSocket datagramSocket = new DatagramSocket(10000);
        // 定义数据包，接收数据
        byte[] bytes = new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length);
        // 存储数据
        datagramSocket.receive(datagramPacket);
        // 解析数据
        String ip = datagramPacket.getAddress().getHostAddress();
        byte[] data = datagramPacket.getData();
        int port = datagramPacket.getPort();
        String text = new String(data, 0, datagramPacket.getLength());
        System.out.println(ip + "---" +port + "---" + text);
    }
}
