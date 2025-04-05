//package recursion;
//import java.util.Scanner;
//public class print_n_to_1 {
//
//	
//	
//	public static void deccending(int n) {  
//		if(n>0)
//		{System.out.print(n+" ");
//		deccending(n-1); }
//		}
//	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("enter the no ");
//		int no = sc.nextInt();
//		deccending(no) ;
//		
//	}
//
//}

//*******************************accending & dccending & factorial sath me ************************

package recursion;
import java.util.Scanner;
public class print_n_to_1 {

	static int no ;   // yha no global h jise sb function access kr sakte h sbke liye same h 
	public static void deccending(int n) {  
		if(n>0)
		{System.out.print(n+" ");
		deccending(n-1); }
		}
	
	public static void accending(int x) {
		if(x>no) return ;
		System.out.print(x+" ");
		accending(x+1);
	}
	
	public static int fact(int n) {
		if(n==1) return 1 ;
		int ans = n * fact(n-1);
		return ans ;
//		return (n*fact(n)) ;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the no ");
		no = sc.nextInt();
		
		System.out.println("decending ");
		deccending(no) ;
		
		System.out.println("\n accending ");
		accending(1);
		
		int factorial = fact(no);
		System.out.println("\n factorial of "+ no +" is \n"+factorial);
	}

}
