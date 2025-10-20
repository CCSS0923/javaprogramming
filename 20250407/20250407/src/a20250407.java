
public class a20250407 {

	public static void main(String[] args) {
		for(int i = 0; i <= 90; i+=10) {
			for(int j = 1; j <= 10; j++) {
				System.out.print(i + j + " ");
			}
			System.out.println();
		}
		
		int num = 1;
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				System.out.print(num + " ");
				num++;
			}
			System.out.println();
		}
	}

}
