package _1apractice;

public class even_or_odd_in_arr {
	public static void main(String[] args) {
		int arr[] = { 42, 7, 15, 89, 3, 56, 21, 77, 12, 68 };
		int evenno = 0;
		int oddno = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				evenno++;
			} else {
				oddno++;
			}
		}

		System.out.println("even no in arr are " + evenno + "\n odd no in arr are " + oddno);
	}
}
