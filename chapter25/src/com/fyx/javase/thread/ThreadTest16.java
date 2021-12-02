package com.fyx.javase.thread;

import java.util.ArrayList;
import java.util.List;

/*
1、使用wait()方法和notify()方法实现“生产者和消费者模式”

2、什么是“生产者和消费者模式”？
    生产线程负责生产，消费线程负责消费
    生产线程和消费线程要达到均衡

3、wait和notify方法不是线程对象的方法，是普通java对象都有的方法

4、wait和notify方法建立在线程同步的基础上。因为多线程要同时操作一个仓库，有线程安全问题

5、wait方法作用：o.wait()让正在o对象上获取的线程t进入等待状态，并且释放掉t线程之前占有的o对象的锁。

6、notify方法作用:o.notify()让正在o对象上等待的线程唤醒，只是通知，不会释放o对象上之前占有的锁

7、模拟这样一个需求：
    仓库我们采用list集合
    list集合中假设只能存储1个元素
    1个元素就表示仓库满了
    如果list集合中元素个数是0，就表示仓库空了
 */
public class ThreadTest16 {
    public static void main(String[] args) {
        //创建1个仓库对象，共享的
        List list = new ArrayList();
        //创建两个线程
        //生产者线程
        Thread t1 = new Thread(new Producer(list));
        //消费者线程
        Thread t2 = new Thread(new Consumer(list));

        t1.setName("生产者线程");
        t2.setName("消费者线程");

        t1.start();
        t2.start();
    }
}

//生产线程
class Producer implements Runnable{
    //仓库
    private List list;

    public Producer(List list){
        this.list = list;
    }

    @Override
    public void run() {
        //一直生产
        while (true){
            //给仓库对象list加锁。
            synchronized (list){
                if (list.size() > 0){  //大于0，说明仓库已经有1个元素
                    //当前线程进入等待状态,并且释放Producer之前占有的list集合的锁
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //仓库为空，可以生产
                Object o = new Object();
                list.add(o);
                System.out.println(Thread.currentThread().getName() + "--->" + o);
                //唤醒消费者进行消费
                list.notifyAll();
            }
        }
    }
}

//消费线程
class Consumer implements Runnable{
    //仓库
    private List list;

    public Consumer(List list){
        this.list = list;
    }
    @Override
    public void run() {
        //一直消费
        while (true){
            synchronized (list){
                if (list.size() == 0){
                    try {
                        //仓库已经空了，消费者线程等待，释放掉list集合的锁
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //仓库中有数据，进行消费
                Object o = list.remove(0);
                System.out.println(Thread.currentThread().getName() + "--->" + o);
                //唤醒生产者生产
                list.notifyAll();
            }
        }
    }
}