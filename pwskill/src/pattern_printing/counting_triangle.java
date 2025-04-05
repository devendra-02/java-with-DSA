package pattern_printing;
import java.util.Scanner;
public class counting_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		print the pattern upto n rows 
//		1
//		2 3
//		4 5 6
//		7 8 9 10.....
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a no of columns ");
		int c = sc.nextInt();
		int a = 1;
		for(int i=1;i<=c;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(a+" ");
				a=a+1 ;
			}
			System.out.println();
		}
	}

}
