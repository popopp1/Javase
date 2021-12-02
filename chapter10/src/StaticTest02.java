/*
    什么时候变量声明为实例的，什么时候声明为静态的？
    如果这个类型的所有对象的某个属性值都是一样的，不建议定义为实例变量，浪费内存空间，
    建议定义为类级别特征，定义为静态变量，在方法区值保留一份，节省内存开销
    一个对象一份是实例变量，所有对象一份是静态变量
 */
public class StaticTest02 {
    public static void main(String[] args){
        System.out.println(Chinese.country);
        Chinese c1 = new Chinese("12345678324534","张三");
        Chinese c2 = new Chinese("12345678321312","李四");
        System.out.println(c1.idCard);
        System.out.println(c1.name);
        System.out.println(c2.idCard);
        System.out.println(c1.name);
    }
    static class Chinese{
        String idCard;//每一个人的身份证号不同，所以身份证号应该是实例变量，一个对象一份
        String name;//同上

        //对于”中国人“这个类来说，国籍都是中国，不会随着对象的改变而改变，所以国籍并不是对象级别的特征
        //国籍属于整个类的特征
        //···静态变量在类记载初始化，不需要new对象，静态变量的空间就开出来了，静态变量存储在方法区···
        static String country = "中国";

        public Chinese(String s1, String s2) {
            idCard = s1;
            name = s2;
        }
    }
}
