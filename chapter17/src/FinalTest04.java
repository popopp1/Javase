/*
    final修饰的实例变量一般添加static修饰。(节省内存)

    static final联合修饰的的变量成为“常量”
    常量名建议全部大写，每个单词之间采用下划线衔接。

    常量：实际上常量和静态变量一样，区别在于：
         常量的值不能变。

         常量和静态变量，都是存储在方法区，并且都是在类加载时初始化。

         常量一般是公开的(public)
 */
public class FinalTest04 {
    public static void main(String[] args) {
        System.out.println(Chinese.COUNTRY);
    }
}

class Chinese{
    String idCard;
    String name;
    static final String COUNTRY = "中国";
}
