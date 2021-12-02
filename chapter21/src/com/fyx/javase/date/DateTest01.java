package com.fyx.javase.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
java中对日期的处理
 */
public class DateTest01 {
    public static void main(String[] args) throws ParseException {
        //系统当前时间（精确到毫秒的系统当前时间），直接调用无参构造方法
        Date nowTime = new Date();
        System.out.println(nowTime);

        //将日期类型Date，按照指定的格式进行转换：Date --转换成具有一定格式的日期字符串-->String
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String nowTimeString = sdf.format(nowTime);
        System.out.println(nowTimeString);

        //String --->  Date
        String time = "2002-12-21 12:21:12";
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date time2 = sdf2.parse(time);
        System.out.println(time2);
    }
}
