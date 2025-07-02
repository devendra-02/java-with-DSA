package _1apractice;

import java.util.Scanner;

public class calculate_sum_of_digit_of_no {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a no ");
		int no = sc.nextInt();

		int sum = 0;

		while (no != 0) {
			int digit = no % 10;
			sum += digit;
			no /= 10;
		}
		System.out.println("sum of digit = " + sum);
	}

}
