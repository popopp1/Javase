package com.fyx.javase.array;
/*
1.数组工具栏：自己写的。不是SUN的
2.关于查找算法中：二分法查找(折半查找)。(只基于排序好的数组，效率高)
    10 11 12 13 14 15 16 17 18 19 20
    查找18这个元素的下标
    第一步：先从数组的起始元素的下标和最后一个元素的下标相加/2
        (0+10)/2 = 5     得出是15这个元素
        15<18   所以起始下标要改为5+1，即6
    第二部：在用第二个起始下标 (6+10)/2 = 8
    下标为8对应的元素array[8]是18
 */
public class ArrayUtil {
    public static void main(String[] args) {
        int[] array = {10,20,30,40,50,60,70,80};
        //查找20所在的下标
        int index = binarySearch(array,20);
        System.out.println(index == -1 ? "该元素不存在！" : "该元素下标是：" + index);
    }
    public static int binarySearch(int[] array,int number){
        //开始下标
        int begin = 0;
        //结束下标
        int end = array.length-1;
        while (begin <= end){
            //中间元素下标
            int mid = (begin + end)/2;

            if (array[mid] == number){
                return mid;
            }else if (array[mid] < number){//目标在”中间“的右边
                begin = mid + 1;
                mid = (begin + end)/2;
            }else if (array[mid] > number){
                end = mid - 1;
            }
        }
        return -1;
    }
}
