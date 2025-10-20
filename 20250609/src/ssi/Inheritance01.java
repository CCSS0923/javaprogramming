package ssi;

public class Inheritance01 extends Calculation{
	public void mult(int x, int y) {
		z = x * y;
		System.out.println("두 수의 곱 = " + z);
	}
	
	public static void main(String[] args) {
		int a = 20, b = 10;
		Inheritance01 obj = new Inheritance01();
		
		obj.add(a, b);
		System.out.println("두 수의 차는 = " + obj.sub(a, b));
		obj.mult(a, b);
	}

}
