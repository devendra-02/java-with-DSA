package pwskill;
import java.util.Scanner ;
public class absolutevalue {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		
//		if(n<0) {
//			n=n*(-1);
//			System.out.println( n );
//		}                                   or
		
		if(n<0) {System.out.println( -n );
		}
		else {
			System.out.println( n );
		}

	}

}
