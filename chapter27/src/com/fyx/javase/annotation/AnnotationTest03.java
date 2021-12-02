package com.fyx.javase.annotation;

/*
表示”被标注的“已过时
 */


public class AnnotationTest03 {

    @Deprecated
    public static void doSome(){
        System.out.println("do something!");
    }

    @Deprecated
    public static void doOther(){
        System.out.println("do other...");
    }
}

class T{
    public static void main(String[] args){
        AnnotationTest03.doSome();

        AnnotationTest03.doOther();
    }
}