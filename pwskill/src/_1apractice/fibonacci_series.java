package _1apractice;

import java.util.Scanner;

public class fibonacci_series {

	public static int series(int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		int ans = series(n - 1) + series(n - 2);
		return ans;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("fibonacci series ki konsi term chahiye");
		int n = sc.nextInt();

		if (n < 0) {
			System.out.println("ye negative no h re yar");
		} else {
			int ans = series(n);
			System.out.println(n + "th fibonacci no is " + ans);
		}
	}

}
