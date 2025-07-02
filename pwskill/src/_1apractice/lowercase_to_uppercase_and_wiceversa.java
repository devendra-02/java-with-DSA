package _1apractice;

import java.util.Scanner;

public class lowercase_to_uppercase_and_wiceversa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter a string ");
		String s = sc.nextLine();

		char arr[] = s.toCharArray();

		for (int i = 0; i < s.length(); i++) {
			int asci = (int) arr[i];
			if (asci > 96 && asci < 123) {
				asci -= 32;
				arr[i] = (char) asci;
			} else {
				asci += 32;
				arr[i] = (char) asci;
			}
		}
		String newstr = new String(arr);
		System.out.println(newstr);
	}

}
