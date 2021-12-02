package com.fyx.javase.annotation3;


public class OtherAnnotationTest {

    //这样写不行，
    //@OtherAnnotation("test")
    @OtherAnnotation(name = "test")
    public void doSome(){

    }
}
