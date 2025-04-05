package pattern_printing;
import java.util.Scanner;
public class stat_triangle_flip {

//	       PRINT
	
//		     *
//          * *
//        * * *
//      * * * *......

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a no ");
		int n = sc.nextInt();
		
		for(int j=1;j<=n;j++) {
			for(int i=1;i<=n;i++) {
				if(i+j<=n)
				System.out.print("  ");
				else
					System.out.print(" *");
			}	
			System.out.println("");
		}
	}
}
