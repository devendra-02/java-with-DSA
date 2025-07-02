package _1apractice;

import java.util.Scanner;

public class leap_year {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter a no ");
		int year = sc.nextInt();

		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println("yes year is a leap year ");
		} else {
			System.out.println("not year is a leap year ");
		}
	}

}
