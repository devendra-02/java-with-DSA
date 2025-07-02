package _1apractice;

import java.util.Scanner;

public class factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("kis no ks factorial chahiye ");
		int n = sc.nextInt();

		int ans = 1;

		while (n != 0) {
			ans = ans * n;
			n -= 1;
		}

		System.out.println("factorial of " + ans);

	}
}
