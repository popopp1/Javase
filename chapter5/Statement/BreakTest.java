/*
    break语句
    break只能用在两个位置
    1.switch语句中，中断switch语句的执行。
    2.用在循环语句中，用来终止循环的执行。
    ***break中止的不是整个方法，而是中止离它最近的循环。***
 */
public class BreakTest {
    public static void main(String[] args){
        for(int i = 0;i < 10;i++){
            if(i==4){
                break;//break中止的不是if语句，而是中止离它最近的循环.
            }
        System.out.println("i=" + i);
        }
    }
}
