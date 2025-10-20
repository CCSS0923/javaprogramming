package pkg3;

class Data1 {
	
	void print( ) {
		System.out.println("class Data1 print method");
	}
}

class Data2 {
	
	void show( ) {
		System.out.println("class Data2 show method");
	}
}

public class Code152 {
	
	public static void main(String[] args) {
		
		Data1 d1 = new Data1( );
		Data2 d2 = new Data2( );
		
		if (d1 instanceof Data1) // d1이 Data1의 인스턴스인지 판단합니다	
			d1.print( );
		System.out.println(d1 instanceof Data1);
		if (d2 instanceof Data2) // d2가 Data2의 인스턴스인지 판단합니다.
			d2.show( );
		System.out.println(d2 instanceof Data2);
	}
}