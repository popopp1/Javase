import java.util.Scanner;
public class HelloWorld {
    public static void main(String args[]){
        System.out.println(100 + 200);
        System.out.println(11);//打印的是数字（打印结果都一样）
        System.out.println("11");//打印的是字符串（↑）
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        System.out.println("您输入的内容是:" + i);
    }

    //1.一个java源文件中可以定义多个class
    //2.public的类不是必须的
    //3.在源文件只要有一个class的定义，那么必然会对应生成一个class文件
    //4.public的类可以没有，但如果有的话，public修饰的类名必须和源文件名保持一致
    //5.public类有且只能有一个
    //6.每个类都可以编写入口(实际上不实用)(一般一个软件的执行入口是一个，不会出现多个)
    static class ljy{
        public static void main(String [] args){
            System.out.println("ljy赖君怡");
        }
    }
    static class bb{
        public static void main(String [] args){
            System.out.println("小bb");
        }
    }
    class fyx{

    }
}

