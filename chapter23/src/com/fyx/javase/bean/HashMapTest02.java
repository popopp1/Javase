package com.fyx.javase.bean;

import java.util.HashSet;
import java.util.Set;

/*
1、向Map集合中存，以及从Map集合中取，都是先调用key和hashCode的方法，然后再调用equals方法
   equals方法有可能调用，也有可能不调用
      拿put(k,v)举例，什么时候equals不会调用？
         k.hashCode()方法返回哈希值
         哈希值经过哈希算法转换成数组下标
         数组下标位置上如果是null，equals不需要执行

      拿get(k)举例，什么时候equals不会调用？
         k.hashCode()方法返回哈希值
         哈希值经过哈希算法转换成数组下标
         数组下标位置上如果是null，equals不需要执行

2、注意：如果一个类的equals方法重写了，那么hashCode()方法必须重写
并且equals方法返回如果是true，hashCode()返回的值必须一样
    equals方法返回true表示两个对象相同，在同一个单向链表上比较
    那么同一个单向链表上的节点来说，他们的哈希值都是相同的
    所以hashCode()方法的返回值也应该相同

3、hashCode()和equals()方法必须同时生成

4、终极结论：
    放在HashMap集合key部分的，以及放在HashSet集合中的元素，需要同时重写hashCode()和equals()方法
    
HashSet集合特点：无序不可重复
 */
public class HashMapTest02 {
    public static void main(String[] args) {
        Student student = new Student("zhangsan");
        Student student1 = new Student("zhangsan");
        /*没有重写equals()方法
        System.out.println(student.equals(student1));//false
         */

        //重写equals()方法后
        System.out.println(student.equals(student1));
        //没有重写hashCode()
//      System.out.println("student的hashCode = " + student.hashCode());//460141958
//      System.out.println("student1的hashCode = " + student1.hashCode());//1163157884
        //重写hashCode()后
        System.out.println("student的hashCode = " + student.hashCode());//-1432604525
        System.out.println("student1的hashCode = " + student1.hashCode());//-1432604525

        Set<Student> students = new HashSet<>();
        students.add(student);
        students.add(student1);
        System.out.println(students.size());//2   按理来说应该是1，输出是2，显然不符合HashSet集合特点：无序不可重复，重写hashCode()方法
    }
}
