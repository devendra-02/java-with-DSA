package loops;
import java.util.Scanner ;
public class count_no_of_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number ");
		long n = sc.nextLong();
		long count = 0 ;
		
//		for(;n!=0;n=n/10) {
//			count = count+1; 
//		}
		
		while(n!=0) {
			n=n/10;
			count = count+1; 
		}
		
		
		System.out.println("no of digits are "+ count);
		}

}
