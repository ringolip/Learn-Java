package ringo.day12.date;

import java.util.Calendar;

import static java.util.Calendar.*;

// Calendar
public class DemoCalendar {
    public static void main(String[] args) {
        Calendar calendar = getInstance();
        int year = calendar.get(YEAR);
        int month = calendar.get(MONTH);
        int date = calendar.get(DATE);

        String calendarString =  year + "年" + (month + 1) + "月" + date + "日";
        System.out.println(calendarString);

        // 将日期提前5年
        calendar.add(YEAR, -5);
        year = calendar.get(YEAR);
        System.out.println(year);
        calendar.set(YEAR, 2014);
        year = calendar.get(YEAR);
        System.out.println(year);
    }

}