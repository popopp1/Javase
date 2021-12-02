package com.fyx.javase.bean;

import java.io.Serializable;

public class Student implements Serializable{
    //idea工具自动生成序列化版本号
    //建议将序列化版本号手动写出来，不建议自动生成
    private static final long serialVersionUID = 2222223213123213126L;

    private int no;
    private String name;
    private int age;
    private String email;


    public Student() {
    }

    public Student(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }
}
