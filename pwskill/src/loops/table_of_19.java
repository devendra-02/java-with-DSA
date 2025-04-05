package loops;
import java.util.Scanner;
public class table_of_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		System.out.print("enter a number ");
		int n = sc.nextInt();
		int m = n*10;
		
//		for(int i=1;i<=m;i++) {               // isme loop n*10 times chlega 
//			if(i%n==0)
//			System.out.println( i );
//		}
		
//		           or
		
		for(int i=n;i<=m;i+=n) {       //  isme loop 10 times hi chlega  
			System.out.println( i );
		}
		
		
		
	}

}
