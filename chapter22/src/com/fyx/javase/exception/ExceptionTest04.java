package com.fyx.javase.exception;
/*
1.main方法不加throws ClassNotFoundException的话会报错
    因为doSome()方法声明位置上使用了：throws ClassNotFoundException
    而ClassNotFoundException是编译时异常。
 */
public class ExceptionTest04 {
    //第一种处理方式：在方法声明上继续使用：throws，来完成异常的继续上抛。抛给调用者。
//    public static void main(String[] args) throws ClassNotFoundException {
//        //调用doSome()方法时，必须对这种异常进行预先处理，如果不处理，编译器就报错
//        doSome();
//    }
    //第二种处理方式：try...catch进行捕捉
    public static void main(String[] args) {
        try {
            doSome();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    /*
        doSome()方法在方法声明的位置上使用了：throws ClassNotFoundException  表示doSome()方法在执行过程中，有可能会出现
        ClassNotFoundException异常，叫做类没找到异常。这个异常直接父类时：Exception，所以ClassNotFoundException属于编译时异常
    */
    public static void doSome() throws ClassNotFoundException{
        System.out.println("doSome!!");
    }
}
