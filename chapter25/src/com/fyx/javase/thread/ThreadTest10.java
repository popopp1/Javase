package com.fyx.javase.thread;

/*
怎么合理的终止一个线程的执行，

 */
public class ThreadTest10 {
    public static void main(String[] args) {
        MyRunnable4 mr4 = new MyRunnable4();
        Thread t = new Thread(mr4);
        t.setName("t");
        t.start();

        //模拟5秒
        try {
            Thread.sleep(1000 * 5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //终止线程
        mr4.run = false;
    }
}

class MyRunnable4 implements Runnable{
    boolean run = true;

    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            if (run){
                System.out.println(Thread.currentThread().getName() + "--->" + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else {
                //终止当前线程
                return;
            }
        }
    }
}