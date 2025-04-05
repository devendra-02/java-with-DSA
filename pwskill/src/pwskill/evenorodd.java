package pwskill;
import java.util.Scanner;
public class evenorodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a no");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
//		System.out.println("even no are ");
//		for(int j=2;j<=n;j++) {
//			if(j%2==0) {
//				System.out.print(" "+j);
//			}	
//		}
//		
//		System.out.println("\nodd no are ");
//		for(int d=1;d<=n;d++) {
//			if(d%2==0) {
////				System.out.print(" ");
//		}
//			else
//			System.out.print(" "+d);
//		}	
//		           or 
		
		
		System.out.println("even no are ");
		for(int j=2;j<=n;j+=2) {
				System.out.print(" "+j);
		}
		
		System.out.println("\nodd no are ");
		for(int d=1;d<=n;d+=2) {
			System.out.print(" "+d);
		}
		
		
	}

}
