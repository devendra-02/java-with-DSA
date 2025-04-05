package pattern_printing;
import java.util.Scanner  ;
public class print_plus {

	public static void main(String[] args) {
		// TODO Auto-generated method
		Scanner sc = new Scanner(System.in);
		System.out.println("enter an even no ");
		int n = sc.nextInt();
		int half = (n/2)+1;
		
//		print
//		    *    
//		    *
//		* * * * *
//		    *
//		    *
		
		 for(int j=1;j<=n;j++) {
			 if(j==half) {
				 for(int k=1;k<=n;k++)
					 System.out.print("* ");
			 }
				 
				 else {
			 for(int i=1;i<=n;i++) {
				 if(i==half)
				 System.out.print("* ");
				 else
					 System.out.print("  ");}
			 }
			 System.out.println("  ");
		 }
//--------------------------------------or--------------------------------------------------------------
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=n;j++) {
					if(i==half || j==half)
						System.out.print("* ");
					else
						System.out.print("o ");
				}	
				System.out.println(); }
			
	}

}
