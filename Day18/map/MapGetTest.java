package ringo.day18.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author ringo
 * @version 1.0
 * @date 2020/4/19 14:56
 */
public class MapGetTest {
    public static void main(String[] args) {
        // 创建Map对象
        Map<String, String> map = new HashMap<String, String>();

        // 在Map对象中添加元素
        map.put("小智", "皮卡丘");
        map.put("小霞", "可达鸭");
        map.put("小刚", "大岩蛇");
        map.put("小蓝", "杰尼龟");


        // 测试获取功能
        // 根据键获取值
        System.out.println(map.get("小智"));

        // 获取Map中所有键的集合
        Set<String> set = map.keySet();
        System.out.println(set);
        for (String string : set) {
            System.out.println(string);
        }

        // 获取Map中所有的值的集合
        Collection<String> collection = map.values();
        for (String string: collection) {
            System.out.println(string);
        }
    }
}
