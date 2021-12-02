package com.fyx.javase.reflect;

/*
获取到Class,能干什么
    通过Class的newInstance()方法来实例化对象
    重点:newInstance()调的是无参构造，必须保证无参构造是存在的
 */
public class ReflectTest02 {
    public static void main(String[] args) {

        try {
            //通过反射机制，获取class，通过Class来实例化对象
            Class c = Class.forName("com.fyx.javase.bean.User");

            //newInstance()这个方法会调用User这个类的无参数构造方法，完成对象的创建
            //重点:newInstance()调的是无参构造，必须保证无参构造是存在的
            Object obj = c.newInstance();

            System.out.println(obj);//com.fyx.javase.bean.User@1b6d3586
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
