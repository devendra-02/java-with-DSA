//package recursion;
//import java.util.Scanner;
//public class print_1_to_n {
//	public static void accending(int n) {
//		
//		if(n==12) return ;          // isme no menualy dena hoga
//		System.out.print(n+" ");
//		accending(n+1);
//	}
//	public static void main(String[] args) {
//		accending(1);
//	}
//}

//*************************************************************************************************************************************************

//package recursion;
//import java.util.Scanner;
//public class print_1_to_n {
//	
//	static int n ;   // hear t is a global variable jise sb function access kr sakte h 
//	public static void accending(int x) {
//		if(x>n) return ;
//		System.out.print(x+" ");
//		accending(x+1);
//	}
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in) ;
//		System.out.print("enter a no ");
//		n = sc.nextInt();
//		accending(1);
//	}
//}

//*************************************************************************************************************************************************

package recursion;
import java.util.Scanner;
public class print_1_to_n {
	
	public static void accending(int x , int n) {    
		if(x>n) return ;
		System.out.print(x+" ");
		accending(x+1 , n);     // or yha bhi bar bar call krna padega 
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		System.out.print("enter a no ");
		int n = sc.nextInt();
		accending(0 , n);         // hear we use extra parameter 
	}
}

