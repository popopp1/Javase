package com.fyx.javase.IO;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;

public class BufferedReaderTest02 {
    public static void main(String[] args) throws Exception{
        //字节流
//      FileInputStream in = new FileInputStream("D:\\Java project\\Copy2.java");

        //通过转换流转换(InputStreamReader将字节流转换成字符流)
        //in是节点流，reader是包装流
//      InputStreamReader reader = new InputStreamReader(in);

        //reader是节点流，br是包装流
//      BufferedReader br = new BufferedReader(reader);
        //合并
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("D:\\\\Java project\\\\Copy2.java")));


        String s = null;
        while ((s = br.readLine()) != null){
            System.out.println(s);
        }
        //关闭最外层流
        br.close();
    }
}
