package sring_in_java;
import java.util.Scanner ;
public class stringbuilder {

	public static void main(String[] args) {
		
// use to add strings in km time me it a better way to add or ve can say that is good to add
		
		Scanner sc = new Scanner(System.in) ;
		StringBuilder st = new StringBuilder("asdfghjk") ;
				System.out.println(st);
				System.out.println(st.reverse());
				
				//  inpput 
				
				StringBuilder s = new StringBuilder(sc.nextLine()) ;
				System.out.println(s);
				//         or
				
				String t = sc.nextLine() ;
				StringBuilder j = new StringBuilder(t) ;
				System.out.println(j);
				
				//    setCharAt()  -  use to change string 
				j.setCharAt(2,'r');
				System.out.println(j);
	}

}
