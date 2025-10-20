public class d20250519_1 {

    public static void main(String[] args) {
        int[] Arr = { 80, 77, 25, 68, 98, 45, 57, 88, 75, 59, 20, 30, 40, 50 };

        // 정렬 전 배열 출력
        System.out.println("정렬 전 배열:");
        printArray(Arr);

        // 내림차순 선택정렬
        selectionSortDescending(Arr);

        // 정렬 후 배열 출력
        System.out.println("정렬 후 배열(내림차순):");
        printArray(Arr);
    }

    // 내림차순 선택정렬 메서드
    public static void selectionSortDescending(int[] arr) {
        for (int k = 0; k < arr.length; k++) {
            for (int j = k; j < arr.length; j++) {
                if (arr[k] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[k];
                    arr[k] = temp;
                }
            }
        }
    }

    // 배열 출력 메서드
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
