package pattern_printing;
import java.util.Scanner;
public class BINARY_NO_TRIANGLE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a no ");
		int n = sc.nextInt();
		
//		PRINT
//		1
//		01
//		101
//		0101
//		10101

		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				if((i+j)%2==0)
				System.out.print("1");
				else
					System.out.print("0");
			}	
			System.out.println(); }
		
//--------------------------------------or--------------------------------------------------------------		
		
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=i;j++) {
//				if(j%2==1) {
//					if(i%2==1)
//						System.out.print("1");
//					else
//						System.out.print("0");
//				}
//				else {///2==0
//					if(i%2==0)
//						System.out.print("1");
//					else
//						System.out.print("0");
//				}
//			}
//			System.out.println("h");
//		}
		
		
	}
}
