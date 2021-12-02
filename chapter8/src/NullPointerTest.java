/*
    空指针异常(NullPointerException)
    关于垃圾回收器：GC
        在java语言中，垃圾回收器主要针对的是堆内存。
        当一个java对象没有任何引用指向该对象的时候，
        GC会考虑将该垃圾数据释放回收掉。

    出现空指针异常的条件是什么？
        “空引用”访问实例相关的数据时，都会出现空指针异常。
 */
public class NullPointerTest {
    public static void main(String[] args){
        customer cs = new customer();
        System.out.println(cs.id);

        cs.id = 9521;
        System.out.println(cs.id);

        cs = null;//NullPointerException 空指针异常
        System.out.println(cs.id);
    }
static class customer{
     int id;
}
}
