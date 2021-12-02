package com.fyx.javase.exception;

public class ExceptionTest14 {
    public static void main(String[] args) {
        //创建异常对象
        MyException myException = new MyException("用户名不能为空");
        //打印异常堆栈信息
        myException.printStackTrace();
        //获取异常简单描述信息
        String msg = myException.getMessage();
        System.out.println(msg);
    }
}
