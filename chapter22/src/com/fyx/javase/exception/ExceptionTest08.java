package com.fyx.javase.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
异常对象有两个非常重要的方法：
    获取异常简单的描述信息：
        String msg = exception.getMessage();
    打印异常追踪的堆栈信息：
        exception.printStackTrace();

我们以后查看异常的追踪信息，我们应该怎么看，可以快速的调试程序呢？
    异常信息追踪信息，从上往下一行一行看。
    注意的是：SUN编写的代码就不用看了，主要问题出现在自己编写的代码上
 */
public class ExceptionTest08 {
    public static void main(String[] args) {
        try {
            m1();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void m1() throws FileNotFoundException {
        m2();
    }

    private static void m2() throws FileNotFoundException {
        m3();
    }

    private static void m3() throws FileNotFoundException {
        new FileInputStream("D:\\pict\\test.txt");
    }
}
