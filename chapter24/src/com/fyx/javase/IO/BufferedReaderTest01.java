package com.fyx.javase.IO;

import java.io.BufferedReader;
import java.io.FileReader;

/*
BufferReader
    带有缓冲区的字符输入流
    使用这个流的时候，不需要自定义char数组，或者byte数组，自带缓冲
 */
public class BufferedReaderTest01 {
    public static void main(String[] args) throws Exception{
        FileReader reader = new FileReader("D:\\Java project\\Copy2.java");
        //当一个流的构造方法中需要一个流的时候，被传进来的流叫做：节点流
        //外部负责包装的这个流，叫做：包装流，还有一个名字，叫做：处理流
        //像当前这个程序来说：FileReader就叫做节点流，BufferedReader叫做包装流/处理流
        BufferedReader br = new BufferedReader(reader);

        //读一行
        /*
        String firstLine = br.readLine();
        System.out.println(firstLine);

        String SecondLine = br.readLine();
        System.out.println(SecondLine);

        String line3 = br.readLine();
        System.out.println(line3);*/

        String s = null;
        while ((s = br.readLine()) != null){
            System.out.println(s);
        }

        //关闭流
        //对于包装流来说，只需要关闭最外层流就行，里面的节点流会自动关闭
        br.close();
    }
}
