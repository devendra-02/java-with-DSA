package _1apractice;

public class hellow {
	static void interation(int[] arr, int[] brr, int a, int b) {
		int i = 0;
		int j = 0;
		while (i < a && j < b) {
			if (arr[i] == brr[j]) {
				System.out.print(arr[i] + " ");
				i++;
				j++;
			} else if (arr[i] < brr[j]) {
				i++;
			} else {
				j++;
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int[] brr = { 1, 3, 5, 7, 9, 0 };

		interation(arr, brr, arr.length, brr.length);
	}
}