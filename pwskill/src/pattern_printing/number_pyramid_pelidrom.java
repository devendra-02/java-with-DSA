package pattern_printing;

import java.util.Scanner;

public class number_pyramid_pelidrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		    PRINT
//	     1
//	    121
//	   12321
//	  1234321
//	 123454321


		Scanner sc = new Scanner(System.in);
		System.out.println("enter a no of line ");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
		   for(int j=1;j<=i;j++) {
			    System.out.print(j);
    		}
			for(int j=i-1;j>=1;j--) {
				System.out.print(j);
			}
			System.out.println("");
		}
	}

}
