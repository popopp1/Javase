package com.fyx.javase.collection;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
泛型
    1、泛型这种语法机制，只在编译阶段起作用，只是给编译器参考的(运行阶段泛型没用)

    2、使用了泛型的好处是什么？
        第一：集合中存储的元素类型统一
        第二：从集合中取出的元素的类型是泛型指定的类型，不需要进行大量的“向下转型”！

    3、泛型的缺点是什么？
        导致集合中存储的元素缺乏多样性！

    4、大多数业务中，集合中元素还是统一的。
 */
public class GenericTest01 {
    public static void main(String[] args) {
        //不使用泛型机制，分析程序存在的缺点
        /*
        List myList = new ArrayList();

        Cat c = new Cat();
        Bird b = new Bird();
        //将对象添加到集合当中
        myList.add(c);
        myList.add(b);

        //遍历集合，取出Cat让它抓老鼠，取出Bird让它飞
        Iterator it = myList.iterator();
        while (it.hasNext()){
            Object o = it.next();
            //强制类型转换
            if (o instanceof Animal){
                Animal a = (Animal)o;
                a.move();
            }
        }
         */

        //使用泛型
        //使用泛型List<Animal>之后，表示List集合中只允许存储Animal类型的数据。
        //用泛型指定集合中存储的数据类型。
        List<Animal> myList = new ArrayList<Animal>();
        Cat c = new Cat();
        Bird b = new Bird();

        myList.add(c);
        myList.add(b);

        //获取迭代器
        //这个表示迭代器迭代的是Animal
        Iterator<Animal> it = myList.iterator();
        while (it.hasNext()){
            //使用泛型之后，每一次迭代返回的数据都是Animal类型
            Animal a = it.next();
            //这里不需要进行强制类型转换，直接调用
            a.move();
            if (a instanceof Cat){
                Cat x = (Cat)a;
                ((Cat) a).catchMouse();
            }
            if (a instanceof Bird){
                Bird bd = (Bird)a;
                bd.fly();
            }
        }
    }
}

class Animal{
    public void move(){
        System.out.println("动物在移动！");
    }
}

class Cat extends Animal{
    public void catchMouse(){
        System.out.println("猫抓老鼠！！！");
    }
}

class Bird extends Animal{
    public void fly(){
        System.out.println("鸟儿在飞翔！！！");
    }

}