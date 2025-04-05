//  find the factorial of n  

package recursion;
import java.util.Scanner ;
public class basic_of_recursion {
	public static int fact(int n) {
		if(n==1) return 1 ;
		int ans = n * fact(n-1);
		return ans ;
//		return (n*fact(n)) ;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in) ;
		System.out.print("enter a no ") ;
		int no = sc.nextInt();
		int factorial = fact(no);
		System.out.println("factorial of "+ no +" is "+factorial);
	}

}
