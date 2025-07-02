package _1apractice;

import java.util.Scanner;

public class greatest_of_three {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter a first no ");
		int a = sc.nextInt();
		System.out.println("enter a second no ");
		int b = sc.nextInt();
		System.out.println("enter a third no ");
		int c = sc.nextInt();

		if (a >= b && a >= c) {
			System.out.println(a + " a is the largest no");
		} else {
			if (b >= c) {
				System.out.println(b + " b is the largest no");
			} else {
				System.out.println(c + " c is the largest no");
			}
		}
	}

}
