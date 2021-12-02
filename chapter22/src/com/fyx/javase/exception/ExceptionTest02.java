package com.fyx.javase.exception;
/*
java语言中异常是以什么形式存在呢？
    1、异常在java中以类的形式存在，每一个异常类都可以创建异常对象
    2、异常对应的现实生活中是怎么样的
 */
public class ExceptionTest02 {
    public static void main(String[] args) {
        //通过"异常类"实例化"异常对象"
        NumberFormatException nfe = new NumberFormatException("数字格式化异常");
        System.out.println(nfe);//java.lang.NumberFormatException: 数字格式化异常

        NullPointerException npt = new NullPointerException("空指针异常发生了！");
        System.out.println(npt);
    }
}
