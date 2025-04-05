package pattern_printing;

import java.util.Scanner;

public class star_diamend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//			     print
//	          * 
//	        * * * 
//  	  * * * * * 
//  	    * * * 
//	          * 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a no ");
		int n = sc.nextInt();

		int nsp = n-1;
		int nst = 1;
		for(int i=1;i<=n;i++){ // rows
			for(int j=1;j<=nsp;j++){ // spaces 
				System.out.print(" " + " ");
			}
			for(int j=1;j<=nst;j++){ // stars 
				System.out.print("*" + " ");
			}
			System.out.println();
			nsp--;
			nst += 2;
		}
		nsp = 1;
		nst -=4;
		for(int i=1;i<=n;i++){ // rows
			for(int j=1;j<=nsp;j++){ // spaces 
				System.out.print(" " + " ");
			}
			for(int j=1;j<=nst;j++){ // stars 
				System.out.print("*" + " ");
			}
			System.out.println();
			nsp++;
			nst -= 2;
		}
	}

}
