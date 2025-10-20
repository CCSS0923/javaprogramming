
public class M202 {
	static void overMethod() {
		System.out.println("no parameters.");
	}
	static void overMethod(int x) {
		System.out.println("One parameter : " + x);
	}
	static void overMethod(int x, int y) {
		System.out.println("Two integer parameters : " + x + "," + y);
	}
	static void overMethod(int x, double y) {
		System.out.println("One integer " + x + "and the oter double " + y);
	}
	public static void main(String[] args) {
		overMethod(5,7);
		overMethod(100, 25.5);
		overMethod();
		overMethod(10);
	}

}
