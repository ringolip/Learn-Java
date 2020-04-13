package ringo.day12.date;

import java.util.Calendar;

// 计算任意一年的2月有多少天
public class DaysInFebruary {
    public static void main(String[] args) {
        int year = 2019; // 需要计算的年份

        // 调用方法
        int days = calculateDays(year);
        System.out.println(year + "年的2月有" + days + "天");
    }

    // 简便方法
    public static int calculateDays(int year) {
        Calendar calendar = Calendar.getInstance();

        // 设置日历为3月1日
        calendar.set(year, 2, 1);
        // 将日期提前一天
        calendar.add(Calendar.DATE, -1);

        return calendar.get(Calendar.DATE);
    }

//    public static long calculateDays(int year) {
//        long days; // 天数
//        Calendar calendar = Calendar.getInstance();
//
//        // 设置日历为3月1日
//        calendar.set(year, 2, 1);
//        // 返回日历时间值
//        long marchTime = calendar.getTimeInMillis();
//
//        // 设置日历为2月1日
//        calendar.set(year, 1, 1);
//        // 计算2月1日的毫秒
//        long februaryTime = calendar.getTimeInMillis();
//
//        // 计算2月的天数
//        days = (marchTime - februaryTime) / 86400000;
//
//        return days;
//    }
}
