package pattern_printing;

import java.util.Scanner;

public class number_bridge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		  PRINT
//		123456789
//		1234 6789
//		123   789
//		12     89
//		1       9


		Scanner sc = new Scanner(System.in);
		System.out.println("enter a no of line ");
		int n = sc.nextInt();
		
		for(int t=1;t<=2*n-1;t++) {
			System.out.print(t);
		}
		System.out.println();
		n--;
		
		for(int i=1;i<=n;i++) {
			int num = 1 ;
			for(int j=1;j<=n+1-i;j++){ 
			System.out.print(num);
			num++ ;}
			
			for(int j=1;j<=2*i-1;j++) { 
				System.out.print(" ");
				num++ ; }
			
			for(int j=1;j<=n+1-i;j++){ 
				System.out.print(num);
				num++ ; }
			
			System.out.println();
		}	
	}

}
