package _1apractice;

public class second_largest_in_arr {
	public static void main(String[] args) {
		int arr[] = { 42, 79, 15, 89, 3, 56, 21, 77, 12, 68 };

		int max = Integer.MIN_VALUE;
		int secondlar = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				secondlar = max;
				max = arr[i];
			} else if (arr[i] > secondlar && arr[i] < max) {
				secondlar = arr[i];
			}
		}
		if (secondlar == Integer.MIN_VALUE) {
			System.out.println("Second largest does not exist");
		} else {
			System.out.println("Second largest no in arr is " + secondlar);
		}
	}
}
