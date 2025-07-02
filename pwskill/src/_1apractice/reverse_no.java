package _1apractice;

import java.util.Scanner;

public class reverse_no {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter a no ");
		int n = sc.nextInt();

		int rev = 0;

		while (n != 0) {
			int temp = n % 10;

			rev = rev * 10;
			rev = rev + temp;

//			rev = rev * 10 + temp;
			n = n / 10;
		}
		System.out.println("reversed no is " + rev);
	}
}
