package OOP;

class Car{
	String model;
	String color;
	int cost;
	int tax;
	
	public Car() { System.out.println("기본 생성자"); }
	public Car(String model, String color, int cost, int tax) { 
		this.model = model;
		this.color = color;
		this.cost = cost;
		this.tax = tax;
	}
	
	
	public int price() {
		return cost + tax;
	}
}

public class ExCar {

	public static void main(String[] args) {
		Car c0 = new Car();
		Car c1 = new Car("Sonata", "White", 3000, 300);
		Car c2 = new Car("Pride", "Red", 2000, 100);
		
		c0.model = "Benz";
		c0.color = "Gray";
		c0.cost = 7000;
		c0.tax = 1400;
		
		System.out.println(c0.model + "의 소비자 가격은 : " + (c0.cost + c0.tax));
	
		System.out.println(c1.model + "의 소비자 가격은 : " + c1.price());
		System.out.println(c2.model + "의 소비자 가격은 : " + c2.price());
	}

}
