/*
    for循环语法机制以及运行原理
        for(初始化表达式;条件表达式;更新表达式){
            循环体;
            java语句....
            java语句....
        }
        第一:初始化表达式最先执行，并且在整个循环中只执行一次。
        第二:条件表达式必须是布尔类型。true或者false
        执行原理:
            先执行初始化表达式，并且在整个循环中只执行一次。
            然后再判断条件表达式的结果，如果条件表达式结果为true，则执行循环体，循环体结束后，执行更新表达式
            更新完之后，再继续判断条件表达式，以此类推，直到条件表达式为false，循环结束。

 */

public class forTest {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1;i <100 ;i += 2){
            sum += i;
        }
        System.out.println("1到100奇数相加结果是:" + sum);
    }
}
