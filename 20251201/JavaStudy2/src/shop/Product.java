package shop;

public abstract class Product {
	// 상품명과 가격 변수
	String pname;
	int price;
	
	// 상품명과 가격을 출력하는 기본정보 출력 메서드
	public void printDetail() {
		System.out.print("상품명: "+pname+" , ");
		System.out.print("가격: "+price+" , ");
		printExtra();
	}
	
	public abstract void printExtra();
}
