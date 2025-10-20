import java.util.Scanner;

public class e20250414 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int cnt = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				cnt++;
			}
		}
		if(cnt == 2) {
			System.out.println("솟수입니다");
		}
		else {
			System.out.println("솟수가 아닙니다");
		}
	}

}
