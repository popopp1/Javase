/*
    1.在恰当的时间使用：super(实际参数列表);

    2.注意：在构造方法执行过程中一连串调用了父类的构造方法，父类的构造方法又
    继续向下调用它的父类的构造方法，但是实际上对象只创建了一个。

    3.super(实参)到底是干啥的？
        初始化当前对象的父类型特征，并不是创建新对象，实际上对象只创建一个。

 */
public class SuperTest03 {
    public static void main(String[] args){
        CreditAccount ca1 = new CreditAccount();
        System.out.println(ca1.getActnumber()+ "," + ca1.getBalance() + "," + ca1.getCredit());

        CreditAccount ca2 = new CreditAccount("11111",10000.0,0.9);
        System.out.println(ca2.getActnumber() + "," + ca2.getBalance() + "," + ca2.getCredit());
    }
}
class Account{  //父类
    private String actnumber;
    private double balance;
    public Account(){

    }
    public Account(String actnumber,double balance){
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
class CreditAccount extends Account{  //子类
    private double credit;
    public CreditAccount(String actnumber,double balance,double credit){
        super(actnumber, balance);
        this.credit = credit;
    }
    public CreditAccount(){

    }
    public CreditAccount(double credit){
        this.credit = credit;
    }
    public void setCredit(double credit){
        this.credit = credit;
    }
    public double getCredit(){
        return credit;
    }
}
