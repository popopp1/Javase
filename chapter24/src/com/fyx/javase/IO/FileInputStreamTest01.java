package com.fyx.javase.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
java.io.FileInputStream:
    1、文件字节输入流，万能的，任何类型的文件都可以采用这个流来读
    2、字节的方式：完成输入的操作，完成读的操作(硬盘-->内存)
    3、读到文件的末尾了，再读的时候读取不到任何数据，返回-1
 */
public class FileInputStreamTest01 {
    public static void main(String[] args){
        FileInputStream fis = null;
        try {
            //创建文件字节输入流对象
            //文件路径：D:\Temp\temp
            fis = new FileInputStream("D:\\Temp\\temp");

            //开始读
            int readData = fis.read();//这个方法的返回值是：“读取到的“字节”本身”
            System.out.println(readData);//97

            readData = fis.read();
            System.out.println(readData);//98

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //在finally语句块中确保流一定关闭
            if (fis != null) {//避免空指针异常
                //关闭流的前提是：流不是空，流是null的时候没必要关闭
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
