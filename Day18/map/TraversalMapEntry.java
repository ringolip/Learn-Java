package ringo.day18.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author ringo
 * @version 1.0
 * @date 2020/4/19 15:42
 */
public class TraversalMapEntry {
    public static void main(String[] args) {
        // 创建Map对象
        Map<String, String> map = new HashMap<String, String>();

        // 在Map对象中添加元素
        map.put("小智", "皮卡丘");
        map.put("小霞", "可达鸭");
        map.put("小刚", "大岩蛇");
        map.put("小蓝", "杰尼龟");

        // 遍历Map集合

        // 1. 获取键值对对象集合
        Set<Map.Entry<String, String>> entries = map.entrySet();

        // 2. 遍历集合，获取键值对对象
        for (Map.Entry<String, String> kv : entries) {
            // 3. 获取对象的键值
            System.out.println(kv.getKey()+" --- " + kv.getValue());

        }
    }
}
