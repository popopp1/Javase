package com.fyx.javase.annotation3;

/*
如果一个注解的属性的名字是value，并且只有一个属性的话，在使用的时候，该属性可以省略
 */
public class MyAnnotationTest {

    @MyAnnotation(value = "hehe")
    public void doSome(){

    }

    @MyAnnotation("haha")
    public void doOther(){

    }
}
