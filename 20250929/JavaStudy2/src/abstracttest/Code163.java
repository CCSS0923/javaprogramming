package abstracttest;

class Parent1 {
    private int dataA;
    Parent1() {}
    Parent1(int dataA) {
        this.dataA = dataA;
    }
    void show() {
        System.out.println("parent show : " + dataA);
    }
}

class Child extends Parent1 {
    private int dataB;
    Child() {}
    Child(int dataA, int dataB) {
        super(dataA);
        this.dataB = dataB;
    }
    void show() {
        super.show();
        System.out.println("child show : " + dataB);
    }
}

public class Code163 {
	public static void main(String[] args) {
		Child x = new Child(10, 20);
		x.show( );
	    //Parent y = new Parent(5);   에러 발생
	}
}