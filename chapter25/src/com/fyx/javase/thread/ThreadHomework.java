//package com.fyx.javase.thread;
//
//public class ThreadHomework {
//    public static void main(String[] args) {
//        Producer2.Num num = new Producer2.Num();
//        Thread t1 = new Thread(new Producer2(num));
//
//        Consumer2.Num num2 = new Consumer2.Num();
//        Thread t2 = new Thread(new Consumer2(num2));
//
//        t1.setName("t1");
//        t2.setName("t2");
//
//        t1.start();
//        t2.start();
//    }
//}
//
//
//class Producer2 implements Runnable{
//    public static class Num{
//
//    }
//
//    private Num num;
//
//    public Producer2(Num num){
//        this.num = num;
//    }
//
//    @Override
//    public void run() {
//        int i =0;
//        while (true){
//            synchronized (num){
//                if (i / 2 != 0 ){
//                    try {
//                        num.wait();
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//                i++;
//                System.out.println(Thread.currentThread().getName() + "-->" + i);
//                num.notifyAll();
//            }
//        }
//    }
//}
//
//class Consumer2 implements Runnable{
//    public static class Num{
//
//    }
//    private Num num;
//
//    public Consumer2(Num num){
//        this.num = num;
//    }
//    @Override
//    public void run() {
//        int i = 0;
//        while (true){
//            synchronized (num){
//                if (i / 2 ==0){
//                    try {
//                        num.wait();
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//                i++;
//                System.out.println(Thread.currentThread().getName() + "--->" + i);
//                num.notifyAll();
//            }
//        }
//    }
//}