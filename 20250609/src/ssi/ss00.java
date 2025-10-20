package ssi;

class Fafa {
	String fname = "은주";
	String lname = "정";
	String house = "서울시 동작구";
	String car = "소나타";
	int asset = 20;
	
	public Fafa() { System.out.println("Fafa() 기본 생성자 호출"); }
	
	void eat() { System.out.println("한정식을 잘 먹어요"); }
	void sport() { System.out.println("Golf를 즐겨요"); }
}

class Son extends Fafa{
	String fname = "철수";
	String car = "벤츠";
	int asset = 5;
	public Son() { System.out.println("Son() 기본 생성자 호출"); }
	void eat() { System.out.println("돈가스를 좋아해요"); }
}

public class ss00 {

	public static void main(String[] args) {
		Fafa f = new Fafa();
		
		System.out.print("아버지는 " + f.lname + f.fname + "입니다. ");
		System.out.println(f.house + "에 거주하고, 차량은 " + f.car +
				", 자산은 " + f.asset + "입니다");
		Son s = new Son();
		
		System.out.println("\n아들 관련 자료입니다");
		System.out.print(s.lname);
		System.out.println(s.fname);
		System.out.println(s.car);
		System.out.println(s.asset);
		s.eat();
		s.sport();
	}

}
