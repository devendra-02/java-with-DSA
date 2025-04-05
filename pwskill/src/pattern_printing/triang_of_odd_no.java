package pattern_printing;
import java.util.Scanner ;
public class triang_of_odd_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		print upto given no of rows 
//		1
//		1 3 
//		1 3 5
//		1 3 5 7 ..........
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a no of columns ");
		int c =sc.nextInt();
		 
//		for(int i=1;i<=c;i++) {
//			for(int j=1;j<=i;j++) {
//					System.out.print(2*j-1 +" ");   // this line is important 
//			}	
//			System.out.println();}
	
//--------------------------------------or--------------------------------------------------------------
		
		for(int i=1;i<=c;i++) {
			int a = 1 ;
			for(int j=1;j<=i;j++) {
					System.out.print(a +" ");
					a = a+2;
			}	
			System.out.println();}

	}

}
