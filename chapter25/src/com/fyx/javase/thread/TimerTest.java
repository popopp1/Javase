package com.fyx.javase.thread;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/*
使用定时器指定定时任务
 */
public class TimerTest {
    public static void main(String[] args) throws Exception{

        //创建定时器对象
        Timer timer = new Timer();
        //指定定时任务
        //timer.schedule(定时任务，第一次执行时间，间隔多久执行一次);
        //获取时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date firstTime = sdf.parse("2021-10-16 15:57:30");
        timer.schedule(new LogTimerTask(),firstTime,1000 * 10);
    }
}

//编写一个定时任务类
//记录日志的定时任务
class LogTimerTask extends TimerTask{

    @Override
    public void run() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String strTime = sdf.format(new Date());
        System.out.println(strTime + "成功完成了一次数据备份！");
    }
}