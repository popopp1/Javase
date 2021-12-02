package com.fyx.javase.reflect;

import java.io.FileReader;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.util.Properties;

public class IoPropertiesTest {
    public static void main(String[] args) throws Exception{

        //获取一个文件的绝对路径
//        String path = Thread.currentThread().getContextClassLoader()
//                .getResource("classinfo2.properties").getPath();
//
//        FileReader reader = new FileReader(path);
        InputStream reader = Thread.currentThread().getContextClassLoader()
                .getResourceAsStream("classinfo2.properties");

        Properties pro = new Properties();
        pro.load(reader);
        reader.close();
        //通过key获取value
        String className = pro.getProperty("className");
        System.out.println(className);
    }
}
