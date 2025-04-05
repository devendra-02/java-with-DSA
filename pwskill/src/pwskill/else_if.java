package pwskill;
import java.util.Scanner ;
public class else_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the marks: ");
		int n = sc.nextInt();

		
//		if(n>=81) System.out.println("Very Good");
//		if(n>=61 && n<=80)
//		System.out.println("Good");
//		if(n>=41 && n<=60)
//		System.out.println("Average");
//		if(n<=40) System.out.println("Fail");

		
//                                   using if else 
		
		
		if(n>=81) System.out.println("Very Good");
		else if(n>=61) System.out.println("Good");
		else if (n>=41) System.out.println("Average");
		else System.out.println("Fail");
		
		
	}

}
