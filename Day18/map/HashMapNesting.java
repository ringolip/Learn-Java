package ringo.day18.map;

import java.util.*;

/** 集合嵌套
 *
 * @author ringo
 * @version 1.0
 * @date 2020/4/19 21:26
 */
public class HashMapNesting {
    public static void main(String[] args) {
        // 创建集合对象
        HashMap<String, HashMap<String, Integer>> nestingMap = new HashMap<String, HashMap<String, Integer>>();

        // 创建意甲集合
        HashMap<String, Integer> italyMap = new HashMap<String, Integer>();
        italyMap.put("迪巴拉", 27);
        italyMap.put("C罗", 34);

        nestingMap.put("意甲", italyMap);

        // 创建英超集合
        HashMap<String, Integer> englandMap = new HashMap<String, Integer>();
        englandMap.put("斯特林", 27);
        englandMap.put("萨拉赫", 28);

        nestingMap.put("英超", englandMap);

        // 遍历集合
        Set<String> keySet = nestingMap.keySet();
        for (String key : keySet) {
            // 子集合键值
            System.out.println(key);
            // 获取子集合
            HashMap<String, Integer> map = nestingMap.get(key);
            Set<String> set = map.keySet();
            // 遍历子集合
            for (String littleKey : set) {
                System.out.println(littleKey+ " --- " + map.get(littleKey));
            }
        }

    }
}
