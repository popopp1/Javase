/*
    一个数不包括它本身的所有因子加起来等于它自己，例如6 = 1 + 2 + 3，列出1000以内这样的数
 */
public class fifthhomework7 {
    public static void main(String[] args){
        for(int i = 2;i <= 1000;i++){
            int sum = 0;
            for (int j = 1;j <= i/2;j++){
                if(i % j ==0){
                    sum += j;
                }
            }
            if(i == sum){
                System.out.println(i);
            }
        }
    }
}
