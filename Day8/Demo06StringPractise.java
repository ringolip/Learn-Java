package ringo.day08.demo02;

public class Demo06StringPractise {
    public static void main(String[] args) {
        // 定义一个方法，将数组{1, 2, 3}按照指定格式拼接成一个字符串。格式参照：[word1#word2#word3]
        // 定义数组
        int[] arrayNum = {1, 2, 3};
        // 调用方法
        String strNum = concateString(arrayNum);
        System.out.println(strNum);

    }

    public static String concateString(int[] arr) {
        String concatStr = "";
        concatStr = concatStr.concat("[");
        for (int i = 0; i < arr.length; i++) {
            // 获取数组中的数字
            int num = arr[i];
            // 将数字转换为字符串类型
            String str = String.valueOf(num);
            // 拼接字符串
            concatStr =  concatStr.concat("word");
            if (i < arr.length - 1) {
                concatStr = concatStr.concat(str + "#");
            } else {
                concatStr = concatStr.concat(str);
            }
        }
        concatStr = concatStr.concat("]");
        return concatStr;
    }
}
