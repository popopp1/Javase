package com.fyx.javase.annotation4;

public @interface OtherAnnotation {
    int age();
    String[] email();

    //季节数组，Season是枚举类型
    Season[] seasonArray();

}
