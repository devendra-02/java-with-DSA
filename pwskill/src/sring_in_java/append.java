package sring_in_java;

public class append {

	public static void main(String[] args) {
		// append is use for add two things only use in stringbuilder 
		
		StringBuilder s = new StringBuilder("ab") ;
		System.out.println(s);
		s.append(56);
		System.out.println(s);
		s.append("*");
		System.out.println(s);
		s.append("fjidfjfi") ;
		System.out.println(s);
		char[] ch = {'f','f','s','s'};
		s.append(ch);
		System.out.println(s);
//		     int[] arr = {3,3,2,2,1};
//		     s.append(arr);     // not work address print hora h 
//		     System.out.println(s);
		StringBuilder t = new StringBuilder("abdfd") ;
		s.append(t);
		System.out.println(s);
	
	// s += "SDGDFG"           not possible ye bs string me hota h 
		}

}
