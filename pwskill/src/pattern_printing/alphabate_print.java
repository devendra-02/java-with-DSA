package pattern_printing;

import java.util.Scanner;

public class alphabate_print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a no of rows ");
		int r =sc.nextInt();
		System.out.println("enter a no of coiumns ");
		int c =sc.nextInt();
		
		for(int i=1;i<=r;i++) {
			for(int j=1;j<=c;j++) {
				System.out.print((char)(j+64)+" ");     // imp 
			}	
			System.out.println();
		}
	}

}
