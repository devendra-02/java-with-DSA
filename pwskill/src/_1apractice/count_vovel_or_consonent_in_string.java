package _1apractice;

import java.util.Scanner;

public class count_vovel_or_consonent_in_string {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the string ");
		String s = sc.nextLine();

		int vovals = 0;
		int consonent = 0;

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vovals++;
			} else {
				consonent++;
			}
		}

		System.out.println("no of vovals are " + vovals + "\n no fo consonents are " + consonent);
	}

}
