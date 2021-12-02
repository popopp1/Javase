package com.fyx.javase.exception;
/*
异常对象有两个非常重要的方法：
    获取异常简单的描述信息：
        String msg = exception.getMessage();
    打印异常追踪的堆栈信息：
        exception.printStackTrace();
 */
public class ExceptionTest07 {
    public static void main(String[] args) {
        NullPointerException npe = new NullPointerException("空指针异常");
        //获取异常简单的描述信息:这个信息实际上就是构造方法上面String参数。
        String msg = npe.getMessage();
        System.out.println(msg);
        //打印异常堆栈信息:
        //java在后台打印异常堆栈信息的时候，采用了异步线程的方式打印的
        npe.printStackTrace();

        System.out.println("Hello World!!");
    }
}
