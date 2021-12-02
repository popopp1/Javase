package com.fyx.javase.IO;

import java.io.FileOutputStream;
import java.io.PrintStream;

/*
java.io.PrintStream:标准的字节输入流，默认输出到控制台
 */
public class PrintStreamTest01 {
    public static void main(String[] args) throws Exception{
        //联合起来写
        System.out.println("hello world!");

        //分开写
        PrintStream ps = System.out;
        ps.println("hello ljy");
        ps.println("hello 赖bb");
        ps.println("hello kitty");
        //标准输出流不需要手动close()关闭
        //可以改变标准输出流的输出方向吗？
        //标准输出流不再指向控制台，指向“log”文件
        PrintStream printStream = new PrintStream(new FileOutputStream("log"));
        //修改输出方向，将输出方向修改到"log"文件
        System.setOut(printStream);
        System.out.println("hello world");
        System.out.println("hello kitty");
        System.out.println("hello ljy");
    }
}
