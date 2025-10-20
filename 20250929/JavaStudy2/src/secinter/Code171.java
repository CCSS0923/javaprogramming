package secinter;

interface A {
	void test1( );
	void test2( );
}

interface B {
	void test3( );
	void test4( );
}

class All implements A, B {
	public void test1( ) {
		System.out.println("Testing 1");
	}
	
	public void test2( ) {
		System.out.println("Testing 2");
	}
	
	public void test3( ) {
		System.out.println("Testing 3");
	}
	
	public void test4( ) {
		System.out.println("Testing 4");
	}
}

public class Code171 {
	public static void main(String[] args) {
		All x = new All( );
		x.test1( );
		x.test2( );
		x.test3( );
		x.test4( );
	}
}