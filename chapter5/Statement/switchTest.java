/*
    switch语句
    switch执行原理：
    switch(值){
        case 值1:
             java语句...
             break;
         case 值2:
             java语句...
             break;
         default:
             java语句...
       }
       switch语句支持的值只有int数据类型和String类型，遇到其他数据类型，会自动转化成先int类型再进行编译

       要是不加break的话,会出现穿透现象,比如值和值1匹配成功,但是case 1语句没有加break语句,执行完case 1后会到下一个case语句执行case2的java
       语句，要是case2也没有break语句的话，然后再执行case3的java语句，以此类推。

       default语句是所有的case都没有匹配上的时候，执行default语句。
 */
import java.util.Scanner;
public class switchTest {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("请输入一个[1-7]的整数");
        int num = s.nextInt();
        switch (num){
            case 1 :
                System.out.println("星期一");
                break;
            case 2 :
                System.out.println("星期二");
                break;
            case 3 :
                System.out.println("星期三");
                break;
            case 4 :
                System.out.println("星期四");
                break;
            case 5 :
                System.out.println("星期五");
                break;
            case 6 :
                System.out.println("星期六");
                break;
            case 7 :
                System.out.println("星期天");
        }
    }
}
