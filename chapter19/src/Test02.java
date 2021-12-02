/*
    关于Object类中的equals方法
        1、equals方法的源代码：
            public boolean equals(Object obj){
                return(this == obj);
            }
        2、equals方法是判断两个对象是否相等的。
 */
public class Test02 {
    public static void main(String[] args) {
        MyTimee myTimee = new MyTimee(2002,12,21);
        MyTimee myTimee1 = new MyTimee(2002,12,21);

        //这里的“=="判断的是：myTimee中保存的对象内存地址和myTimee1中保存的对象内存的地址是否相等
        System.out.println(myTimee == myTimee1);//false

        //equals()方法没重写前
//        boolean b = myTimee.equals(myTimee1);
//        System.out.println(b);//false

        //equals()方法重写后
        boolean b = myTimee.equals(myTimee1);
        System.out.println(b);//true

        MyTimee myTimee2 = new MyTimee(2000,10,02);
        boolean b1 = myTimee1.equals(myTimee2);
        System.out.println(b1);

        MyTimee myTimee3 = null;
        boolean b2 = myTimee1.equals(myTimee3);
        System.out.println(b2);
    }
}

class MyTimee{
    private int year;
    private int month;
    private int day;
    public MyTimee(){

    }
    public MyTimee(int year,int month,int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }
//    public boolean equals(Object obj){
//        int year1 = this.year;
//        int month1 = this.month;
//        int day1 = this.day;
//
//        if (obj instanceof MyTimee){
//            MyTimee myTimee = (MyTimee)obj;
//            int year2 = myTimee.year;
//            int month2 = myTimee.month;
//            int day2 = myTimee.day;
//            if (year1 == year2 && month1 == month2 && day1 == day2){
//                return true;
//            }
//        }
//
//        return false;
//    }
    public boolean equals(Object obj){
        if (obj == null){
            return false;
        }
        else if (!(obj instanceof MyTimee)){
            return false;
        }
        //如果this和obj保存的内存地址相等就没必要比较了，直接返回true
        else if (this == obj){
            return true;
        }
        //程序编程运行到这里，说明obj不是null，是Mytimee类型


        MyTimee mt = (MyTimee)obj;
        return(this.year == mt.year && this.month == mt.month && this.day == mt.day );
    }

}