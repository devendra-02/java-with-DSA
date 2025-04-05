// means input n digits ki vo bineary likhni h jime 1sath do one(1) na aaye

package recursion;
import java.util.Scanner ;
public class grnerate_all_string_without_consecutive_1s {

	public static void printstring(String ans , int n) {
		int m = ans.length();
		if(m==n){
			System.out.println(ans);
			return ;
		}
		
//		printstring(ans+1, n);  // for all combinations 
//		printstring(ans+0, n);  
		
		if(m==0 || ans.charAt(m-1)=='0') {      // jisme 1 sath do one ni aare
			printstring(ans+1, n);
			printstring(ans+0, n);
		}
		else
			printstring(ans+0, n);
		
//		if(m==0 || ans.charAt(m-1)=='1') {      // jisme 1 sath do zero ni aare
//			printstring(ans+0, n);
//			printstring(ans+1, n);
//		}
//		else
//			printstring(ans+1, n);
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a no ");
		int n = sc.nextInt();
		printstring("", n);
	}

}
