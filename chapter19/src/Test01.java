/*
    关于Object类中的toString()方法

 */
public class Test01 {
    public static void main(String[] args) {
        MyTime myTime = new MyTime(2002,12,21);
        String s = myTime.toString();
        System.out.println(s);
    }
}

class MyTime{
    private int year;
    private int month;
    private int day;
    public MyTime(){

    }
    public MyTime(int year,int month,int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    //重写toString()方法
    public String toString(){
        return this.year + "年" + this.month + "月" + this.day + "日";
    }
}
