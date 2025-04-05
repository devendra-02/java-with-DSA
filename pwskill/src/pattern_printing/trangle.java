package pattern_printing;

import java.util.Scanner;

public class trangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner sc = new Scanner(System.in);
			System.out.println("enter a no of columns ");
			int c =sc.nextInt();
			
//**********************************sidhe trianngle ke liye**********************************************
			
//			for(int i=1;i<=c;i++) {
//				for(int j=1;j<=i;j++) {
//					System.out.print("* ");
//				}	
//				System.out.println("l");
//			}
			
//---------------------------------------or--------------------------------------------------------------------
			
//			int n = 0;
//			for(int i=1;i<=c;i++) {
//				n = n+1 ;
//				if(n<=c) {
//				for(int j=1;j<=n;j++) 
//					System.out.print("* ");}
//				
//				System.out.println();
//			}
			
			
//*********************************ulte triangle ke liye***************************************************
			
//				int n = c ;
//				for(int i=1;i<=c;i++) {
//					for(int j=1;j<=n;j++) {
//						System.out.print("* ");
//					}	
//					n=n-1;
//					System.out.println("l");
//				}
			
//---------------------------------------or--------------------------------------------------------------------
				
				for(int i=1;i<=c;i++) {
					for(int j=1;j<=c+1-i;j++) {
						System.out.print("* ");
					}	
					System.out.println("l");
				}
				
			
	}

}
