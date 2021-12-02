/*
    从键盘接收一个正整数，该正整数作为行数，输出一下图形
            *
           ***
          *****
         *******
        *********
     例如，输入5就输出以上图形
 */
import java.util.Scanner;
public class fifthhomework5 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("请输入一个正整数作为行数:");
        int num = s.nextInt();
        for(int i = 1;i <= num ;i++){
            for (int j = 0;j < num - i;j++){
                System.out.print(" ");
            }
                for (int k =0;k < i*2-1;k++){
                    System.out.print("*");
                }
                System.out.println();
        }
    }
}
