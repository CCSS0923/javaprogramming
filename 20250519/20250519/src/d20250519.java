public class d20250519 {

	public static void main(String[] args) {
		int[] Arr = { 80, 77, 25, 68, 98, 45, 57, 88, 75, 59, 20, 30, 40, 50 };
		int temp = 0;

		for (int i = 0; i < Arr.length; i++) {
			System.out.print(Arr[i] + " ");
		}
		System.out.println();

		for (int k = 0; k < Arr.length; k++) {
			for (int j = k; j < Arr.length; j++) {
				if (Arr[k] < Arr[j]) {
					temp = Arr[j];
					Arr[j] = Arr[k];
					Arr[k] = temp;
				}
			}
		}

		for (int i = 0; i < Arr.length; i++) {
			System.out.print(Arr[i] + " ");
		}
	}

}
