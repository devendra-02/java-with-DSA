package _1apractice;

public class reverse_arr {
	public static void main(String[] args) {
		int arr[] = { 42, 79, 15, 89, 3, 56, 21, 77, 12 };

		System.out.println("before reverse the arr ");
		for (int num : arr) {
			System.out.print(num + " ");
		}

		int i = 0;
		int j = arr.length - 1;

		for (int k = 0; k < (arr.length / 2); k++) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}

		System.out.println("\n after reverse the array ");
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
}
