public class Operator {
    public static void main(String[] args){
/*
    1.++ --运算符
 */
        //当++出现在变量后，会先做赋值运算，再自加1
        int m = 10;
        int n = m++;//先将m赋值给n，m再自加1
        System.out.println(n);//10
        System.out.println(m);//11
        //当++出现在变量前，会先自加1，再进行赋值
        int i = 10;
        int j = ++i;
        System.out.println(i);//11
        System.out.println(j);//11

        int c = 90;
        System.out.println(c++);//和上面一样，先赋值再进行自加1，此处打印的值是90
        System.out.println(c);//91

        int o = 100;
        System.out.println(++o);//和上面一样，先自加1再进行赋值，101
        System.out.println(o);//101


/*
    2.逻辑运算符：
    &  逻辑与
    |  逻辑或
    !  逻辑非
    && 短路与
    || 短路或
 */
        System.out.println(100 > 90 & 100 <101);//true
        System.out.println(100 > 90 & 100 > 101);//false
        int a = 100;
        int b = 90;
        int cc = 101;
        System.out.println(a > b & a < cc);//true
        System.out.println(a < b | a > cc);//false

        System.out.println(!(a < b));

        //测试短路与&&
        int m1 = 10;
        int m2 = 11;
        //这里使用了逻辑与"&",m1 > m2++也被执行
        System.out.println(m1 > m2 & m1 > m2++);//false
        System.out.println(m2);//12
        int b1 = 10;
        int b2 = 11;
        //这里使用短路与"&&",b1>b2++不被执行，因为b1>b2已经是false，后面的b1>b2++被短路，不执行
        System.out.println(b1 > b2 && b1 > b2++);//false
        System.out.println(b2);//11

/*
        3.赋值运算符
        = += -= *= /= %=
 */
        int k = 10;
        k += 20;//k追加20  k = k + 20;
        System.out.println(k);//30
        byte x = 100;
        System.out.println(x);
//      x = x + 1;//编译不通过，不兼容类型，int转化成byte会有损失
        x += 1;//使用 扩展赋值运算符的时候，例如+=，永远不会改变运算结果类型

        System.out.println(x);//101


/*
    4.条件运算符
        语法格式：
            布尔表达式(true、false) ? 表达式1 : 表达式2
    执行原理：
        布尔表达式是true时，表达式1的执行结果作为整个表达式的结果
        布尔表达式是false时，表达式2的执行结果作为整个表达式的结果
 */
        boolean sex = false;
        char c1 = sex ? '男' : '女';
        System.out.println(c1);


    }
}
