package abs3;

abstract class Parent { // 추상 클래스
	
	void show( ) {
		System.out.println("I am parent show");
	}
	
	abstract void call( ); // 추상 메소드
}

class Child extends Parent {
	
	void print( ) {
		System.out.println("I am child print");
	}
	
	void call( ) { // call( ) 메소드를 오버라이딩하지 않으면 에러 발생
		System.out.println("I am child call");
	}
}

public class Code164 {
	public static void main(String[] args) {

		Child x = new Child( );
		x.show( );
		x.print( );
		x.call( );
	}
}