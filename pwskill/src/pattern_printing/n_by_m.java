package pattern_printing;
import java.util.Scanner;
public class n_by_m {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
//		System.out.println("enter a no of rows ");
//		int r =sc.nextInt();
		System.out.println("enter a no of columns ");
		int n =sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			int cou = i;
			for(int j=1;j<=i;j++) {
				System.out.print(cou);
				cou = cou-1 ;
			}	
			System.out.println();
		}
	}

}
