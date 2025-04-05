package pattern_printing;

import java.util.Scanner;

public class number_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a no of coiumns ");
		int c =sc.nextInt();
		
//		System.out.println("enter a no of rows ");
//		int r =sc.nextInt();
//		
//		for(int i=1;i<=r;i++) {
//			for(int j=1;j<=c;j++) {
//				System.out.print(j+" ");
//			}	
//			System.out.println();}
//---------------------------------------or--------------------------------------------------------------------
	/*  1
		2 2
		3 3 3
		4 4 4 4
		5 5 5 5 5 */
		
		for(int i=1;i<=c;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}	
			System.out.println(); }
		
	}

}
