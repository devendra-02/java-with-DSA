package _1apractice;

public class maximum_element_in_arr {
	public static void main(String[] args) {

		int arr[] = { 42, 7, 15, 89, 3, 56, 21, 77, 12, 68 };

		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= max) {
				max = arr[i];
			}
		}
		System.out.println("largest no in arr is " + max);
	}
}
