/*
    从控制台输入一个正整数，计算该数的阶乘。例如输入5，阶乘为5*4*3*2*1
 */
import java.util.Scanner;
public class fifthhomework3 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("请输入一个正整数:");
        int num = s.nextInt();
        int result = 1;
        for(int i = num ; i >1;i--){
            result *= i;
        }
        System.out.println(result);
    }
}
