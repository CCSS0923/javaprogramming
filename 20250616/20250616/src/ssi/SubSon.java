package ssi;

public class SubSon extends SubFather{
	void printSon() {
		System.out.println("나는 아들: 아버지로 부터 상속 받았습니다");
		System.out.println("나는 아버지는 : " + this.fName);
		System.out.println("나의 집은 : " + this.house);
	}
}
