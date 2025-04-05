package pwskill;
import java.util.Scanner;
public class greatestsmsng3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a three nums");
		int l = sc.nextInt();
		int m = sc.nextInt();
		int n = sc.nextInt();
		System.out.println("largest no is ");
		if(m>=n && m>=l)
			System.out.println( m );
		else if(n>=m && n>=l)
			System.out.println( n );
//		else(m>=l && n>=l) {System.out.println( l )};
		else 
			System.out.println(l);
		}

}
