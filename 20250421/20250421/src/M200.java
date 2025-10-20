
public class M200 {
	
	public static int add(int x, int y) {
		return (x + y);
	}
	
	public static int sub(int x, int y) {
		return (x - y);
	}
	
	public static int mult(int x, int y) {
		return (x * y);
	}
	
	public static int div(int x, int y) {
		return (x / y);
	}
	
	
	public static void main(String[] args) {
		int a = 2, b = 1;
		System.out.println(add(a, b));
		System.out.println(sub(a, b));
		System.out.println(mult(a, b));
		System.out.println(div(a, b));
	}
}
