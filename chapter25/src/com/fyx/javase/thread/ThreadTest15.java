package com.fyx.javase.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/*
实现线程的第三种方式
    实现Callable接口
 */
public class ThreadTest15 {
    public static void main(String[] args) throws Exception{
        //创建一个“未来任务类”对象
        FutureTask task = new FutureTask(new Callable() {
            @Override
            public Object call() throws Exception {  //call()方法相当于run方法，只不过这个又返回值
                //线程执行一个任务，执行之后可能会有一个执行结果
                System.out.println("call method begin");
                Thread.sleep(1000 * 10);
                System.out.println("call method end!");
                int a = 100;
                int b = 200;
                return a + b;
            }
        });
        //创建线程对象
        Thread t = new Thread(task);

        //启动线程
        t.start();

        //在主线程中，怎么获取t线程的执行结果
        //get()方法的执行会导致当前线程的阻塞
        Object obj = task.get();
        System.out.println("线程执行结果" + obj);

        //main方法这里的程序要想执行必须先等待get()方法的结束
        //而get()方法可能需要很久，因为get()方法是为了拿另外一个线程的执行结果
        //另一个线程的执行是需要时间的
        System.out.println("hello world!");

    }
}
