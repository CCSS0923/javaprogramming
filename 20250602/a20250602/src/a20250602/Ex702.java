package a20250602;

class Cat1 {
	String breed;
	String color;
	
	void eat() {
		System.out.println("먹이를 먹다");
	}
	void scratch() {
		System.out.println("발톱으로 할퀴다");
	}
	void meow() {
		System.out.println("야옹~ ");
	}
	
}


public class Ex702 {

	public static void main(String[] args) {
		Cat1 c = new Cat1();
		
		c.breed = "야옹이";
		c.color = "흰색";
		
		System.out.println("품종은 : " + c.breed);
		System.out.println("색깔은 : " + c.color);

		c.eat();
		c.scratch();
		c.meow();

	}

}
