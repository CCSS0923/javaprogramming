package abs2;

interface Fly { public void fly(); }
interface Walk { public void walk(); }

class Chicken implements Fly, Walk {
	public void fly() { System.out.println("닭은 날 수 있다."); }
	public void walk() { System.out.println("닭은 걸을 수 있다."); }
}

class Bird implements Fly {
	public void fly() { System.out.println("새는 높이 날 수 있다."); }
}

public class Ex07 {

	public static void main(String[] args) {
		Chicken c = new Chicken();
		c.fly();
		c.walk();
		
		Bird b = new Bird();
		b.fly();

	}

}
