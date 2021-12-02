package com.fyx.javase.exception;
/*
finally语句。
    finally语句块中的代码是一定会执行的。
 */
public class ExceptionTest10 {
    public static void main(String[] args) {
        /*
        try和finally，没有catch可以嘛？可以
            try不能单独使用
            try finally可以联用
        以下代码的执行顺序：
            先执行try...
            再执行finally...
            最后执行return(return语句执行方法必然结束)
         */
        try{
            System.out.println("try.....");
            return;
        }finally {
            System.out.println("finally....");
        }
    }
}
