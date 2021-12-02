package com.fyx.javase.exception;
/*
1、java中怎么自定义异常呢？
    两步：
        第一：编写一个类继承Exception或者RuntimeException
        第二：提供两个构造方法，一个无参数的，一个带有String参数的。
 */
public class MyException extends Exception{
    public MyException() {
    }
    public MyException(String s){
        super(s);
    }
}
