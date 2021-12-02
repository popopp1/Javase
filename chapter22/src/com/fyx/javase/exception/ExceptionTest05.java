package com.fyx.javase.exception;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
处理异常的第一种方式：在方法声明的位置上使用throws关键字抛出，谁调用我这个方法，我就抛给谁。抛给调用者处理

注意：
    只要异常没有捕捉，采用上报的方式，此方法的后续代码不会被执行。
    try语句块中的某一行出现异常，该行后面的代码不会执行
 */
public class ExceptionTest05 {
    public static void main(String[] args){
        System.out.println("main begin");
        try{
            m1();
        }catch (FileNotFoundException e){
            System.out.println("文件不存在，可能路径错误，也可能文件被删除了！！！");
            System.out.println(e);
        }
        System.out.println("main over");
    }
    private static void m1()throws FileNotFoundException{
        System.out.println("m1 begin");
        m2();
        System.out.println("m1 over");
    }
    private static void m2() throws FileNotFoundException{
        System.out.println("m2 begin");
        m3();
        System.out.println("m2 over");
    }
    private static void m3() throws FileNotFoundException{
        new FileInputStream("D:\\pict");
    }
}
