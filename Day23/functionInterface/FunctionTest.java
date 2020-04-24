package ringo.day23.functionInterface;

import java.util.function.Function;

/**
 * @author ringo
 * @version 1.0
 * @date 2020/4/24 21:49
 */
//String s = "林青霞,30";
//        请按照我指定的要求进行操作：
//        1:将字符串截取得到数字年龄部分
//        2:将上一步的年龄字符串转换成为int类型的数据
//        3:将上一步的int数据加70，得到一个int结果，在控制台输出
//        请通过Function接口来实现函数拼接
public class FunctionTest {
    public static void main(String[] args) {
        String s = "林青霞,30";
        convert(s, (String ss) -> ss.split(",")[1], Integer::parseInt, (Integer i) -> i + 70);
    }

    private static void convert(String s, Function<String, String> fun1,
                                Function<String, Integer> fun2, Function<Integer, Integer> fun3) {
        int num = fun1.andThen(fun2).andThen(fun3).apply(s);
        System.out.println(num);
    }
}
