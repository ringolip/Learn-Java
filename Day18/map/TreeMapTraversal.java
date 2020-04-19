package ringo.day18.map;

import java.util.Set;
import java.util.TreeMap;

/**
 * 需求 ："aababcabcdabcde",获取字符串中每一个字母出现的次数要求结果:a(5)b(4)c(3)d(2)e(1)
 * @author ringo
 * @version 1.0
 * @date 2020/4/19 18:14
 */
public class TreeMapTraversal {
    public static void main(String[] args) {
        String originalString = "linqingxia";
        TreeMap<Character, Integer> map = new TreeMap<Character, Integer>();

        // 字符串转换为字符数组
        char[] charArray = originalString.toCharArray();

        // 遍历字符数组
        for (Character ch : charArray) {
            // 测试集合中是否有此字符
            if (map.get(ch) == null) {
                // 没有就添加新的键，值为1
                map.put(ch, 1);
            } else {
                // 有就值++
                Integer num = map.get(ch);
                map.put(ch, ++num);
            }
        }
        System.out.println(map);

        // 在集合中拼接字符
        Set<Character> characters = map.keySet();
        StringBuffer stringBuffer = new StringBuffer();

        for (Character ch : characters) {
            stringBuffer.append(ch);
            stringBuffer.append('(');
            stringBuffer.append(map.get(ch));
            stringBuffer.append(')');
        }

        // 生成字符串并打印
        String stringPrint =  stringBuffer.toString();
        System.out.println(stringPrint);
    }
}
