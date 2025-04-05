package pattern_printing;

import java.util.Scanner;

public class alphabate_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a no of columns ");
		int c =sc.nextInt();
		
		for(int i=1;i<=c;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print((char)(j+64)+" ");
			}	
			System.out.println("l");}
		
//--------------------------------or( ulte ke liye)--------------------------------------------------------------------
//		for(int i=1;i<=c;i++) {
//			for(int j=1;j<=c+1-i;j++) {
//				System.out.print((char)(j+64)+" ");
//			}	
//			System.out.println("l"); }

		
	}

}
