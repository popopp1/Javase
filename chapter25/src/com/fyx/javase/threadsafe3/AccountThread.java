package com.fyx.javase.threadsafe3;

public class AccountThread extends Thread{

    //两个线程必须同时共享同一个账户对象
    private Account act;

    //通过构造方法传递过来账户对象
    public AccountThread(Account act){
        this.act = act;
    }

    public void run(){
        //run方法的执行表示取款
        //假设取款5000
        double money = 5000;
        //取款
        //多线程并发执行这个方法
        act.withdraw(money);

        System.out.println("账户" + act.getActno()+"取款成功,余额" + act.getBalance());
    }
}
