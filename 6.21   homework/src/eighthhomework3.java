/*
    写一个名为Account的类模拟账户
    该类的属性和方法如下所示
    该类包括的属性：账户id，余额balance，年利率annualInterestRate；
    包含的方法：各属性的set和get方法。取款方法withdraw（），存款方法deposit（）

    写一个测试程序
    （1）创建一个Customer，名字叫Jane Smith，他有一个账号为1000，余额2000，年利率1.23%的账户
    （2）对Jane Smith操作：
    存入100元，再去除960元，再取出2000.
    打印Jane Smith的基本信息
    打印信息如下：
    成功存入：100
    成功取出：960
    余额不足，取款失败
 */
public class eighthhomework3 {
    public static void main(String[] args){
        Account a = new Account("1000",2000,1.23);
        //传给构造方法a是什么意思？让Customer对象和Account对象产生关系，表示这个账户是Jane Smith的
        Customer c = new Customer("Jane Smith",a);

        c.getAct().deposit(100);
        c.getAct().withdraw(960);
        c.getAct().withdraw(2000);
    }
    static class Customer{
        private Account act;
        private String name;
        public Customer(){

        }
        public Customer(String name,Account act){
            this.name = name;
            this.act = act;
        }
        public void setName(String name){
            this.name = name;
        }
        public String getName(){
            return name;
        }
        public void setAct(Account act){
            this.act = act;
        }
        public Account getAct(){
            return act;
        }
    }


     static class Account{
        //账户id
        private String id;
        //账户余额
        private double balance;
        //年利率
        private double annualInterestRate;
        //构造无参数方法
        public Account(){

        }
        //构造有参数方法
        public Account(String id,double balance,double annualInterestRate){
            this.id = id;
            this.balance = balance;
            this.annualInterestRate = annualInterestRate;
        }
        public void setId(String id){
            this.id = id;
        }
        public String getId(){
            return id;
        }
        public void setBalance(double balance){
            this.balance = balance;
        }
        public double getBalance(){
            return balance;
        }
        public void setAnnualInterestRate(double annualInterestRate){
            this.annualInterestRate = annualInterestRate;
        }
        public double getAnnualInterestRate(){
            return  annualInterestRate;
        }
        //定义一个取款方法
        //调用取钱的方法时，应该传递过来一个参数，告诉该方法要取多少钱
        public void withdraw(double money){
            if(money > getBalance()){
                System.out.println("余额不足，取钱失败！");
                return;
            }
            setBalance(getBalance() - money);
            System.out.println("成功取出：" + money);
        }
        //定义一个存款方法
        public void deposit(double money){
            setBalance(getBalance() + money);
            System.out.println("成功存入：" + money);
        }
    }
}
