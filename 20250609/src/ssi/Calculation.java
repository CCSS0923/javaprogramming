package ssi;

public class Calculation {
	int z;
	
	public void add(int x, int y) {
		z = x + y;
		System.out.println("두 수의 합 = " + z);
	}
	
	public int sub(int x, int y) {
		return x - y;
	}
}
