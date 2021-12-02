package com.fyx.javase.annotation;

/*
1、注解语法格式:
    [修饰符列表] @interface 注解类型名{

    }

2、注解怎么使用？用再什么地方？
    第一：注解使用是的语法格式是：
         @注解类型名

    第二：注解可以出现在类上、属性上、方法上、变量上等
    注解还可以出现在注解类型上

 */
@MyAnnotation
public class AnnotationTest01 {

    @MyAnnotation
    private int no;

    @MyAnnotation
    public AnnotationTest01(){

    }

    @MyAnnotation
    public static void m1(){
        @MyAnnotation
        int i = 100;
    }

    @MyAnnotation
    public void m2(@MyAnnotation String name,@MyAnnotation int k){

    }
}

@MyAnnotation
interface MyInterface{

}