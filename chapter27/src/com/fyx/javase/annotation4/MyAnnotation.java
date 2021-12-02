package com.fyx.javase.annotation4;

public @interface MyAnnotation {
    /*
    注解当中的属性可以是哪种类型
        byte short int long float double boolean char
        String Class 枚举类型
        以及以上每一种的数组形式
     */
    int value1();
    String value2();
    int[] value3();
    String[] value4();
    Season value5();
    Season[] value6();
    Class parameterType();
    Class[] parameterTypes();
}
