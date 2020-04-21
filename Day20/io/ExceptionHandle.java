package ringo.day20.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 字节输出流的异常处理
 *
 * @author ringo
 * @version 1.0
 * @date 2020/4/21 13:31
 */
public class ExceptionHandle {
    public static void main(String[] args) {
        String src = "day20-code/src/ringo/day20/io/java.txt";

        FileOutputStream fileOutputStream = null;
        try{
            fileOutputStream = new FileOutputStream(src);

            fileOutputStream.write("异常处理".getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) { // 多重捕获，先处理子类异常
            e.printStackTrace();
        } finally {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
