package com.kriss.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by kriss on 2017/6/21.
 * <p>
 * 和日期有关系的工具辅助类
 */
public class DateUtil {

    static SimpleDateFormat sdf = new SimpleDateFormat();



    public static Date getBirthDayByAge(int age) {
        if (age > 0) {
            Calendar calendar = Calendar.getInstance();
            calendar.add(Calendar.YEAR, -age);
            return calendar.getTime();
        } else
            return null;
    }

    public static String getDateString(Date date, String pattern) {
        if (date == null)
            return null;
        sdf.applyPattern(pattern);
        return sdf.format(date);
    }

    public static Date getDateFromString(String date,String pattern) {
        Date result = null;
        sdf.applyPattern(pattern);
        try {
           result = sdf.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static String getWeekBegin(String format) {
        sdf.applyPattern(format);
        Calendar calendar = Calendar.getInstance();
        calendar.setFirstDayOfWeek(2);
        calendar.set(Calendar.DAY_OF_WEEK, 2);
        return sdf.format(calendar.getTime());
    }

    public static String getWeekEnd(String format) {
        sdf.applyPattern(format);
        Calendar calendar = Calendar.getInstance();
        calendar.setFirstDayOfWeek(2);
        calendar.set(Calendar.DAY_OF_WEEK, 8);
        return sdf.format(calendar.getTime());
    }

    public static String getMonthBegin(String format) {
        sdf.applyPattern(format);
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        return sdf.format(calendar.getTime());
    }

    public static String getMonthEnd(String format) {
        sdf.applyPattern(format);
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, calendar.getMaximum(Calendar.DAY_OF_MONTH) - 1);
        return sdf.format(calendar.getTime());
    }


    public static void main(String ss[]) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.MONTH, 5);
        System.out.println(getDateString(calendar.getTime(), "M"));
    }
}
