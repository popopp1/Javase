public class Vip {
    long number;
    String name;
    boolean sex;
    String birthday;

    //无参数构造方法
    public Vip(){

    }
    //有参数构造方法
    public Vip(long huiYuanHao,String xingMing){
        number = huiYuanHao;
        name = xingMing;
        //实际上这里还有两行代码
        //birthday = null;    sex = false;
    }

    public Vip(long huiYuanHao,String xingMing,String shengRi){
        number = huiYuanHao;
        name = xingMing;
        birthday = shengRi;
    }

    public Vip(long huiYuanHao,String xingMing,String shengRi,boolean xingBie){
        number = huiYuanHao;
        name = xingMing;
        birthday = shengRi;
        sex = xingBie;
    }
}
