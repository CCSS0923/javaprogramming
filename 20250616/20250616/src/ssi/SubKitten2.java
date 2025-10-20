package ssi;

public class SubKitten2 extends SuperCat2 {
	String name;
	SubKitten2(){
		System.out.println("SubKitten2() 생성자 호출");
	}
	void printInfo() {
		System.out.println("I am SubKitten2");
	}
	void printDetail() {
		super.printInfo();
		printInfo();
		super.name = "왕 고양이";
		name = "아기 고양이";
		System.out.println("SuperCat name : " + super.name);
		System.out.println("SuperCAt name : " + this.name);
	}
}
