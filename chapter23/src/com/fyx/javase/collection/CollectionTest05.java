package com.fyx.javase.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

/*
测试contains方法
测试remove方法
结论：存放在一个集合中的类型，一定要重写equals方法。
 */
public class CollectionTest05 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        User u1 = new User("jack");
        User u2 = new User("jack");
        c.add(u1);
        //判断集合中是否包含u2
//      System.out.println(c.contains(u2));//false   因为User类没有重写equals方法，比较的是内存地址
        System.out.println(c.contains(u2));//true    User重写equals方法后，比较的是内容

        Integer x = new Integer(10000);
        c.add(x);
        Integer y = new Integer(10000);
        System.out.println(c.contains(y));//true

        //创建集合对象
        Collection cc = new ArrayList();
        //创建字符串对象
        String s1 = new String("hello");
        //加进去集合
        cc.add(s1);
        //创建一个新的字符串
        String s2 = new String("hello");
        //删除s2
        cc.remove(s2);  //s1.equals(s2)   remove底层重写了equals方法，比较的是内容
        System.out.println(cc.size());//0
    }
}

class User{
    private String name;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    //重写equals方法
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}