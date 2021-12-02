package com.fyx.javase.collection;

import java.util.LinkedList;
import java.util.List;
/*
    LinkedList集合底层也是有下标的
    ArrayList之所以检索效率比较高，不是单纯因为下标的原因，是因为底层数组发挥的作用
    LinkedList集合照样有下标，但是检索/查找某个元素的时候效率比较低，因为只能从头节点开始一个一个遍历。

    链表的优点：
        由于链表上的元素在空间存储上内存地址不连续。
        所以随机增删元素的时候不会有大量元素位移，因此随机增删效率较高
        如果遇到随机增删集合中的元素的业务比较多时，建议使用LinkedList

    链表的缺点：
        不能通过数学表达式计算被查找元素的内存地址，每一次都是从头节点开始遍历，
        直到找到为止，所以LinkedList集合检索/查找的效率比较低

    ArrayList:把检索发挥到极致
    LinkedList:把随机增删发挥到极致
 */
public class LinkedListTest01 {
    public static void main(String[] args) {
        List list = new LinkedList();
        list.add("a");
        list.add("b");
        list.add("c");
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }
    }
}
