/*
    实例语句块
        1.实例语句块在类加载时并没有执行
        2.实例语句块在什么时候执行？
            只要是构造方法执行，必然在构造方法执行之前，实例语句块执行
 */
public class IntanceCode {
    public static void main(String[] args){
        System.out.println("main begin");
        new IntanceCode();
        new IntanceCode();
        new IntanceCode("abc");
    }
    //实例语句块
    {
        System.out.println("实例语句块执行！");
    }

    public IntanceCode(){
        System.out.println("无参数构造方法");
    }
    public IntanceCode(String name){
        System.out.println("有参数构造方法");
    }
}
