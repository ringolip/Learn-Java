package ringo.day20.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * 利用转换流把字节流转换为字符流
 *
 * @author ringo
 * @version 1.0
 * @date 2020/4/21 20:05
 */
public class OutputStreamWriterTest {
    public static void main(String[] args) throws IOException {
        String src = "day20-code/src/ringo/day20/io/java.txt";

        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(src),
                "GBK");

        outputStreamWriter.write("中国");
        outputStreamWriter.write("a");

        outputStreamWriter.flush();

//        outputStreamWriter.close();


    }
}
