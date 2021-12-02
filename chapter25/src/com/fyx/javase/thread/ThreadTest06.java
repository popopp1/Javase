package com.fyx.javase.thread;

/*
关于线程的sleep();方法
    static void sleep(long millis)
    1、静态方法：Thread.sleep(1000)
    2、参数是毫秒
    3、作用：让当前线程进入休眠，进入"阻塞状态"，放弃占有CPU时间片，让给其他线程使用
        这行代码出现在A线程中，A线程就进入休眠
        出现在B线程中，B线程就进入休眠
 */
public class ThreadTest06 {
    public static void main(String[] args) {
        //让当前线程进入休眠，睡眠5s
        //当前线程是主线程
        try {
            Thread.sleep(1000 * 5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //5秒之后执行这里的代码
        System.out.println("hello world!");

        for (int i = 0; i <10 ; i++) {
            System.out.println(Thread.currentThread().getName() + "---->" + i);

            //休眠1s
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
