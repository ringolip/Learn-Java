package ringo.day07.demo04;
import java.util.ArrayList;

public class Demo04ArrayListEach {
    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<>();
        boolean bool = arr.add("迪丽热巴");
        System.out.println(bool); // 向ArrayList中添加元素总会返回true
        arr.add("古力娜扎");
        arr.add("玛尔扎哈");

        // 遍历ArrayList中的元素
        System.out.println("现在ArrayList中元素的个数是：" + arr.size());
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }

        System.out.println(arr.remove(1));
        System.out.println("现在ArrayList中元素的个数是：" + arr.size());
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }

    }
}





