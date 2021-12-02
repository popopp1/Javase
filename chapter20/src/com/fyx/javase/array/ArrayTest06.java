package com.fyx.javase.array;
/*
模拟一个系统，假设这个系统要使用，必须输入用户名和密码。
 */
public class ArrayTest06 {
    public static void main(String[] args) {
        if (args.length != 2){
            System.out.println("使用该系统时请输入程序参数，参数信息包括用户名和密码，例如：zhangsan 123");
            return;
        }
        //取出用户名
        String username = args[0];
        //取出密码
        String password = args[1];
        //假设这个用户名是admin，密码是123的时候表示登录成功，其他一律失败
        if ("admin".equals(username) && "123".equals(password)){
            System.out.println("登录成功，欢迎" + username + "回来");
            System.out.println("您可以继续该系统····");
        }else {
            System.out.println("验证失败，用户名不存在或者密码输入错误，请重试！");
        }
    }
}
