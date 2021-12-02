/*
    continue语句作用:
        终止当前“本次”循环，直接进入下一次循环继续执行.
 */
public class continueTest {
    public static void main(String[] args){
        for(int i = 0;i < 10;i++){
            if(i==5){
                continue;//此处不往下执行，直接继续执行for循环，所以5没有被打印出来
            }
            System.out.println(i);
        }
    }
}
