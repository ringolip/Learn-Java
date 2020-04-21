package ringo.day20.io;

import java.io.*;

/**
 * @author ringo
 * @version 1.0
 * @date 2020/4/21 21:42
 */
public class ReadlineTest {
    public static void main(String[] args) throws IOException {
        String src = "day20-code/src/ringo/day20/io";
        BufferedWriter bw = new BufferedWriter(new FileWriter(src + "/java.txt"));

        // 封装数据源
        BufferedReader bufferedReader = new BufferedReader(new FileReader(src + "/java.txt"));

        // 封装目的地
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(src + "/scala.txt"));

        for (int i = 0; i < 10; i++) {
            bw.write("我爱黎明");
            bw.newLine();
            bw.flush();
        }


        // 读写数据
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }

        bw.close();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
