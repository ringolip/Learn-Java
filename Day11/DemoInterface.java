package ringo.day11.demo07;

import java.util.ArrayList;
import java.util.List;


// 使用接口作为方法的参数或者返回值
public class DemoInterface {
    public static void main(String[] args) {
        // List正是ArrayList实现的接口
        List<String> array = new ArrayList<>();

        List<String> result = addNames(array);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }

    }

    public static List<String > addNames(List<String> list) {
        list.add("迪丽热巴");
        list.add("玛尔扎哈");
        list.add("古力娜扎");

        return list;
    }
}
