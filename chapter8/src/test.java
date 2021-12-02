/*
    java中规定：参数传递的时候,和类型无关，不管是基本数据类型还是引用数据类型，统一都是
    将盒子中保存的那个“值”复制一份，传递下去
 */
public class test {
    public static void main(String[] args){
        int i = 10;
        //将i变量中保存的10复制一份，传给add方法
        add(i);
        System.out.println("main----->" + i);//10
    }
    public static void add(int k){
        k++;
        System.out.println("add------>" + k);//11
    }
}
