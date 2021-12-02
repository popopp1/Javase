package com.fyx.javase.reflect;

import java.io.FileReader;

/*
文件路径
 */
public class AboutPath {
    public static void main(String[] args) {
        //这种方式的路径缺点是：移植性差，在IDEA中默认的当前路径是project的根
        //这个代码假设离开了IDEA，换到了其他位置，当前路径就不是project根了，这时这个路径就无效了
        //FileReader reader = new FileReader("chapter26/classinfo.properties");

        //注意：使用以下通用方式的前提是:这个代码文件必须在类路径下
        //凡是在src下的都是类路径下

        /*
            getContextClassLoader()是线程对象的方法，可以获取到当前线程的类加载对象
            getResource()【获取资源】这是类加载器对象的方法，当前线程的类加载器默认类的根路径下加载资源
         */

        String path = Thread.currentThread().getContextClassLoader()
                .getResource("classinfo2.properties").getPath();

        System.out.println(path);

        //获取db.properties文件的绝对路径
        String path2 = Thread.currentThread().getContextClassLoader()
                .getResource("com/fyx/javase/bean/db.properties").getPath();
        System.out.println(path2);
    }
}
