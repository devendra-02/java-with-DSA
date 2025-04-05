package pwskill;
import java.util.Scanner;
public class ascaiivalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter\tcharacter: ");

		char ch = sc.next().charAt(0);

		int x = (int)ch;

		System.out.println(x);

	}

}
