/*find a no ways to reach nth stair if hmm sidha 1 stair pe jaye ya har dusri 
 * link - https://photos.app.goo.gl/Y2BL9Zv6QuqrCxz67 */

//package recursion;
//import java.util.Scanner ;
//public class stair_path {
//	
////     index - 0 1 2 3 4 5 6 7  8  
//// series is - 0 1 2 3 5 8 13 21
//	
//	public static int stair(int n) {    // fibonacci series
//		if(n==0 || n==1) return n ;
//		int ans = stair(n-1)+stair(n-2) ;
//		return ans ;
//	}
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("enter a no ");
//		int n = sc.nextInt();
//		if(n==0) System.out.println("no of ways are "+stair(n));
//		else System.out.println("no of ways are "+stair(n+1));
//	}
//
//}

//*************************************************************************************************************


package recursion;
import java.util.Scanner ;
public class stair_path {
	
//     index - 0 1 2 3 4 5 6  7   
// series is - 0 1 2 3 5 8 13 21
	
	public static int stair(int n) {    // fibonacci series
		if(n<=2) return n ;
		int ans = stair(n-1)+stair(n-2) ;   // agr yha question me 1 or 2 ki jgh 1 or 3 hata to (n-1) OR (n-3) ho jata 
		return ans ;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a no ");
		int n = sc.nextInt();
		System.out.println("no of ways are "+stair(n));
	}
}