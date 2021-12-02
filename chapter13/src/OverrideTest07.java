/*
    1.方法重载的返回值类型
        对于返回值类型是基本数据类型来说，返回值类型必须保持一致。
        对于返回值类型是引用数据类型来说，重写之后，返回值类型可以变得更小，但意义不大。

 */
public class OverrideTest07 {
    public static void main(String[] args){

    }
}
class Animalll{
    public double sum(int a,int b){
        return a + b;
    }
}
class T extends Animalll{
    public double sum(int a, int b) {
        return a + b;
    }
}
class Myclass{
    public Animalll getAnimalll(){
        return null;
    }
}

class Myclass2 extends Myclass{
    public T getAnimalll(){   //重写的时候返回值类型由Animalll变成了T，变小了（java中允许的）
        return null;
    }
}

//class Myclass3 extends Myclass{
//    public Object getAnimalll(){  重写的时候返回值类型由Animalll变成了Object，变大了（java中不允许）
//        return null;
//    }
//}