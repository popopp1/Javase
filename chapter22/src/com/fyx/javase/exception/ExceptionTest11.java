package com.fyx.javase.exception;
/*
finally语句
    退出JVM之后，finally就不执行了
 */
public class ExceptionTest11 {
    public static void main(String[] args) {
        try{
            System.out.println("try...");
            //退出JVM
            System.exit(0);
        }finally {
            System.out.println("finally...");
        }
    }
}
