/*
    System.out.println(引用);
    当直接输出一个“引用”的时候，println()方法会先自动调用“引用.toString()",然后输出toString()方法的执行结果。
 */
public class ExtendsTest04 {
    public static void main(String[] args){
        ExtendsTest04 et = new ExtendsTest04();
        String retValue = et.toString();
        System.out.println(retValue);//ExtendsTest04@1b6d3586

        Product pr = new Product();
        String retValue2 = pr.toString();//Product@4554617c
        System.out.println(retValue2);
        System.out.println(pr.toString());//Product@4554617c
        System.out.println(pr);//Product@4554617c
    }
}
class Product{
//    public String toString(){
//        return getClass().getName() + "@" + Integer.toHexString(hashCode());
//    }
}
