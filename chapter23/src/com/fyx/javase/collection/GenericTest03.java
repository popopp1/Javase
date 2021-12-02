package com.fyx.javase.collection;

/*
自定义泛型可以吗？可以
    自定义泛型的时候，<>尖括号中是一个标识符，可以随便写
    经常写<E>和<T>
 */
public class GenericTest03<E> {

    public void doSome(E o){
        System.out.println(o);
    }
    public static void main(String[] args) {
        GenericTest03<String> gt = new GenericTest03<>();
        gt.doSome("abc");
    }
}
