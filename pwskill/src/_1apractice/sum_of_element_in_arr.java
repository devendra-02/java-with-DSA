package _1apractice;

public class sum_of_element_in_arr {
	public static void main(String[] args) {
		int arr[] = { 42, 7, 15, 89, 3, 56, 21, 77, 12, 68 };

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}

		System.out.println("sum of all the elements in arr is " + sum);
	}
}
