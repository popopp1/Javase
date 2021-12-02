package com.fyx.javase.IO;

import java.io.FileReader;
import java.util.Properties;

/*
IO+Properties的联合应用
    Properties是一个Map集合，key和value都是String类型
    想将userinfo文件中的数据加载到Properties对象当中
。。。
    以后经常改变的数据，可以单独写到一个文件中，使用程序动态读取
    将来只需要修改这个文件的内容，java代码不需要改动，不需要重新编译，
    服务器也不需要重启，就可以拿到动态的信息

    类似于以上机制的这种文件被称为配置文件
    并且当配置文件中的内容格式是：
        key1=value1
        key2=value2
    的时候，我们把这种配置文件叫做“属性配置文件”   建议以.properties结尾

 */
public class IOPropertiesTest {
    public static void main(String[] args) throws Exception{
        //新建一个输入流对象
        FileReader fileReader = new FileReader("chapter24/userinfo");

        //新建一个Map集合
        Properties pro = new Properties();

        //调用Properties对象的load方法将文件中的数据加载到Map集合中
        pro.load(fileReader);

        //通过key来获取value
        String username = pro.getProperty("username");
        System.out.println(username);

        String pd = pro.getProperty("password");
        System.out.println(pd);
    }
}

