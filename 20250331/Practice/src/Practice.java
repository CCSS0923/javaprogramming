import java.util.Scanner;


public class Practice {

	public static void main(String[] args) {

		double sum_A = 1.0;
		double sum_B = 1.0;
		
		for(int i = 2; i <= 100; i++) {
			sum_A += 1/(double)i;
		}
		System.out.println("1 + 1/2 + 1/3 + 1/4 + . . . + 1/99 + 1/100  = " + sum_A);
		
		for(int j = 100; j >= 2; j--) {
			sum_B += 1/(double)j;
		}
		System.out.println(" 1/100 + 1/99 + 1/98 + . . . + 1/3 + 1/2 + 1 = " + sum_B);
		
		System.out.println("A = " + sum_A);
		System.out.println("B = " + sum_B);
	}

}
