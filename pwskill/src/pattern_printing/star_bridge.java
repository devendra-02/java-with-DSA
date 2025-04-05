package pattern_printing;

import java.util.Scanner;

public class star_bridge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		   PRINT
//		*******
//		*** ***
//		**   **
//		*     *

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a no of line ");
		int n = sc.nextInt();
		
		for(int t=1;t<=2*n-1;t++) {
			System.out.print("*");
		}
		System.out.println();
		n--;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n+1-i;j++){ 
			System.out.print("*");}
			
			for(int j=1;j<=2*i-1;j++) { 
				System.out.print(" ");}
			
			for(int j=1;j<=n+1-i;j++){ 
				System.out.print("*");}
			
			System.out.println();
		}	
	}

}
