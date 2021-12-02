package com.fyx.javase.homework;

import java.util.Scanner;

/*
编写程序模拟用户注册：
1、程序开始执行时，提示用户输入“用户名”和“密码”信息。
2、输入信息之后，后台java程序模拟用户注册。
3、注册时用户名要求长度在[6-14]之间，小于或者大于都表示异常。

注意：
    完成注册的方法放到一个单独的类中。
    异常类自定义即可。

    class UserService{
        public void register(String username,String password){
            //在这个方法中完成注册！
            }
    }
    编写main方法，在main方法中接收用户输入的信息，在main方法中调用UserService的register方法完成注册。
 */
public class UserService {


    public void register(String username, String password) throws IllegalNameException {
        if(username == null || username.length() < 6 || username.length() > 14){
            throw new IllegalNameException("用户名长度不对！！！请重新输入长度为6—14的有效字符！！！");
        }
        System.out.println("注册成功，欢迎["+username+"]");
    }

}
