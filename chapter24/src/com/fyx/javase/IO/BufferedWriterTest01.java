package com.fyx.javase.IO;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;

/*
BufferedWriter:带有缓冲的字符输出流
 */
public class BufferedWriterTest01 {
    public static void main(String[] args) throws Exception{
        //带有缓冲区的字符输出流
        BufferedWriter out = new BufferedWriter(new FileWriter("copy",true));
        //开始写
        out.write("hello world!");
        out.write("\n");
        out.write("hello kitty~");
        //刷新
        out.flush();
        //关闭最外层
        out.close();
    }
}
