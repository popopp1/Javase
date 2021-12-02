package com.fyx.javase.array;
/*
    关于一维数组的扩容
    在java中，数组长度一旦确定不可变，那么数组满了怎么办？
        数组满了需要扩容
        java中对数组的扩容：
            先新建一个大容量的数组，然后将小容量的数据一个一个拷贝到大容量的数组中
    结论：数组扩容效率较低，因为涉及到拷贝的问题，所以在以后的开发中注意：尽可能少的进行数组的拷贝，
    可以在创建数组对象的时候与估计下多长合适，减少扩容的次数，提高效率。
 */
public class ArrayTest08 {
    public static void main(String[] args) {
        //数组拷贝的方法
        //System.arraycopy(5个参数);

        //拷贝源(从这个数组中拷贝)
        int[] src = {1,11,22,3,4};

        //拷贝目标
        int[] dest = new int[10];

        System.arraycopy(src,1,dest,3,2);//拷贝源，拷贝源的起始位置(下标)，拷贝目标，目标起始位置(下标)，拷贝长度

        //遍历目标数组
        for (int i = 0; i <dest.length ; i++) {
            System.out.println(dest[i]);
        }
        System.out.println("=============================");
        //拷贝数组中全部数据
        System.arraycopy(src,0,dest,0,src.length);
        for (int i = 0; i <dest.length ; i++) {
            System.out.println(dest[i]);
        }
        System.out.println("==============================");
        //数组中如果存储的元素的引用，也可以拷贝
        String[] strs = {"ljy","ljy","ljy","ljy"};
        String[] strs1 = new String[10];
        System.arraycopy(strs,0,strs1,0,strs.length);

        for (int i = 0; i <strs1.length ; i++) {
            System.out.println(strs1[i]);
        }
        System.out.println("==============================");
        
        Object[] objects = {new Object(),new Object(),new Object()};
        Object[] newobjects = new Object[10];
        System.arraycopy(objects,0,newobjects,0,objects.length);
        for (int i = 0; i <newobjects.length ; i++) {
            System.out.println(newobjects[i]);
        }
    }
}
