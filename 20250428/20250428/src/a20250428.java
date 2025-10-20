import java.util.Scanner;

public class a20250428 {
	
	public static void text(String str) {
		for(int i = 0; i < str.length()+1; i++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.println(str);
		for(int i = 0; i < str.length()+1; i++) {
			System.out.print("*");
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		text(str);
	}

}
