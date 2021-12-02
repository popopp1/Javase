package com.fyx.javase.collection;

import java.util.TreeSet;

/*

 */
public class TreeSetTest04 {
    public static void main(String[] args) {
        Customer p1 = new Customer(20);
        Customer p2 = new Customer(30);
        Customer p3 = new Customer(25);
        Customer p4 = new Customer(32);

        //创建TreeSet集合
        TreeSet<Customer> customers = new TreeSet<>();
        customers.add(p1);
        customers.add(p2);
        customers.add(p3);
        customers.add(p4);
        //遍历
        for (Customer c : customers) {
            System.out.println(c);
        }
    }
}

class Customer implements Comparable<Customer>{
    int age;

    public Customer(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Customer[age = "+ age +" ]";
    }

    //需要在这个方法中编写比较的逻辑，或者说比较的规则，按照什么进行比较
    //k.compareTo(t.key)
    //拿着参数k和集合中的每一个k进行比较，返回值可能是>0 <0 =0
    @Override
    public int compareTo(Customer o) {   //o1.compareTo(o2)  this是o1,o是o2,this和o进行比较
        return this.age - o.age;// =0 >0 <0
    }
}