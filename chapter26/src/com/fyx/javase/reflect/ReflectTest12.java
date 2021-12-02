package com.fyx.javase.reflect;
//使用反射机制创建对象

import java.lang.reflect.Constructor;

public class ReflectTest12 {
    public static void main(String[] args) throws Exception{
        Class vipClass = Class.forName("com.fyx.javase.bean.Vip");

        //调用无参数构造方法
        Object obj = vipClass.newInstance();
        //调用有参数构造方法
        //先获取到这个有参数的构造方法
        Constructor constructor = vipClass.getDeclaredConstructor(int.class,String.class,String.class,boolean.class);
        //调用构造方法new对象
        Object newObj = constructor.newInstance(110,"jackson","1990-01-10",true);
        System.out.println(newObj);


    }
}
