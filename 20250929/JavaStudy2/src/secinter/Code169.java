package secinter;

interface Things {
	void printInfo( );
}

interface Book extends Things { // 인터페이스가 인터페이스를 상속받을 때
	void showTitle( );
}

class ChildrenBook implements Book { // 클래스가 인터페이스를 상속받을 때
	private String title;
	private String author;
	
	ChildrenBook( ){}
	ChildrenBook(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public void printInfo( ) { // 반드시 오버라이딩해야 합니다.
		System.out.println("** Infomation for books **");
	}
	
	public void showTitle( ) { // 반드시 오버라이딩해야 합니다.
		System.out.println("교 재 : " + title);
		System.out.println("저 자 : " + author);
	}
}

public class Code169 {
	public static void main(String[] args) {
		ChildrenBook b = new ChildrenBook("JAVA 마스터", "송미영");
		b.printInfo( );
		b.showTitle( );
	}
}