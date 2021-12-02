/*
    总结：
        1.String类已经重写equals()方法，比较两个字符串不能使用==，必须使用equals。

        2.String类已经重写toString()方法。

    大结论：
        java中什么类型的数据类型可以使用“==”判断
            java中基本数据类型比较是否相等，使用==

        java中什么类型的数据类型需要使用equals判断
            java中所有的引用数据类型统一使用equals方法来判断是否相等。
 */
public class Test03 {
    public static void main(String[] args) {
        String s1 = new String("test");
        String s2 = new String("test");
        //String类已经重写equals方法了
        System.out.println(s1.equals(s2));

        String s3 = new String("lalalala");
        System.out.println(s3.toString());
    }
}

