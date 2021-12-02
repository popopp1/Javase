/*
    1.数据类型在java中包括两种：
    第一种：基本数据类型
    基本数据类型又可以分为4大类和8小种：
    第一类：整数型 byte,short,int,long
    第二类：浮点型 float,double
    第三类：布尔型 boolean:只有true和false
    第四类：字符型 char java中规定字符型字面量必须使用单引号''括起来，属于文字
    8小种：byte,short,int,long,float,double,boolean,char
    容量大小:byte<short(char)<int<long<float<double

    第二种：引用数据类型：java中除了基本数据类型之外，剩下的都是引用数据类型。
*/

public class DataType {
    public static void main(String[] args){
        char a = 't';
        //在java语言中,"\"负责转义，\t表示的是"制表符tab"
        char v = '\t';
        System.out.println("dasdas");
        System.out.println("dasda\ts");//  \的出现会将紧挨着的后面的字符进行转义


        long b = 100L;
        int h = (int) b;//这个(int)就是加了强制类型转换符，加上去编译才能通过
        System.out.println(h);


        int ee = 10;
        char a1 = 20;
        int be = ee+a1;
        System.out.println(be);


        long y = 10L;
        char c = 'a';
        short s = 100;
        int  i = 30;
        System.out.println(y + c + s + i);
        int tt = (int)y + c + s + i;
        //多种数据类型的混合运算，最终结果是“最大容量”对应的类型。
        //char、byte、short这个除外，因为他们混合运算的时候，会各自转成int再做运算。

/*
    浮点型数据：
    float   4个字节
    double  8个字节
    float是单精度   double是双精度   double更精确
    比如说：
    10.0/3 如果采用float来存储的话结果可能是3.33333
    10.0/3 如果采用double来存储的话结果可能是3.3333333333333

 */
        float f = (float) 3.14;//3.14默认是double类型，此处需要进行类型强制转换
        System.out.println(f);
        int u = (int) 10.0/5;
        System.out.println(u);


        boolean sex = true;
        if(sex){
            System.out.println("男");
        }else{
            System.out.println("女");
        }
    }
}
