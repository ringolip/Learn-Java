package ringo.day20.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 字节输出流向文件输出数据
 *
 * @author ringo
 * @version 1.0
 * @date 2020/4/21 12:35
 */
public class FileOutputTest {
    public static void main(String[] args) throws IOException {
        // 查看路径
        String src = "day20-code/src/ringo/day20/io/java.txt";
//        File file = new File("day20-code/src/ringo/day20/io/java");
//        System.out.println(file.getAbsolutePath());

        // 创建子节流输出对象
        FileOutputStream fileOutputStream = new FileOutputStream(src, true);
        for (int i = 0; i < 10; i++) {
            // 将字符串转换为字节数组
            String writeString = "通过字节输出流向文件输出数据" + "\n";
            byte[] bytesArray = writeString.getBytes();

            // 向文件写入字节数组
            fileOutputStream.write(bytesArray);

        }

        // 释放资源
        fileOutputStream.close();
    }
}
