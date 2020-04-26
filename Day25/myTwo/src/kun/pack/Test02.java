package kun.pack;

import ringo.item03.MyService;

import java.util.ServiceLoader;

/**
 * @author ringo
 * @version 1.0
 * @date 2020/4/26 16:26
 */
public class Test02 {
    public static void main(String[] args) {
        // 加载服务
        ServiceLoader<MyService> myServices = ServiceLoader.load(MyService.class);
        // 遍历服务
        for (MyService my : myServices) {
            my.service();
        }
    }
}
