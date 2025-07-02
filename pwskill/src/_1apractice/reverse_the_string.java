package _1apractice;

import java.util.Scanner;

public class reverse_the_string {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the string ");
		String s = sc.nextLine();

		char arr[] = s.toCharArray();

		int i = 0;
		int j = arr.length - 1;

		while (i < j) {
			char temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}

		s = new String(arr);
		System.out.println("reversed String is \n" + s);
	}

}
