package com.fyx.javase.reflect;

import java.lang.reflect.Method;

/*重点
通过反射机制，怎么调用一个方法
 */
public class ReflectTest10 {
    public static void main(String[] args) throws Exception{
        //获取类
        Class userService = Class.forName("com.fyx.javase.service.UserService");
        //创建对象
        Object obj = userService.newInstance();
        //获取method
        Method loginMethod = userService.getDeclaredMethod("login", String.class, String.class);
        //!!!!!!!!调用方法!!!!!!!!!(反射机制的重点)
        Object retValue = loginMethod.invoke(obj,"admin","123");
        System.out.println(retValue);//true

    }
}
