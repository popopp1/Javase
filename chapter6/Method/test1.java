/*
    1.方法怎么定义，语法机制是什么？
        [修饰符列表]    返回值类型   方法名(形式参数列表){
            方法体;
            }
        以上[]内容里面的内容表示不是必须的，是可选的。
        方法体由java语句构成。
        方法定义之后需要去调用，不调用是不执行的
            1.1：关于返回值类型:
                    1.返回值类型可以是任何类型，比如:byte、short、int、long、float、double、boolean、char、String..
                    2.什么是返回值？
                        返回值一般指的是一个方法执行结束之后的结果。结果
                        通常是一个数据，
                        如果返回值类型是void，那么在方法体中不能有"return值;",这样的语句，但是可以
                        有"return;"语句,这个语句"return;"的作用就是用来终止当前方法的。
            1.2：形式参数列表
                    简称:形参
                    注意:形式参数列表中的每一个参数都是"局部变量“,方法结束之后内存使用。
                    形参的个数是:0~N个。
                    形参有多个的话用逗号隔开
    2.方法定义之后怎么调用？
        类名.方法名(实际参数列表);
        实参和形参必须一一对应，类型、个数都要对应。
 */
public class test1 {
    public static void sumInt(int x,int y){
        int z = x + y;
        System.out.println(x+ "+" + y + "=" + z);
    }
    public static void main(String[] args){
        //(100,200)等叫做实际参数列表，简称实参。
        //实参和形参必须一一对应，类型、个数都要对应。
        test1.sumInt(100,200);
        test1.sumInt(600,231);
        test1.sumInt(434,4231412);
        int result = test1.divide(100,20);
        System.out.println(result);
    }
    public static int divide(int a, int b){
        int c = a / b;
        return c;
    }
}
