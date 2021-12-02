package com.fyx.javase.exception;
/*
    1.编译时异常和运行时异常的区别：
        编译时异常一般发生的概率时比较高
        运行时异常一般发生的概率比较低
    2.java语言中对异常的处理包括两种方式：
        第一种方式：在方法声明的位置上，使用throws关键字，抛给上一级。
        第二种方式：使用try...catch语句进行异常的捕捉。
    3.注意：java中异常发生之后如果一直上抛，最终抛给了main方法，main方法继续向上抛，
    抛给了调用者JVM，JVM知道这个异常发生，只有一个结果，最终java程序的执行。
 */
public class ExceptionTest03 {
    public static void main(String[] args) {

    }
}