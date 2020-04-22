package ringo.day21.demo01;

import java.io.*;

/**
 * 通过标准输入实现键盘录入
 *
 * @author ringo
 * @version 1.0
 * @date 2020/4/22 11:57
 */
public class ReadSystemIn {
    public static void main(String[] args) throws IOException {
        // 录入键盘输入
        InputStream in = System.in;
        InputStreamReader inputStreamReader = new InputStreamReader(in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String str = bufferedReader.readLine();
        // 读取键盘输入
        System.out.println(str);

    }
}
