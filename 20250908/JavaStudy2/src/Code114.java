class Circle {
	
	static double PI = 3.141592;
	double radius; // 반지름
	
	Circle(double radius) {
		this.radius = radius;
	}
	
	double area( ) {
		return this.radius * this.radius * PI;
	}
	
	double perimeter( ) {
		return 2 * PI * this.radius;
	}
}

public class Code114 {
	
	public static void main(String[] args)	{
		Circle c1 = new Circle(10.0);
		Circle c2 = new Circle(100.0);
		
		System.out.println("area of c1 : " + c1.area( ) + "\n");
		System.out.println("perimeter of c1 : " + c1.perimeter( ) + "\n");
		
		System.out.println("area of c2 : " + c2.area( ) + "\n");
		System.out.println("perimeter of c2 : " + c2.perimeter( ));
	}
}