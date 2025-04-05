//package recursion;
//import java.util.Scanner;
//public class sum_of_1_to_n {
//
//	public static int sum = 0;
//	public static int calculatesum(int n) {  
//		if(n>0)
//		{sum=sum+n;;
//		calculatesum(n-1); }
//		return sum ;
//		}
//	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("enter the no ");
//		int no = sc.nextInt();
//		
//		System.out.println("sum of no is "+calculatesum(no));
//	}
//}

//********************** return type ( mean it return a value in the end )************** 
package recursion;
import java.util.Scanner;
public class sum_of_1_to_n {

	public static int fact(int n) {
		if(n==1) return 1 ;
		int ans = n + fact(n-1);
		return ans ;            // hear it return the value  

	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the no ");
		int no = sc.nextInt();
		
		int factorial = fact(no);
		System.out.println("\n sum of "+ no +" term is \n"+factorial);
	}
}

// *********** Parameterized form (maatalab koi value return nhi kr ra h )*****************************************

//package recursion;
//import java.util.Scanner;
//public class sum_of_1_to_n {
//
//	public static void sum(int n , int s) { 
//		if(n==0) {System.out.println("sum is "+s);
//		return ;}
//		sum(n-1 , s+n);
//	}
//	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("enter the no ");
//		int no = sc.nextInt();
//	    sum(no,0);
//	}
//}