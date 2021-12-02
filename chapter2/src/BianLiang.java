public class BianLiang {
    //这里的i是成员变量，作用域是整个类
    int i =  1000;
    public static void main(String[] args){
        //这里的i是局部变量，作用域是main方法
        int i = 100;
        System.out.println(i);//输出的是i = 100，java的就近原则
    }
    public static void ljy(){
        ////这里的i是局部变量，作用域是ljy方法
        int i = 200;
        System.out.println(i);
    }
}
