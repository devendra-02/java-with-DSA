package conditions;
import java.util.Scanner;
public class even_or_odd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a no ");
		int n = sc.nextInt();
		
		if(n%2==0) {
			System.out.println("even no");
		}else {
			System.out.println("odd no");
		}
		sc.close();
	}

}
