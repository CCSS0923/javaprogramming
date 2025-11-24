class Test {
	private String msg;
	
	Test(String m) {
		msg = m;
	}
	
//	@Deprecated   
	@Deprecated
	String getMsg( ) {   // 옛날 것이니 이런표기 쓰지말라 (사선 의미)
		return msg;
	}
}

public class Code273 {
	
	public static void main(String[] args) {
		Test t = new Test("hello");
		System.out.println(t.getMsg( ));
	}
}