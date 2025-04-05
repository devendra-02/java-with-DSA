//package sring_in_java;
//
//import java.util.Arrays;
//
//public class short_array {
//
//	public static void main(String[] args) {
//		
//		String s = "devendra";
//		char[] ch = s.toCharArray();   // string as a array store hui h 
//		for(char ele : ch) {
//			System.out.print(ele);
//		}
//		System.out.println();
//		Arrays.sort(ch);
//		for(char ele : ch) {
//			System.out.print(ele);
//		}
//	}
//
//}


//    for the string builder 

package sring_in_java;

import java.util.Arrays;

public class short_array {

	public static void main(String[] args) {
		
		StringBuilder s = new StringBuilder("gautam") ;
		String st = s.toString() ;    // string builder ko string me convert kr diya 
		char[] ch = st.toCharArray();   // string as a array store hui h 
		for(char ele : ch) {
			System.out.print(ele);
		}
		System.out.println();
		Arrays.sort(ch);
		for(char ele : ch) {
			System.out.print(ele);
		}
	}

}

