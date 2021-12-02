package com.fyx.javase.service;

/*
用户业务类
 */
public class UserService {
    //登录方法
    public boolean login(String name,String password){
        if("admin".equals(name) && "123".equals(password)){
            //表示登录成功
            return true;
        }
        //表示登录失败
        return false;
    }

    //退出系统的方法
    public void logout(){
        System.out.println("系统已经安全退出！");
    }
}
