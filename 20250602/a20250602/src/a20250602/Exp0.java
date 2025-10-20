package a20250602;

class Persion0 {
	public String name = "김철수";
	public int age;
	public String adress;
}

public class Exp0 {

	public static void main(String[] args) {
		Persion0 p0 = new Persion0();
		
		System.out.println(p0.name);
		System.out.println(p0.age);
		System.out.println(p0.adress);
		
		p0.name = "홍길동";
		p0.age = 10;
		p0.adress = "Seoul";
		System.out.println(p0.name);
		System.out.println(p0.age);
		System.out.println(p0.adress);

	}

}
