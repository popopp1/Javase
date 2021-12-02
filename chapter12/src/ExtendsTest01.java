public class ExtendsTest01 {
    public static void main(String[] args){
        Account act = new Account();
        act.setActnumber("11111");
        act.setBalance(10000);
        System.out.println(act.getActnumber() + ",余额:" + act.getBalance());

        CreditAccount ca = new CreditAccount();
        ca.setActnumber("22222");
        ca.setBalance(-10032);
        ca.setCredit(0.32);
        System.out.println(ca.getActnumber() + ",余额:" + ca.getBalance() + ",信誉度:" + ca.getCredit());
    }
}
class Account{
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
class CreditAccount{
    private String actnumber;
    private double balance;
    private double credit;
    public CreditAccount(){

    }
    public CreditAccount(String actnumber,double balance,double credit){
        this.actnumber = actnumber;
        this.balance = balance;
        this.credit = credit;
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
    public void setCredit(double credit){
        this.credit = credit;
    }
    public double getCredit(){
        return credit;
    }
}