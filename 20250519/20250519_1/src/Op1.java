
public class Op1 {

	public static void main(String[] args) {
		
		Dog d1 = new Dog();
		
		d1.breed = "진돗개";
		d1.age = 12;
		d1.color = "brown";
		
		Dog d2 = new Dog();
		
		d2.breed = "풍산개";
		d2.age = 15;
		d2.color = "white";
		
		Dog d3 = new Dog();
		
		d2.breed = "야생견";
		d2.age = 20;
		d2.color = "black";
		
		System.out.println(d1.breed);
		System.out.println(d1.age);
		System.out.println(d1.color);

	}

}
