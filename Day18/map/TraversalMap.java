package ringo.day18.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Map集合的遍历
 *
 * @author ringo
 * @version 1.0
 * @date 2020/4/19 15:26
 */
public class TraversalMap {
    public static void main(String[] args) {
        // 创建Map对象
        Map<String, String> map = new HashMap<String, String>();

        // 在Map对象中添加元素
        map.put("小智", "皮卡丘");
        map.put("小霞", "可达鸭");
        map.put("小刚", "大岩蛇");
        map.put("小蓝", "杰尼龟");

        // 遍历Map集合

        // 1. 获取所有键
        Set<String> set = map.keySet();
        // 2. 遍历键
        for (String stringKey : set) {
            System.out.print("键：" + stringKey + " --- ");
            // 3. 根据键获取值
            String value = map.get(stringKey);
            System.out.println("值：" + value);
        }
    }
}
