/*
    计算1000以内所有不能被7整除的整数之和
 */
public class fifthhomework {
    public static void main(String[] args){
        int sum = 0;
        for (int i = 1;i <= 1000;i++){
            if (i % 7 != 0){
                sum += i;
            }
        }
        System.out.println("1000以内所有不能被7整除的整数之和为:" +sum);
    }
}
