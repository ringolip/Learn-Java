package ringo.day20.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author ringo
 * @version 1.0
 * @date 2020/4/21 13:52
 */
public class FileInputTest {
    public static void main(String[] args) throws IOException {
        String src = "day20-code/src/ringo/day20/io/Recursion.java";

        FileInputStream fileInputStream = new FileInputStream(src);
//        int data = 0;
//        while ((data = fileInputStream.read()) != -1) {
//            System.out.print((char) data);
//        }
        byte[] byteArray = new byte[1024];
        int len = 0;
        while ((len = fileInputStream.read(byteArray)) != -1) {
            System.out.println(len);
            System.out.println(new String(byteArray, 0, len));
        }


        fileInputStream.close();
    }
}
