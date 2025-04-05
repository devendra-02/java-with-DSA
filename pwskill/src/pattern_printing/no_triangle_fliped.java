package pattern_printing;

import java.util.Scanner;

public class no_triangle_fliped {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		     PRINT
//              1
//            1 2
//          1 2 3
//        1 2 3 4
//      1 2 3 4 5


		Scanner sc = new Scanner(System.in);
		System.out.print("enter a no ");
		int n = sc.nextInt();

		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
				
			for(int j=1;j<=i;j++) {
				System.out.print(j+"");
			}	
			System.out.println();
		}
	}

}
