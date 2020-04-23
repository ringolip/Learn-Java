package ringo.day22.NetWork;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author ringo
 * @version 1.0
 * @date 2020/4/23 18:30
 */
public class MyIP {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getByName("192.168.12.235");

        String hostName = address.getHostName();
        String ip = address.getHostAddress();
        System.out.println(hostName + "--" + ip);

    }
}
