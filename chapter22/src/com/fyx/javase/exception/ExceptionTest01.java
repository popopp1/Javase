package com.fyx.javase.exception;
/*
    1、什么是异常，java提供异常机制有什么用？
        以下程序执行过程中发生了不正常的情况，而这种不正常的情况叫做：异常
        java把该异常信息打印输出到控制台，供程序员参考。

 */
public class ExceptionTest01 {
    public static void main(String[] args) {
        int a = 20;
        int b = 0;
        int c = a / b;
        System.out.println(a+"/"+b+"="+c);
    }
}
