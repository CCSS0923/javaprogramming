class P {
	
	void show( ) {
		System.out.println("I am parent show");
	}
	
	void show(int data) {
		System.out.println("I am parent show - data : " + data);
	}
	
}

class C extends P {
	
	@Override
	void show(int data) {   //P의 두 번째 show(int data)를 재정의
		System.out.println("I am child show - data : " + data);
	}
}

public class Code300 {
	
	public static void main(String[] args) {
		C c = new C( );
		c.show( );
		c.show(100);

	}
}