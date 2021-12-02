/*
    do...while循环语句的执行原理以及语法机制:
        语法机制:
            do{
                循环体;
              }while(布尔表达式);
        执行原理:
            ***先执行循环体仲的代码***,
            执行一次循环体之后，
            判断布尔表达式的结果，true就继续执行循环体，false循环结束
 */
public class dowhileTest {
    public static void main(String[] args){
        int i = 0;
        do{
            System.out.println("i = " + i);
            i++;
        }while (i < 10);
    }
}
