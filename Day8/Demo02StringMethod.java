package ringo.day08.demo01;

public class Demo02StringMethod {
    public static void main(String[] args) {
        String str1 = "ABC";
        String str2 = "abc";

        // 1. 内容比较（区分大小写）
        boolean equal1 =  str1.equals(str2);
        // 2. 内容比较（不区分大小写）
        boolean equal2 =  str1.equalsIgnoreCase(str2);
        System.out.println(equal2);

        // 3. 获取字符串长度
        int len =  str1.length();
        System.out.println(len);

        // 4. 拼接字符串
        String str3 = str1.concat(str2);
        System.out.println(str3);

        // 5. 获取制定索引位置的单个字符
        char ch = str1.charAt(1);
        System.out.println(ch);

        // 6. 获取参数字符串在此字符串首次出现的索引位置
        String original = "HelloWorld";
        int index = original.indexOf("lo");
        System.out.println(index);

        // 7. 截取字符串到末尾
        String sub = original.substring(5);
        System.out.println(sub);


        // 8. 截取字符串，区间左开右闭
        String sub2 = original.substring(4,7);
        System.out.println(sub2);

        // 9. 将字符串转换成字符数组
        char[] ch1 = str1.toCharArray();
        System.out.println(ch1.length);

        // 10. 将字符串转换为字节数组
        byte[] bytes1 = str1.getBytes();
        System.out.println(bytes1.length);

        // 11. 替换字符串中的字符
        String lang1 = "会不会玩啊，你大爷的，你大爷";
        String lang2 = lang1.replace("你大爷", "****");
        System.out.println(lang2);

        // 12. 分割字符串
        String[] lang3 = lang1.split("，");
        System.out.println(lang3);
        for (int i = 0; i < lang3.length; i++) {
            System.out.println(lang3[i]);
        }
    }
}
