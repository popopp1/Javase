package com.fyx.javase.reflect;

import java.util.ResourceBundle;

/*
java.util包下提供一个资源绑定器,便于获取属性配置文件中的内容
属性配置文件xxx.properties必须放到类路径下
 */
public class ResourceBundleTest {
    public static void main(String[] args) {
        //资源绑定器，只能绑定xxx.properties文件，并且这个文件必须在类路径下，文件扩展名也必须是properties
        //并且写路径的时候，路径后面的扩展名不能写
        ResourceBundle bundle = ResourceBundle.getBundle("classinfo2");
        ResourceBundle bundle1 = ResourceBundle.getBundle("com/fyx/javase/bean/db");

        String className = bundle.getString("className");
        System.out.println(className);

        String username = bundle1.getString("userName");
        System.out.println(username);

    }
}
