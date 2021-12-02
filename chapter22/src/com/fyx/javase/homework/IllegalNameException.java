package com.fyx.javase.homework;
//自定义异常类
public class IllegalNameException extends Exception{
    public IllegalNameException() {

    }
    public IllegalNameException(String s) {
        super(s);
    }
}
