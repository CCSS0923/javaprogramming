package ssi;

class Calculation1 {

    int add(int x, int y) {
        return x + y;
    }

    public int sub(int x, int y) {
        return x - y;
    }

    void mult(int x, int y) {
        System.out.println("두 수의 곱 = " + (x * y));
    }
}

public class Inheritance01a extends Calculation1 {

    public static void main(String[] args) {
        int a = 88, b = 77;
        Inheritance01a obj = new Inheritance01a();

        System.out.println("두 수의 합은 = " + obj.add(a, b));
        System.out.println("두 수의 차는 = " + obj.sub(a, b));
        obj.mult(a, b);
        
    }
}
