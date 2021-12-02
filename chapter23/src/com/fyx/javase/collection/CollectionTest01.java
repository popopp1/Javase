package com.fyx.javase.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

/*
    关于java.util.Collection接口的方法
        1、Collection中能存放什么元素?
            没有使用“泛型”之前，Collection中可以存储Object的所有子类型
            使用了“泛型”之后，Collection中只能存放某个具体的类型。（集合中不能直接存储基本数据类型，也不能存储
            java对象，只是存储java对象的内存地址。）
        2、Collection常用方法：
            boolean add(E e)   向集合中添加元素
            int size();        获取集合中元素的个数
            void clear();      清空集合
            boolean contains(Object o)   判断当前集合中是否包含元素o，包含返回true，不包含返回false
            boolean remove(Object o)     删除集合中的某个元素
            boolean isEmpty()            判断该集合中元素的个数是否为0
            Objcet[] toArray()           调用这个方法可以把集合转换成数组
 */
public class CollectionTest01 {
    public static void main(String[] args) {
        //创建一个集合对象
//        Collection c = new Collection();   接口是抽象，无法实例化，不能new对象
        //多态
        Collection c = new ArrayList();
        //测试Collection接口中的方法
        c.add(1200);//自动装箱，实际是放进去一个对象的内存地址  Integer x = new Integer(1200);
        c.add(new Object());
        c.add(3.14);
        c.add(new Student());
        c.add(true);

        //获取集合中元素的个数
        System.out.println("集合中元素的个数："+ c.size());  //5

        //清空集合
        c.clear();
        System.out.println("清空后集合中元素的个数：" + c.size());  //0

        c.add("hello");
        c.add("world");
        c.add("IronMan");
        c.add("托尼史塔克");
        boolean flag = c.contains("IronMan");
        System.out.println(flag);  //true
        System.out.println(c.size());

        //删除集合中某个元素
        boolean flag2 = c.remove("hello");
        System.out.println(flag2);
        System.out.println("集合中元素的个数："+ c.size());

        //判断集合是否为空
        System.out.println(c.isEmpty());  //false
        //清空
        c.clear();
        System.out.println(c.isEmpty());  //true

        c.add("abc");
        c.add("def");
        c.add(100);
        c.add("helloworld");
        
        //转换成数组
        Object[] objs = c.toArray();
        for (int i = 0; i < objs.length ; i++) {
            System.out.println(objs[i]);
        }

    }
}
class Student{

}