package ringo.day19.file;

import java.io.File;
import java.io.IOException;

/**
 * @author ringo
 * @version 1.0
 * @date 2020/4/20 22:00
 */
public class FileTest {
    public static void main(String[] args) throws IOException {
//        String src = "day19-code/src/ringo/day19/file";
        String src = "day19-code/src/ringo/day19";
        File file = new File(src);
        String[] list = file.list();

        for (String str : list) {
            System.out.println(str);
        }
    }
}
