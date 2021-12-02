package com.fyx.javase.IO;

import com.fyx.javase.bean.Student;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/*
1、java.io.NotSerializableException
    Student对象不支持序列化！！

2、参与序列化与反序列化的对象必须实现Serializable这个接口

3、注意：通过源代码发现，Serializable只是一个标志接口；
    public interface Serializable{
    }
    这个接口当中什么代码都没有
    那么它起到一个什么作用呢？
        起到一个标识的作用，java虚拟机看到这个类实现了这个接口，可能会对这个类进行特殊待遇

4、序列化版本号有什么作用？
    java.io.InvalidClassException:
        com.fyx.javase.bean.Student;
        local class incompatible:
            stream classdesc serialVersionUID = 1927116292259863416,
            local class serialVersionUID = 1386368581637621813
    自动生成序列化版本号的好处：
        区分类
    自动生成序列化版本号的缺陷：
        一旦确定代码之后，不能进行后续的修改，因为只要修改，必然会重新编译，
        此时会生成新的序列化版本号，这个时候java虚拟机会认为这是一个全新的类(这样就不好了)

    最终结论：
        凡是一个类实现了Serializable接口，建议给该类提供一个固定不变的序列化版本号
        这样，以后这个类即使代码修改了，但是版本号不变，java虚拟机会认为是同一个类

 */
public class ObjectOutputStreamTest01 {
    public static void main(String[] args) throws Exception{
        //创建Java对象
        Student student = new Student(1111,"zhangsan");
        //序列化
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("students"));

        //序列化对象
        oos.writeObject(student);
        //刷新
        oos.flush();
        //关闭
        oos.close();
    }
}
