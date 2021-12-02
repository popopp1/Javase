package com.fyx.javase.integer;
/*
1、8种基本数据类型对象的包装类型名
    基本数据类型              包装类型
    -------------------------------
    byte                    java.lang.Byte(父类Number)
    short                   java.lang.Short(父类Number)
    int                     java.lang.Integer(父类Number)
    long                    java.lang.Long(父类Number)
    float                   java.lang.Float(父类Number)
    double                  java.lang.Double(父类Number)
    boolean                 java.lang.Boolean(父类Object)
    char                    java.lang.Character(父类Object)
2、以上8种包装类型，重点学习Integer
 */
public class IntegerTest02 {
    public static void main(String[] args) {
        //基本数据类型--(转换为)->引用数据类型(装箱)
        Integer i = new Integer(123);

        //引用数据类型--->基本数据类型
        float f = i.floatValue();//返回的是float类型
        System.out.println(f);//123.0

        //引用数据类型--->基本数据类型(拆箱)
        int retValue = i.intValue();
        System.out.println(retValue);//123
    }
}
