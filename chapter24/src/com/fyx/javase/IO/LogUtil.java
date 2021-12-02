package com.fyx.javase.IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
日志工具
 */
public class LogUtil {
    /*
        记录日志的方法
     */
    public static void logger(String msg){
        try {
            //标准输出流指向一个"log"文件
            PrintStream printStream = new PrintStream(new FileOutputStream("log.txt",true));
            //改变输出方向
            System.setOut(printStream);
            //日期当前时间
            Date nowTime = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-HH-dd HH:mm:ss");
            String strTime = sdf.format(nowTime);
            //
            System.out.println(strTime + ":" + msg);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
