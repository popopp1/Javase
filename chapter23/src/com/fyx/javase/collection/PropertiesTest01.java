package com.fyx.javase.collection;

import java.util.Properties;

/*
Properties属性类对象的方法
    Properties是一个Map集合，继承Hashtable，Properties的key和value都是String类型
    Properties被称为属性类对象
    Properties是线程安全的
 */
public class PropertiesTest01 {
    public static void main(String[] args) {
        //创建Properties对象
        Properties pro = new Properties();

        //需要掌握Properties的两个方法，一个存，一个取
        pro.setProperty("url","jdbc:mysql://localhost:3306/ljyljyljy");
        pro.setProperty("driver","com.mysql.jdbc.Driver");
        pro.setProperty("username","root");
        pro.setProperty("password","123");

        //通过key获取value
        String url = pro.getProperty("url");
        String driver = pro.getProperty("driver");
        String username = pro.getProperty("username");
        String password = pro.getProperty("password");

        System.out.println(url);
        System.out.println(driver);
        System.out.println(username);
        System.out.println(password);
    }
}
