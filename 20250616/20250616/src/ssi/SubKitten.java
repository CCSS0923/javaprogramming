package ssi;

public class SubKitten extends SuperCat {
	String age = "2��";
	
	void printInfo() {
		System.out.print("�Ʊ� ������Դϴ� : ");
	}
	void printDetail() {
		super.printInfo();
		System.out.println("ǰ���� " + super.breed + ". ���̴� " + super.age);
		
		printInfo();
		System.out.println("ǰ���� " + this.breed + ". ���̴� " +  this.age);
	}
}
