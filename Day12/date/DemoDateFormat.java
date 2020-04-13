package ringo.day12.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DemoDateFormat {
    public static void main(String[] args) throws ParseException { // 声明异常
        // 格式化日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年M月dd日HH时mm分");
        Date date = new Date();
        String dateString = sdf.format(date);
        System.out.println(date);
        System.out.println(dateString);

        // 解析
        Date parseDate = sdf.parse(dateString);
        System.out.println(parseDate);

    }
}
