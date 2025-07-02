package _1apractice;

import java.util.Scanner;

public class fibonacci_seriess {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter a no of terms you want ");
		int n = sc.nextInt();

		int a = 0;
		int b = 1;

		for (int i = 0; i < n; i++) {
			System.out.print(a + " ");

			int val = a + b;
			a = b;
			b = val;
		}
	}
}
