package com.fyx.javase.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
深入try...catch
    1、catch后面的小括号的类型可以时具体的异常类型，也可以是该异常类型的夫类型。
    2、catch写多个，建议catch的时候，精确的一个一个处理。这样有利于程序的调试。
    3、catch写多个的时候，从上到下，必须遵守从小到大。

在以后的开发中，处理编译异常，应该是上报还是捕捉呢，怎么选？
    如果希望调用者来处理，选择throws上报。
    其他情况使用捕捉的方式
 */
public class ExceptionTest06 {
    public static void main(String[] args) {
//        try{
//            //创建输入流
//            FileInputStream fis = new FileInputStream("D:\\pict\\test1.txt");
//            //读文件
//            fis.read();
//            System.out.println("文件存在！");
//        }catch (Exception e){//所有的异常都走这个分支
//            //以上正常执行，此处不执行
//            System.out.println("文件不存在！");
//        }
        try{
            //创建输入流
            FileInputStream fis = new FileInputStream("D:\\pict\\test1.txt");
            //读文件
            fis.read();
        }catch (FileNotFoundException e){
            //以上正常执行，此处不执行
            System.out.println("文件不存在！！！");
        }catch (IOException e){
            e.printStackTrace();
        }

    }

}
