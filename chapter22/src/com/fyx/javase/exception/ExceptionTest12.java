package com.fyx.javase.exception;
/*
finally面试题
 */
public class ExceptionTest12 {
    public static void main(String[] args) {
        int result = m();
        System.out.println(result);//100
    }

    public static int m(){
        int i = 100;
        try{
            //这行代码出现在int i = 100;的下面，所以最终结果必然是返回100
            return i;
        }finally {
            i++;
        }
    }
}
