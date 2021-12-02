package com.fyx.javase.thread;

/*
关于Thread.sleep()方法的一个面试题：
 */
public class ThreadTest07 {
    public static void main(String[] args) {
        //创建线程对象
        Thread t = new MyThread3();
        t.setName("t");
        t.start();

        //调用sleep()方法
        try {
            //这行代码会让t线程进入休眠状态吗？
            t.sleep(1000*5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //5秒之后才会执行
        System.out.println("hello world！");
    }
}

class MyThread3 extends Thread{
    public void run(){
        for (int i = 0; i <10000 ; i++) {
            System.out.println(Thread.currentThread().getName()+"---->" + i);
        }
    }
}