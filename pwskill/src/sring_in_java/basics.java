package sring_in_java;
import java.util.Scanner;
public class basics {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		String x = "devendra gautam" ;
		System.out.println(x);
		System.out.println("eneter your name ");
		
		String s  = sc.next() ;  // for single word input 
	//	String s = sc.nextLine() ;  //for a line input 
		System.out.print( "hy ");
		System.out.println(s);
		
		//    .charAt(x)  to print perticular index of string
		//  .length() for find rhe length
		
		System.out.println("enter index is "+x.charAt(0));
		System.out.println("length of string is "+x.length());
			
	}

}
