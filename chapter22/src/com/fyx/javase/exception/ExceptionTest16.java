package com.fyx.javase.exception;
/*
之前在讲解方法覆盖的时候，当时遗留了一个问题？
    重写之后的方法不能比重写之前的方法抛出更多的(更宽泛的)异常，可以更少

总结以下异常中的关键字：
    try
    catch
    finally
    throws
    throw
 */
public class ExceptionTest16 {
    public static void main(String[] args) {

    }
}

class Animal{
    public void doSome(){

    }
    public void doOther() throws Exception{

    }
}
class Cat extends Animal{
    //编译报错。
//    public void doSome() throws Exception{
//
//    }
    //编译正常
//    public void doOther(){
//
//    }
    //编译正常
    public void doOther()throws NullPointerException{

    }
}