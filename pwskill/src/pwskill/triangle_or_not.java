package pwskill;
import java.util.Scanner;
public class triangle_or_not {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("enter  a side a ");
	int a = sc.nextInt();
	System.out.print("enter  b side a ");
	int b = sc.nextInt();
	System.out.print("enter  c side a ");
	int c = sc.nextInt();
	
	if((a+b)>c && (b+c)>a && (c+a)>b )
		System.out.println("Valid triangle" );
	else {
		System.out.println("Not valid tringle sides");
	}
}
}
