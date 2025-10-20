import java.util.Scanner;

public class e20250407 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int time = s.nextInt();
		int charge = 3000;
		
		if(time > 30) {
			charge += (time - 30) / 10 * 1000; 
		}
		
		System.out.println("요금은 " + charge + "원입니다");
	}

}
