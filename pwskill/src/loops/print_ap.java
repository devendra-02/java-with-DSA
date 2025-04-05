package loops;
import java.util.Scanner;
public class print_ap {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number ");
		int n = sc.nextInt();
		
//		 print ap 1,3,5,7,9 .... upto nth term
			
//		n = (2*n)-1;      // value of nth term
//				for(int i=1;i<=n;i+=2) {
//					System.out.println(i);
//				}  // n rounds ( n times hi loop chal ra h )
				
				
//				 print ap 4,7,10,13,16......upto nth term
				
				n = (3*n)+1;      // value of nth term
				for(int i=4;i<=n;i+=3) {
					System.out.println(i);
				}  // n rounds ( n times hi loop chal ra h )

	}               
}
