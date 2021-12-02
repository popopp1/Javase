/*
    编写程序实现乐手弹奏乐曲，乐手可以弹奏不同的乐器从而发出不同的声音
    可以弹奏的乐器包括二胡、钢琴和琵琶
 */
public class ninthhomework {
    public static void main(String[] args){
        Erhu erhu = new Erhu();
        Piano piano = new Piano();
        Violin violin = new Violin();

        Musician ljy = new Musician(erhu,"ljy");
        ljy.play();

        Musician fyx = new Musician(piano,"fyx");
        fyx.play();

        Musician zzz = new Musician(violin,"zzz");
        zzz.play();
    }
}
class Musician{
    private String name;
    Instrument instrument;
    public Musician(Instrument instrument,String name){
        this.instrument = instrument;
        this.name = name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void play(){
        instrument.makeSound();
    }
}
class Instrument{
    public void makeSound(){

    }
}
class Erhu extends Instrument{
    public void makeSound(){
        System.out.println( "二胡的声音！！！");
    }

}
class Piano extends Instrument{
    public void makeSound() {
        System.out.println("钢琴的声音！！！");
    }
}
class Violin extends Instrument{
    public void makeSound() {
        System.out.println("小提琴的声音！！！");
    }
}