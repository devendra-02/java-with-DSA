package pattern_printing;
import java.util.Scanner;
public class print_cross {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	PRINT
//		*   *
//		 * * 
//		  *  
//		 * * 
//		*   *
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a odd  no ");
		int n = sc.nextInt();
		
		for(int j=1;j<=n;j++) {
			for(int i=1;i<=n;i++) {
				if(i==j || i+j==n+1 )
				System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
