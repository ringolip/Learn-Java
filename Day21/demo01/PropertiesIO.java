package ringo.day21.demo01;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

/**
 * @author ringo
 * @version 1.0
 * @date 2020/4/22 10:23
 */
public class PropertiesIO {
    public static void main(String[] args) throws IOException {
        String src = "day21-thread/src/ringo/day21/demo01";

        Properties properties = new Properties();
        Reader reader = new FileReader(src + "/java.txt");

        // 将文件中数据存储到集合
        properties.load(reader);
        reader.close();

        System.out.println(properties);

    }
}
