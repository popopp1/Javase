public class VipTest {
    public static void main(String[] args){
        Vip v1 = new Vip();
        System.out.println(v1.number);
        System.out.println(v1.name);
        System.out.println(v1.birthday);
        System.out.println(v1.sex);

        Vip v2 = new Vip(11111L,"大灰狼");
        System.out.println(v2.number);
        System.out.println(v2.name);
        System.out.println(v2.birthday);
        System.out.println(v2.sex);

        Vip v3 = new Vip(22222L,"小绵羊","2000-10-02");
        System.out.println(v3.number);
        System.out.println(v3.name);
        System.out.println(v3.birthday);
        System.out.println(v3.sex);

        Vip v4 = new Vip(33333L,"钢铁侠","1982-09-01",true);
        System.out.println(v4.number);
        System.out.println(v4.name);
        System.out.println(v4.birthday);
        System.out.println(v4.sex);
    }
}
