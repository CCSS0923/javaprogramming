package ssi;

public class SubKitten2 extends SuperCat2 {
	String name;
	SubKitten2(){
		System.out.println("SubKitten2() ������ ȣ��");
	}
	void printInfo() {
		System.out.println("I am SubKitten2");
	}
	void printDetail() {
		super.printInfo();
		printInfo();
		super.name = "�� �����";
		name = "�Ʊ� �����";
		System.out.println("SuperCat name : " + super.name);
		System.out.println("SuperCAt name : " + this.name);
	}
}
