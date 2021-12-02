/*
    1.私有方法不能覆盖
 */
public class OverrideTest06{
    private void domsome(){
        System.out.println("OverrideTest06's private method domsome execute!");
    }
    public static void main(String[] args){
        OverrideTest06 overrideTest06 = new A();
        overrideTest06.domsome();//OverrideTest06's private method domsome execute!
    }
}
class A extends OverrideTest06{
    //访问权限不能更低，可以更高。
    public void domsome(){
        System.out.println("A's public method dosome execute!");
    }
}