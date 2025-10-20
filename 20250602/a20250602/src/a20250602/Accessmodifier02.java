package a20250602;

public class Accessmodifier02 {

	public static void main(String[] args) {
		Dog obj = new Dog();
		
		obj.breed = "포메라니언";
		obj.color = "갈색";
		obj.age = 10;
//		obj.name = "황구";
		
		System.out.println("강아지 품종 : " + obj.breed);
		System.out.println("강아지 색상 : " + obj.color);
		System.out.println("강아지 나이 : " + obj.age);
		obj.bowwow();
		obj.run();
//		obj.sleep();

	}

}
