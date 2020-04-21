package ringo.day20.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *使用转换流读取字节流数据
 *
 * @author ringo
 * @version 1.0
 * @date 2020/4/21 20:21
 */
public class InputStreamReaderTest {
    public static void main(String[] args) throws IOException {
        String src = "day20-code/src/ringo/day20/io/java.txt";

        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(src), "GBK");

        int len = 0;
        char[] charArray = new char[1024];
        while ((len = inputStreamReader.read(charArray)) != -1 ) {
            System.out.println(new String(charArray, 0, len));
        }
//        int ch = 0;
//        while (ch != -1) {
//            ch = inputStreamReader.read();
//            System.out.print((char) ch);
//        }

    }
}
