package ringo.day12.date;

import java.util.Date;

public class DemoDate {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis()); //当前时间到1970年的毫秒数
        long time = System.currentTimeMillis();
        double year = time / 31536000000L;
        System.out.println(year + 1970);

//        Date date = new Date();
//        System.out.println(date);

        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime());
    }
}
