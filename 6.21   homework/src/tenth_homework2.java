public class tenth_homework2 {
    public static void main(String[] args) {
        Number number = new Number(10,5);

        number.addition();
        number.subtration();
        number.multiplication();
        number.divide();
    }
}
class Number{
    private int n1;
    private int n2;

    public Number(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public void addition(){
        int result = n1 + n2;
        System.out.println(n1 + "+" + n2 + "=" + result);
    }

    public void subtration(){
        int result = n1 - n2;
        System.out.println(n1 + "-" + n2 + "=" + result);
    }

    public void multiplication(){
        int result = n1 * n2;
        System.out.println(n1 + "*" + n2 + "=" + result);
    }

    public void divide(){
        int result = n1 / n2;
        System.out.println(n1 + "/" + n2 + "=" + (n1 / n2));
    }
}
