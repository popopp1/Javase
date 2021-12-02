package com.fyx.javase.thread;

/*
关于线程的优先级
 */
public class ThreadTest11 {
    public static void main(String[] args) {
        System.out.println("最高优先级:" + Thread.MAX_PRIORITY);//10
        System.out.println("最低优先级:" + Thread.MIN_PRIORITY);//1
        System.out.println("默认优先级:" + Thread.NORM_PRIORITY);//5

        //获取当前线程对象，获取当前线程优先级
        Thread currentThread = Thread.currentThread();
        System.out.println(currentThread.getName()+ "线程的默认优先级是：" + currentThread.getPriority());

        Thread t = new Thread(new MyRunnable5());
        t.setPriority(10);
        t.setName("t");
        t.start();

        //优先级高的线程，只是抢到的CPU时间片相对多一点
        //大概率方向偏向于优先级比较高的
        for (int i = 0; i <10000 ; i++) {
            System.out.println(Thread.currentThread().getName() + "--->" + i);
        }
    }
}

class MyRunnable5 implements Runnable{

    @Override
    public void run() {
        //获取当前线程优先级
        //System.out.println(Thread.currentThread().getName()+"线程的默认优先级:" + Thread.currentThread().getPriority());
        for (int i = 0; i <10000 ; i++) {
            System.out.println(Thread.currentThread().getName() + "--->" + i);
        }
    }
}