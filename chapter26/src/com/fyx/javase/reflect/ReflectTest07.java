package com.fyx.javase.reflect;

import java.lang.reflect.Field;

/*重点
必须掌握：
    怎么通过反射机制访问一个Java对象的属性
        给属性赋值set
        获取属性的值get
 */
public class ReflectTest07 {
    public static void main(String[] args) throws Exception{

        Class studentClass = Class.forName("com.fyx.javase.bean.Student");
        Object obj = studentClass.newInstance();//obj就是Student对象

        //获取no属性(根据属性的名称获取field)
        Field noField = studentClass.getDeclaredField("no");

        //给obj对象(Student对象)的no属性赋值
        noField.set(obj,1221);//给obj对象的no属性赋值1221

        //读取属性的值
        System.out.println(noField.get(obj));

        //可以访问私有的属性吗
        Field nameField = studentClass.getDeclaredField("name");
        //打破封装(反射机制的缺点:打破封装，可能会给不法分子留下机会)
        //这样设置完之后，在外部也是可以访问private的
        nameField.setAccessible(true);
        //给属性赋值
        nameField.set(obj,"jackson");
        //获取属性的值
        System.out.println(nameField.get(obj));

    }
}
