package pwskill;

import java.util.Scanner;

public class switch_operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);  
		
		int a = sc.nextInt();
		int ch = sc.next().charAt(0);
		int b = sc.nextInt();

//		if(ch == '+')System.out.println(a+b);
//		if(ch == '-')System.out.println(a-b);
//		if(ch == '*')System.out.println(a*b);
//		if(ch == '/')System.out.println(a/b);
		
//		               using switch case 
		
		switch(ch) {
		case'+':
			System.out.println(a+b);
			break ;
		case'-':
			System.out.println(a-b);
			break ;
		case'*':
			System.out.println(a*b);
			break ;
		case'/':
			System.out.println(a/b);
			break ;
			default:
				System.out.println("not a valid operaor");
		}
	}

}
