/*
    用递归的方法，计算n的阶乘
 */
public class seventhhomework {
    public static void main(String[] args){
        System.out.println(sum(7));
        System.out.println(sum2(5));
    }
    public static int sum2(int n){
        int result = 1;
        for (int i = 2;i <= n;i++){
            result *= i ;
        }
        return result;
    }
    public static int sum(int n){
        if (n == 1){
            return 1;
        }
        return n * sum(n-1);
    }
}
