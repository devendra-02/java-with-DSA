package pattern_printing;

import java.util.Scanner;

public class mix_numb_or_alphabate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	
		System.out.println("enter a no of columns ");
		int c =sc.nextInt();
		
//		PRINT
//		1
//		A B
//		1 2 3
//		A B C D
//		1 2 3 4 5
//		A B C D E F.....
		
		
		for(int i=1;i<=c;i++) {
			for(int j=1;j<=i;j++) {
				if(i%2!=0) {
				System.out.print(j+" ");}
				
				else
					System.out.print((char)(j+64)+" ");
				
					
			}	
			System.out.println();
		}
	}

}
