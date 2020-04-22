package ringo.day21.demo01;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/**
 * @author ringo
 * @version 1.0
 * @date 2020/4/22 09:52
 */
public class PropertiesTest {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        System.out.println(properties);

        properties.setProperty("ringo", "25");
        properties.setProperty("tom", "21");
        properties.setProperty("ben", "22");

        // 集合存储到文件
        String src = "day21-thread/src/ringo/day21/demo01";

        FileWriter fileWriter = new FileWriter(src + "/write.txt");
        properties.store(fileWriter, null);
        fileWriter.close();

//        Set<Object> objects = properties.keySet();
        Set<String> strings = properties.stringPropertyNames();
        for (String key : strings) {
            String value = properties.getProperty(key);
            System.out.println(key + " -- " + value);
        }

    }
}
