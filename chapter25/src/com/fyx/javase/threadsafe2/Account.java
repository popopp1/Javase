package com.fyx.javase.threadsafe2;

/*
银行账号
    不使用线程同步机制，多线程对同一个账户进行取款，出现线程安全问题
 */
public class Account {
    //账号
    private String actno;
    //余额
    private double balance;

    Object obj = new Object();   //实例变量(Account对象是多线程共享的，Account对象中的实例变量obj也是共享的)

    public Account() {
    }

    public Account(String actno, double balance) {
        this.actno = actno;
        this.balance = balance;
    }

    public String getActno() {
        return actno;
    }

    public void setActno(String actno) {
        this.actno = actno;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //取款方法
    public void withdraw(double money){
        //以下这几行代码必须是线程排队的，不能并发
        //一个线程把这里的代码全部执行结束之后，另一个线程才能进来
        /*
          线程同步机制的语法是：
            synchronized (){
                //线程同步代码块
            }
            synchronized后面小括号中传的这个“数据”是相当关键的
            这个数据必须是多线程共享的数据，才能达到多线程排队

            这里的共享对象是：账户对象
            账户对象是共享的，那么this就是账户对象！
            注意：不一定是this！！！！
         */
        synchronized (this){
        //synchronized(obj){
        //synchronized("abc"){    //"abc"在字符串常量池中,不过所有线程都会同步
            double before = this.getBalance();
            double after = before - money;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.setBalance(after);
        }
    }
}
