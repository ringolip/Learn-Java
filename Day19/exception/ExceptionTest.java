package ringo.day19.exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 处理异常
 *
 * @author ringo
 * @version 1.0
 * @date 2020/4/20 13:52
 */
public class ExceptionTest {
    public static void main(String[] args){
        String s = "2020-04-20";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        try {
            Date date = sdf.parse(s); // 1.创建ParseException对象，抛出，和catch里面进行匹配
            System.out.println(date);
        } catch (ParseException e) { // 2.ParseException e = new ParseException()
//            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        }


    }
}
