package loops;

import java.util.Scanner;

public class sum_of_digit_of_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number ");
		long n = sc.nextLong();
		long count = 0 ;
		
		for(;n!=0;n=n/10) {
			long lastdigit = n%10 ;
			count = count + lastdigit; 
		}
		
//		while(n!=0) {
//			long lastdigit =n%10;
//			count = count + lastdigit;
//			n=n/10;
//			 }
		
		
		System.out.println("sum of digits of number is "+ count);
	}

}
