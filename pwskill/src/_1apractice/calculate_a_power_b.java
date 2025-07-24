package _1apractice;

import java.util.Scanner;

public class calculate_a_power_b {

	public static int power(int a, int b) {
		if (b == 0) {
			return 1;
		}
		return a * (power(a, b - 1));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a base ");
		int a = sc.nextInt();
		System.out.println("enter a power");
		int b = sc.nextInt();

		int ans = power(a, b);
		System.out.println("a power b is the " + ans);
	}

}
