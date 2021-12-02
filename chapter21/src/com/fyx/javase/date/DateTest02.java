package com.fyx.javase.date;

import java.text.SimpleDateFormat;

/*
    获取自1970年1月1日 00:00:00 000到当前系统时间的总毫秒数
 */
public class DateTest02 {
    public static void main(String[] args) {
        //获取自1970年1月1日 00:00:00 000到当前系统时间的总毫秒数
        Long nowTimeMillis = System.currentTimeMillis();
        System.out.println(nowTimeMillis);//1630832703381

        SimpleDateFormat sdf = new SimpleDateFormat();
        String time = sdf.format(nowTimeMillis);
        System.out.println(time);//21-9-5 下午5:05

        Long begin = System.currentTimeMillis();
        print();
        Long end = System.currentTimeMillis();
        System.out.println("耗费时长"+(end - begin)+"毫秒");

    }
    //统计一个方法耗时
    public static void print(){
        for (int i = 0; i <1000 ; i++) {
            System.out.println("i = " + i);
        }
    }
}
