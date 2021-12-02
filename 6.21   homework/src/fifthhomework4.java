/*
    从控制台输入一个正整数，判断它是否为质数(大于1的数，除了1和它自身没有其他因数)
 */
import java.util.Scanner;
public class fifthhomework4 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("请输入一个正整数:");
        int num = s.nextInt();
        boolean j = true;
        for(int i =2;i < num;i++){
            if(num % i ==0){
                System.out.println("该数不是质数!");
                j = false;
                break;
            }
        }
        System.out.println(num + (j ? "是" : "不是")+ "质数");
    }
}
