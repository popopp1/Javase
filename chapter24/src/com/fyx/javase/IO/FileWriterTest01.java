package com.fyx.javase.IO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
    FileWriter:
        文件字符输出流。写
        只能输出普通文本
*/
public class FileWriterTest01 {
    public static void main(String[] args) {
        FileWriter out = null;
        try {
            //创建文件字符输出流对象
           // out = new FileWriter("file");
            out = new FileWriter("file",true);

            //开始写
            char[] chars = {'我','爱','赖','b','b'};
            out.write(chars);
            out.write(chars,2,3);//截取前两个字符，从第三个字符开始写入
            out.write("我是一名java小菜鸟");
            //写出一个换行符
            out.write("\n");
            out.write("hello world");

            //刷新
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
