/*
    提取一个方法出来，这个方法专门用来计算某个数的阶乘
 */
import java.util.Scanner;
public class sixthhomework {
    public static void main(String[] args){
        int result1 = jieCheng(8);
        System.out.println(result1);
    }
    public static int jieCheng(int n){
        int result = 1;
        for (int i = n;i > 1;i--){
            result *= i;
        }
        return result;
    }
}
