/*
    1.super不是引用，super也不保存内存地址，super也不指向任何对象。
    2.super只是代表当前对象内部的一块夫类型特征。
 */
public class SuperTest05 {
    public void dosome(){
        System.out.println(this);
//        System.out.println(super);
    }
    public static void main(String[] args){
        SuperTest05 st = new SuperTest05();
        st.dosome();
    }
}
