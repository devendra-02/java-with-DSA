package _1apractice;

import java.util.Scanner;

public class valid_triangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first side: ");
		int a = sc.nextInt();

		System.out.print("Enter second side: ");
		int b = sc.nextInt();

		System.out.print("Enter third side: ");
		int c = sc.nextInt();

		if (a + b > c && b + c > a && a + c > b) {
			System.out.println("The sides form a valid triangle.");
		} else {
			System.out.println("The sides do not form a valid triangle.");
		}

		sc.close();
	}
}
