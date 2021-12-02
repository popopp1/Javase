package com.fyx.javase.reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/*
反射Method
 */
public class ReflectTest08 {
    public static void main(String[] args) throws Exception{
        //获取类
        Class userService = Class.forName("com.fyx.javase.service.UserService");

        //获取所有的Method
        Method[] methods = userService.getDeclaredMethods();
        System.out.println(methods.length);//2

        //遍历Method
        for (Method method:methods) {
            //获取修饰符列表
            System.out.println(Modifier.toString(method.getModifiers()));
            //获取方法的返回值类型
            System.out.println(method.getReturnType().getSimpleName());
            //获取方法名
            System.out.println(method.getName());
            //方法的修饰符列表(一个方法的参数可能会有多个)
            Class[] parameterTypes = method.getParameterTypes();
            for (Class parameterType : parameterTypes) {
                System.out.println(parameterType.getSimpleName());
            }
        }

    }
}
