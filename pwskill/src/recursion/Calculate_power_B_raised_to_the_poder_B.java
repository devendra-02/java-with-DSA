//package recursion;
//import java.util.Scanner; 
//public class Calculate_power_B_raised_to_the_poder_B {
//
//	public static int power(int a , int b) {              // time complecity 0(b)//
//		if(b==0) return 1 ;
//		int ans = (a) * (power(a ,b-1));
//		return ans ;
//	}
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter a base ");
//		int a = sc.nextInt();   // kuch ni a ki pawer b calculate krna h
//		System.out.println("enter power ");
//		int b = sc.nextInt();
//		System.out.println("soluation "+power(a ,b));
//	}
//
//}

//*************************** LOGRITHMIC ( means 2power10 = 2power5 * 2power5 ) ***********************************************************************************

package recursion;
import java.util.Scanner; 
public class Calculate_power_B_raised_to_the_poder_B {

	public static int power(int a , int b) {          // time complecity 0(logb)
		if(b==0) return 1 ;
		int ans = power(a ,b/2) ;
		if(b%2==0) {
			return ans* ans;
		}
		else {
			return ans* ans* a ;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a base ");
		int a = sc.nextInt();   // kuch ni a ki pawer b calculate krna h
		System.out.println("enter power ");
		int b = sc.nextInt();
		int soluation = 1;
		if(b%2==0) {
			soluation = power(a ,b/2) ;
			soluation = soluation * soluation ;
		}
		else {
			soluation = power(a ,b/2) ;
			soluation = soluation * soluation * a ;
		}
		
		
		System.out.println("soluation "+soluation);
	}

}