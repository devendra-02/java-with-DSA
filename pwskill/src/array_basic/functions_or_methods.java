package array_basic;
import java.util.Scanner;
public class functions_or_methods {

//	public static int product(int a,int b) {
//		int product = a*b ;
//		return product ;
//	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter a");
//		int a = sc.nextInt();
//		System.out.println("enter b");
//		int b = sc.nextInt();
//		int multiple = product(a, b);
//		
//		System.out.println("multiple of a and b "+multiple);

	
	public static void printfactorial(int n) {
	int factorial = 1 ;
	for(int i=n;i>=1;i--) {
		factorial = factorial*i;
	}
	System.out.println("factorial is "+factorial);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a no ");
		int n = sc.nextInt();
	printfactorial(n);	
	}

}
