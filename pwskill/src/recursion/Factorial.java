package recursion;
import java.util.Scanner ;
public class Factorial {

	public static int  factorial(int n) {
		if(n==1) {
			return 1 ;}
		n = (n * factorial(n-1));
		
		return n ;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("enter a no ");
		Scanner sc = new Scanner(System.in) ;
		int n = sc.nextInt();
		 factorial(n);
		 System.out.println(factorial(n));
	}

}
