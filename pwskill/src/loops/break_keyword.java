package loops;
import java.util.Scanner ;
public class break_keyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a no ");
		int n =sc.nextInt();
		int x = 0 ; //at 0 x is prime no 
		
		
		for(int i=2;i<=n-1;i++) {
			if(n%i==0) {
				System.out.println("composit no");
				x = 1 ;
				break ;}   
			}
		if(n==1)System.out.println("nither prime nor composit");
		else if(x==0) System.out.println("prime no ");

}
}