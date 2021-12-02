public class eleventh_homework {
    public static void main(String[] args) {

        //创建鼠标、键盘、显示器、打印机对象
        InsertDrawable mouse = new Mouse();
        InsertDrawable keyboard = new KeyBoard();
        InsertDrawable monitor = new Monitor();
        InsertDrawable printer = new Printer();

        //创建笔记本电脑对象
        LapTop lapTop = new LapTop(mouse);
        LapTop lapTop2 = new LapTop(keyboard);
        LapTop lapTop3 = new LapTop(monitor);
        LapTop lapTop4 = new LapTop(printer);

        //各类产品接入接口
        lapTop.dosome();
        lapTop2.dosome();
        lapTop3.dosome();
        lapTop4.dosome();
    }

}

class LapTop{

    //手提电脑上有个接口
    private InsertDrawable insertDrawable;

    //有参数构造方法，传入接口参数
    public LapTop(InsertDrawable insertDrawable){
        this.insertDrawable = insertDrawable;
    }

    public InsertDrawable getInsertDrawable() {
        return insertDrawable;
    }

    public void setInsertDrawable(InsertDrawable insertDrawable) {
        this.insertDrawable = insertDrawable;
    }

    //定义一个dosome方法
    public void dosome(){
        insertDrawable.insert();
    }
}


interface InsertDrawable{
    void insert();
}

class Mouse implements InsertDrawable{

    @Override
    public void insert() {
        System.out.println("鼠标接入插口！");
    }
}

class KeyBoard implements InsertDrawable{

    @Override
    public void insert() {
        System.out.println("键盘接入插口！");
    }
}

class Monitor implements InsertDrawable{

    @Override
    public void insert() {
        System.out.println("显示器接入插口！");
    }
}

class Printer implements InsertDrawable{

    @Override
    public void insert() {
        System.out.println("打印机接入插口！");
    }
}