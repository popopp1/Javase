package com.fyx.javase.exception;
/*
final、finally、finalize有什么区别
    final 关键字
        final 修饰的类无法继承
        final 修饰的方法无法覆盖
        final 修饰的变量不能重新赋值
    finally 关键字
        和try联合使用
        finally语句块中的代码一定会执行
    finalize 标识符
        是一个Objcet类中的方法名
        这个方法是由垃圾回收器GC负责调用的
 */
public class ExceptionTest13 {
    public static void main(String[] args) {
        //final是一个关键字，表示最终的，不变的。
        final int i = 100;
//        i = 200;

        //finally也是一个关键字，和try联合使用，使用在处理异常机制中    在finally语句块中的代码一定会执行。
        try{

        }finally {
            System.out.println("finally....");
        }

        //finalize()是Object类中的一个方法。作为方法名出现。  所以finalize是标识符


    }
}
//final修饰的类无法继承
final class A{

}
class B{
    //final修饰的方法无法覆盖
    public final void doSome(){

    }
}