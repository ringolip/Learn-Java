package ringo.day21.demo01;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author ringo
 * @version 1.0
 * @date 2020/4/22 11:28
 */
public class PrintWriterTest {
    public static void main(String[] args) throws IOException {
        String src = "day21-thread/src/ringo/day21/demo01";

        PrintWriter printWriter = new PrintWriter(new FileWriter(src + "/print.txt"), true);
        printWriter.println(true);
        printWriter.println("hello");
        printWriter.println(100);
    }
}
