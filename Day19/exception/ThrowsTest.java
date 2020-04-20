package ringo.day19.exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author ringo
 * @version 1.0
 * @date 2020/4/20 18:04
 */
public class ThrowsTest {
    public static void main(String[] args) {
        System.out.println("开始");
        try {
            methods();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("结束");
    }

    // 告诉调用者
    public static void methods() throws ParseException{
        String s = "2020-04-20";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Date date = sdf.parse(s); // 1.创建ParseException对象，抛出，和catch里面进行匹配
        System.out.println(date);
    }

}
