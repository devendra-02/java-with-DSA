package _1apractice;

import java.util.Scanner;

public class armstrom_no {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter a no ");
		int n = sc.nextInt();
		int ans = 0;
		int noofdigits = 0;

		int temp = n;
		while (temp != 0) {
			noofdigits++;
			temp /= 10;
		}
		System.out.println("no of digits are " + noofdigits);

		temp = n;
		while (temp != 0) {
			int ls = temp % 10;
			int cube = 1;
			for (int i = 1; i <= noofdigits; i++) {
				cube *= ls;
			}
			ans += cube;
			temp /= 10;
		}
		if (ans == n) {
			System.out.println("yes " + n + " is a armstrom no ");
		} else {
			System.out.println("no " + n + " is a armstrom no");
		}
	}

}
