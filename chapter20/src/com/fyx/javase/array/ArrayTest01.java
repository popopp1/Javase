package com.fyx.javase.array;
/*
    Array
        1、java语言中的数组是一种引用型数据类型，不属于基本数据类型
        2、数组实际上是一个容器，可以同时容纳多个元素。
        3、数组当中可以存储基本数据类型的数据，也可以存储引用数据类型的数据。
        4、数组因为是引用类型，所以数组对象是堆内存当中。(数组是存储在堆当中的)
        5、数组当中如果存储的是"Java对象"的话,实际上存储的是对象"引用(内存地址)"
        6、数组一旦创建,在java中规定,长度不可变
        7、所有的数组都又length属性,用来获取数组中元素的个数
        8、java中的数组要求数组中元素的类型统一,比如int类型数组只能存储int类型
        9、数组在内存方面存储的时候，数组中的元素内存地址是连续的。
        10、所有的数组都是拿“第一个小方框的内存地址”作为整个数组对象的内存地址。
        (数组首元素的内存地址作为整个数组对象的内存地址)
        11、数组优点和缺点
            优点：查询/查找/检索某个下标上的元素时效率极高。
                为什么？
                    第一：每一个元素的内存地址在空间存储上是连续的。
                    第二：每一个元素类型相同，所以占用空间大小一样。
                    第三：知道第一个元素内存地址，知道每一个元素占用空间的大小，又知道下标，所以
                    通过一个数学表达式就可以计算出某个下表上元素的内存地址。直接通过内存地址定位
                    元素，所以数组的检索效率是最高的。
            缺点：
                第一：由于为了保证数组中每个元素的内存地址连续，所以在数组上随机增删元素的时候，
            效率较低，因为随机增删元素会涉及到后面元素统一向前或者向后位移的操作。
                第二：数组不能存储大数据量
                     因为很难在内存空间上找到一块特别大的连续的内存空间。
            注意：对于数组最后一个元素进行增删，效率是不受影响的。
        12、怎么声明一个数组？
                int[] array1;
                double[] array2;
                boolean[] array3;
                String[] array4;
                Object[] array5;
        13、怎么初始化一个一维数组
            包括两种方式：静态初始化一维数组，动态初始化一维数组。
            静态初始化语法格式：
                int[] array = {100,200,300,400};
            动态初始化语法格式：
                int[] array = new int[5];这里的5表示数组的元素个数。
                                         初始化一个5个长度的int类型数组，每个元素默认是0
                String[] names = new String[6];     初始化6个长度的String类型数组，每个元素默认是null。
 */
public class ArrayTest01 {
    public static void main(String[] args) {
     int[] array = {1,100,20,10,43};
     System.out.println(array.length);

     //读
     System.out.println("第一个元素=" + array[0]);
     System.out.println("最后一个元素=" + array[4]);
     System.out.println("最后一个元素=" + array[array.length-1]);

     //改
     array[0] = 111;
     array[array.length-1] = 22;
     System.out.println("修改后的第一个元素=" + array[0]);
     System.out.println("修改后的最后一个元素=" + array[array.length-1]);

     int[] array2 = new int[6];

     //遍历一维数组
     for (int i = 0;i < array.length;i++){
         System.out.println(array[i]);

        }
        //从最后一个元素遍历第一个元素
     for (int i = array.length-1;i >= 0 ;i--){
        System.out.println(array[i]);
     }
    }
}

