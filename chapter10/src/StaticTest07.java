public class StaticTest07 {
    //静态变量在类加载时初始化，静态代码块也是在类加载时执行
    static int i = 100;
    static {
        System.out.println("i = " +i);
    }

    int k = 111;
    static {
//        System.out.println("k = " +k);//不能访问k变量，因为k是实例变量，类加载时，变量k还没有开辟出来
//        System.out.println("name = " +name);//此处也不行访问，因为static遵循自上而下的顺序执行的
    }
    static String name = "张三";

    public static void main(String[] args){

    }
}
