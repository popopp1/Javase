public class tenth_homework {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.setSpeed(0);
        vehicle.setSize(5);
        vehicle.move();

//      Vehicle vehicle1 = new Vehicle(120,5);
        System.out.println("speed:" + vehicle.getSpeed());
        System.out.println("size:" + vehicle.getSize());

        vehicle.speedUp(10);
        System.out.println("speed:" + vehicle.getSpeed());
        vehicle.speedUp(20);
        System.out.println("speed:" + vehicle.getSpeed());
        vehicle.speedUp(40);
        System.out.println("speed:" + vehicle.getSpeed());

        vehicle.speedDown(10);
        System.out.println("speed:" + vehicle.getSpeed());
    }
}

//    交通工具类
class Vehicle{
//    速度
    private int speed;
//    体积
    private int size;

    public Vehicle() {
    }

    public Vehicle(int speed, int size) {
        this.speed = speed;
        this.size = size;
    }
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

//  交通工具的移动方法move()
    public void move(){
        System.out.println("交通工具：公共汽车，起步行驶。");
    }
//  加速
    public void speedUp(int addSpeed){
        this.setSpeed(this.getSpeed() + addSpeed);
    }
//  减速
    public void speedDown(int subSpeed){
        if (10 < this.getSpeed()){
            this.setSpeed(this.getSpeed() - subSpeed);
        }
    }
}
