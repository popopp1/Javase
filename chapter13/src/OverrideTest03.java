public class OverrideTest03 {
    public static void main(String args[]){
        Chinese chinese = new Chinese();
        chinese.setName("赖君怡");
        chinese.speak();

        American american = new American();
        american.setName("Tom");
        american.speak();

    }
}
class People{
    private String name;
    public People(){

    }
    public People(String name){
        this.name = name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void speak(){
        System.out.println(name + "....");
    }
}
class Chinese extends People{
    public void speak(){
        System.out.println(this.getName() + "正在说汉语" );
    }
}
class American extends People{
    public void speak(){
        System.out.println(this.getName() + " "+ "is speaking English！");
    }
}
