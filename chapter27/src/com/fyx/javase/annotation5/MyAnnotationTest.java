package com.fyx.javase.annotation5;

@MyAnnotation("广东清远")
public class MyAnnotationTest {

    @MyAnnotation
    int i;

    //@MyAnnotation    也不行
    public MyAnnotationTest(){

    }

    @MyAnnotation
    public void doSome(){

        //这个地方不行
        //@MyAnnotation
        int i;
    }
}
