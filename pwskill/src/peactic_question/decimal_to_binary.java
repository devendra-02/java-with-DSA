package peactic_question;
import java.util.Scanner;
public class decimal_to_binary {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in) ;
		System.out.println("enter the no");
		int n = sc.nextInt();
		
		String ans = " ";
		
		while(n>0) {
			int r = n%2 ;
			n = n/2 ;
			ans = r+ans ;
		}
		System.out.println(ans);

	}

}
