//package recursion;
//
//public class print_subsets {
//
//	public static void subset(int i, String s,String ans) {
//		if(i==s.length()) {
//			System.out.println(ans);
//			return ;
//		}
//		char ch = s.charAt(i);
//		subset(i+1, s, ans+ch); // take 
//		subset(i+1, s, ans);  //not take
//	}
//	public static void main(String[] args) {
//		String s = "abc" ;
//		subset(0,s,"") ;      // we share the index , string and empty string
//	}
//
//}


//**********************************( using extra array list )************************************************************************

//package recursion;
//
//import java.util.ArrayList;
//
//public class print_subsets {
//
//	public static ArrayList<String> arr = new ArrayList<String>() ;   // using extra array list 
//	public static void subset(int i, String s,String ans) {
//		if(i==s.length()) {
//			arr.add(ans);
//			return ;
//		}
//		char ch = s.charAt(i);
//		subset(i+1, s, ans+ch); // take 
//		subset(i+1, s, ans);  //not take
//	}
//	public static void main(String[] args) {
//		String s = "abcd" ;
//		arr = new ArrayList<String>();  // reset krne ke liye
//		subset(0,s,"") ;      // we share the index , string and empty string
//		System.out.println(arr);
//	}
//
//}
