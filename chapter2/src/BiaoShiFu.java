    //1.标识符:凡是程序员自己有权命名的单词都是标识符
    //2.标识符不能以数字开头
    //3.关键字不能做标识符，例如:public static void
    //4.标识符只能由数字、字母(包括中文)、下划线_、美元符号$组成，不能含有其他符号
    //5.标识符是严格大小写的,例如A和a不一样
    //6.标识符理论上是没有长度限制的
public class BiaoShiFu {

    public static void main(String []args){

    }
        //doSome是一个方法名，可以改成其他名
    public static void doSome(){
        //k、age是一个变量名
        int k = 10;
        int age = 20;
    }

}
    //虽然java中的标识符严格区分大小写，但是对于类名来说，如果一个java源文件中同时出现了:A类和a类，那么谁在前就生成谁
    //↓生成的是Ljy这个类
class Ljy{

}
class ljy{

}