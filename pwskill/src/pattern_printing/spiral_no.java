package pattern_printing;

import java.util.Scanner;

public class spiral_no {
	
//	     	print 	
//	1 1 1 1 1 
//	1 2 2 2 1 
//	1 2 3 2 1 
//	1 2 2 2 1 
//	1 1 1 1 1 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a no of line ");
		int n = sc.nextInt();
		
//		for(int i=1;i<=2*n-1;i++) {
//			for(int j=1;j<=2*n-1;j++){
//			int a=i , b=j ;
//			if(i>n) a=2*n-i;
//			if(j>n) b=2*n-j;
//			System.out.print(Math.min(a, b)+" ");
//			}
//			
//		System.out.println();
//		}
		
		for(int i=1;i<=2*n-1;i++) {
			for(int j=1;j<=2*n-1;j++){
			int a=i , b=j ;
			if(i>n) a=2*n-i;
			if(j>n) b=2*n-j;
			System.out.print(n+1-Math.min(a, b)+" ");
			}
			
		System.out.println();
		}
	}

}
