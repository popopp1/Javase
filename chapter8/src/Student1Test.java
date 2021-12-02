public class Student1Test {
    public static void main(String[] args){
    /*
    1.创建学生对象1
    s1、s2这两个局部变量叫做引用
    2.怎么访问实例变量?
    语法机制:引用.实例变量名
     */
        Student1 s1 = new Student1();
        System.out.println(s1.number);//实例化变量没有赋值，打印的都是默认值，下面打印的也都是默认值
        System.out.println(s1.name);
        System.out.println(s1.sex);
        System.out.println(s1.address);
        System.out.println(s1.age);
        System.out.println("-------------------");
        //程序执行到此处可以通过用“=”赋值的方式将内存中实例变量的值修改一下
        s1.number = 10;
        s1.name = "ljy";
        s1.sex = true;
        s1.age = 18;
        s1.address = "河源老隆";
        System.out.println("学号=" + s1.number);
        System.out.println("姓名=" + s1.name);
        System.out.println("性别=" +s1.sex);
        System.out.println("年龄=" +s1.age);
        System.out.println("住址=" +s1.address);
        System.out.println("-------------------");
        //2.创建学生对象2
        Student1 s2 = new Student1();
        System.out.println(s2.number);//实例化变量没有赋值，打印的都是默认值，下面打印的也都是默认值
        System.out.println(s2.name);
        System.out.println(s2.sex);
        System.out.println(s2.address);
        System.out.println(s2.age);
    }

}
