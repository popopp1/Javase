/*
    1.this除了可以使用在实例方法中，还可以用在构造方法中

    2.新语法：通过当前的构造方法去调用另一个本类的构造方法，可以使用以下格式：
        this(实际参数列表);

    3.this();这个代码的作用是什么？
        代码复用

    4.注意：this();这个语句必须出现在一个构造方法的首行
 */
public class ThisTest02 {
    public static void main(String[] args){
        Date d1 = new Date();
        d1.detail();
        Date d2 = new Date(2002,12,21);
        d2.detail();
    }
static class Date{
      private int year;
      private int month;
      private int day;
      public Date(){
//          this.year = 2000;
//          this.month = 10;
//          this.day = 2;
          this(2000,10,2);
      }
      public Date(int year,int month,int day){
          this.year = year;
          this.month = month;
          this.day = day;
      }
      public void detail(){
          System.out.println(year + "年" + month + "月" + day + "日");
      }
      public void setYear(int year){
          this.year = year;
      }
      public int getYear(){
          return year;
      }
      public void setMonth(int month){
          this.month = month;
      }
      public int getMonth(){
          return month;
      }
      public void setDay(int day){
          this.day = day;
      }
      public int getDay(){
          return day;
      }
    }
}
