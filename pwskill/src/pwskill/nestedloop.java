package pwskill;

import java.util.Scanner;
 class nestedloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a three nums");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println("largest no is ");
		if (a>b) {
			if(a>c)System.out.println("a is a larger number");
			else System.out.println("c is a larger number");
		}
		else if(b>c) {
			if(b>a)System.out.println("b is a larger num ");
			else System.out.println("a is a larger no ");
		}
		else System.out.println("c is a larger no ");

	}

}
