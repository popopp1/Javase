package com.fyx.javase.collection;

import java.util.TreeSet;

/*
先按照年龄升序，如果年龄一样的再按照姓名升序
 */
public class TreeSetTest05 {
    public static void main(String[] args) {
        Vip vip = new Vip("zhangsan",20);
        Vip vip1 = new Vip("zhangsi",20);
        Vip vip2 = new Vip("king",18);
        Vip vip3 = new Vip("soft",17);

        TreeSet<Vip> vips = new TreeSet<>();

        vips.add(vip);
        vips.add(vip1);
        vips.add(vip2);
        vips.add(vip3);

        for (Vip v:vips) {
            System.out.println(v);
        }
    }
}

class Vip implements Comparable<Vip>{
    String name;
    int age;

    public Vip(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Vip{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /*
        compareTo方法的返回值很重要：
            返回0表示相同，value会覆盖
            返回>0，会继续在右子树上找【10 - 9 =1，1>0 说明左边这个数字比较大】
            返回<0，会继续在左子树上找【】
     */
    @Override
    public int compareTo(Vip o) {
        if (this.age == o.age){
            //年龄相同时按照姓名排序
            //姓名是String类型，可以直接调用compareTo()方法
            return this.name.compareTo(o.name);
        }else {
            return this.age - o.age;
        }
    }
}
