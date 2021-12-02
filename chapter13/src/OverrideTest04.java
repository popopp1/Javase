public class OverrideTest04 {
    public static void main(String args[]) {
        MyDate myDate = new MyDate(2021, 8, 1);
        //这是重写toString()方法之前的输出结果
        //System.out.println(myDate.toString());//MyDate@1b6d3586
        System.out.println(myDate.toString());
        System.out.println(myDate);

        Student student = new Student(190321022,"ljy");
        System.out.println(student);
    }

 static class MyDate {
     private int year;
     private int month;
     private int day;
     public MyDate() {

     }

     public MyDate(int year, int month, int day) {
         this.year = year;
         this.month = month;
         this.day = day;
     }

     public void setYear(int year) {
         this.year = year;
     }

     public int getYear() {
         return year;
     }

     public void setMonth(int month) {
         this.month = month;
       }
     public int getMonth() {
         return month;
     }

     public void setDay(int day) {
         this.day = day;
     }

     public int getDay() {
         return day;
     }
     public String toString(){
         return year + "年" + month + "月" + day + "日";
     }
   }
}
class Student{
    private int number;
    private String name;
    public Student(int number,String name){
        this.number = number;
        this.name = name;
    }
    public String toString(){
        return "学号：" + number + "，" + "姓名:" + name;
    }
}
