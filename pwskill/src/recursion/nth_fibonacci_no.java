package recursion;
import java.util.Scanner; 
public class nth_fibonacci_no {
	//     index - 0 1 2 3 4 5 6 7  8  
    // series is - 0 1 1 2 3 5 8 13 21
	public static int n ;
	public static int fibonacci(int n) {
		if(n==0 || n==1) return n ;
		int ans= fibonacci(n-1) + fibonacci(n-2) ;   // isme pehle n-1 pura solve hota h fir n-2 hoga
		return ans ;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		System.out.print("enter a no ");
		n = sc.nextInt();
		int ans = fibonacci(n);
		System.out.println("answer "+ans);
	}

}
