
public class b20250512 {

	public static void main(String[] args) {
		int sum = 0;
		//int[]myArr = {10, 20, 30, 40, 50};
		int[]myArr = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		//int[]myArr = new int[] {10, 20, 30, 40, 50};
		for(int i = 0; i < myArr.length; i++) {
			sum += myArr[i];
		}
		double average = sum / myArr.length;
		System.out.println("합계: " + sum);
		System.out.println("평균: " + average);
	}

}
