package _1apractice;

import java.util.Scanner;

public class string_palindom {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter a string ");
		String s = sc.nextLine();

		boolean palindrom = true;

		int i = 0, j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				palindrom = false;
				break;
			}
			i++;
			j--;
		}

		if (palindrom == true) {
			System.out.println("yes string is palindrom ");
		} else {
			System.out.println("no string is ot a palindrom ");
		}
	}

}
