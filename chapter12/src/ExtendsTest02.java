/*
    1.继承extends
        1.1、什么是继承，有什么用？
            基本作用：子类继承父类，代码可以得到复用
            主要作用：因为有了继承关系，才有了后期的方法的覆盖和多态机制
        1.2、class A{}
             class B extends A{}
             A类称为“超类(superclass)、父类或者基类”，B类成为“子类”（subclass)
             A类默认继承Object类
             java只支持单继承，不支持多继承
             java中规定，子类继承父类，除构造方法外，剩下的都可以继承，但是私有的属性无法在子类中直接访问

 */
public class ExtendsTest02 {
    public static void main(String[] args){
        Accountt act = new Accountt();
        act.setActnumber("11111");
        act.setBalance(10000);
        System.out.println(act.getActnumber() + ",余额:" + act.getBalance());

        CreditAccountt ca = new CreditAccountt();
        ca.setActnumber("22222");
        ca.setBalance(-10032);
        ca.setCredit(0.32);
        System.out.println(ca.getActnumber() + ",余额:" + ca.getBalance() + ",信誉度:" + ca.getCredit());
    }
}
class Accountt{  //父类
    private String actnumber;
    private double balance;
    public Accountt(){

    }
    public Accountt(String actnumber,double balance){
        this.actnumber = actnumber;
        this.balance = balance;
    }
    public void setActnumber(String actnumber){
        this.actnumber = actnumber;
    }
    public String getActnumber(){
        return actnumber;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }
}
class CreditAccountt extends Accountt{  //子类
    private double credit;
    public CreditAccountt(){

    }
    public CreditAccountt(double credit){
        this.credit = credit;
    }
    public void setCredit(double credit){
        this.credit = credit;
    }
    public double getCredit(){
        return credit;
    }
}