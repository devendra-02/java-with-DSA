package _1apractice;

import java.util.Scanner;

public class factorials {

	public static int factorial(int n) {
		if (n == 1 || n == 0) {
			return 1;
		}

		int ans = n * factorial(n - 1);

		return ans;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter a no jiska factorial chahiye ");
		int n = sc.nextInt();

		if (n < 0) {
			System.out.println("negativ no ka factorial nhi hota ");
		} else {
			int ans = factorial(n);
			System.out.println("factorial of " + n + " is " + ans);
		}
	}
}
