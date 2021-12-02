/*
    实例的：一定需要使用“引用.“来访问
    静态的：建议使用”类名.“来访问，但是用”引用.“也可以，不过一般不建议！

    结论：
        只有在”空引用”访问”实例“相关的，都会出现空指针异常
 */
public class StaticTest03 {
    public static void main(String[] args){
        System.out.println(Chinese.country);

        Chinese c1 = new Chinese("111111111","张三");
        System.out.println(c1.idCard);
        System.out.println(c1.name);
        System.out.println(c1.country);

        c1 = null;
        System.out.println(c1.country);//不会出现空指针异常，因为静态变量不需要对象的存在
        System.out.println(c1.name);//此处会出现空指针异常，因为name是实例变量
    }
    static class Chinese{
        String idCard;
        String name;
        static String country = "中国";

        //构造方法
        public Chinese(String s1, String s2) {
            idCard = s1;
            name = s2;
        }
    }
}
