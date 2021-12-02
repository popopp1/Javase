package com.fyx.javase.annotation2;

public @interface MyAnnotation {
    //我们通常可以在注解当中定义属性，以下这个是MyAnnotation的name的属性(除非属性指定了默认值)
    String name();

    String color();

    int age() default 18;   //属性指定默认值
}
