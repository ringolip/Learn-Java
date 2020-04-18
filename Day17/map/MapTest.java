package ringo.day17.map;

import java.util.HashMap;

/**
 * @author ringo
 * @version 1.0
 * @date 2020/4/18 11:05
 */
public class MapTest {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String>();

        System.out.println("map：" + map);
        // 添加
        map.put("小智", "皮卡丘");
        System.out.println("map：" + map);

        // 删除
//        map.clear();
//        System.out.println(map);


//        System.out.println(map.remove("小刚"));
//        System.out.println(map.remove("小智"));

        // 判断
        System.out.println(map.containsKey("小智"));
        System.out.println(map.containsValue("皮卡丘"));
        System.out.println(map.isEmpty());


        // 长度
        System.out.println(map.size());
    }
}
