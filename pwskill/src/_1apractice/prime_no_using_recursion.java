package _1apractice;

import java.util.Scanner;

public class prime_no_using_recursion {

	public static boolean checkprime(int num, int temp) {
		if (num <= 1)
			return false; // 1 or less is not prime

		if (temp < 2)
			return true;

		if (num % temp == 0) {
			return false;
		}
		return checkprime(num, temp - 1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("konsa no check krne ka h tere ko ");
		int n = sc.nextInt();

		boolean check = checkprime(n, n / 2);
		;

		System.out.println(check);
	}
}
