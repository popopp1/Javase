/*
    编写一个方法，输出大于某个正整数n的最小质数
 */
public class sixthhomework2 {
    public static void main(String[] args){
        printZuiXiaoZhiShu(15);
    }
    public static void printZuiXiaoZhiShu(int n){//打印最小质数
        while (!isZhiShu(++n)){

        }
        System.out.println(n);
    }
    public static boolean isZhiShu(int num){//判断一个数是否为质数的方法
        for (int i = 2;i < num;i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

}
