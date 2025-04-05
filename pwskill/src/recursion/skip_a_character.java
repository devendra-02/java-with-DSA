package recursion;

public class skip_a_character {

//	public static void skipalpha(int i, String s) {
//		if(i==s.length()) {
//			return ;                          // in this we can not use a extra string 
//		}
//		if(s.charAt(i)!='a') System.out.print(" "+s.charAt(i));
//		skipalpha(i+1,s);
//	}
	
	public static void skipalpha(int i, String s , String ans ) {  // use for skip the alphabets
		if(i==s.length()) {
			System.out.println(ans);
			return ;                                // we use an extra string 
		}
		if(s.charAt(i)!='a') System.out.print(" "+s.charAt(i));
		skipalpha(i+1,s,ans);
	}
	
	public static void print(int i, String s) {   // for string printing 
		if(i==s.length()) return ;
		System.out.print(" "+s.charAt(i));
		print(i+1,s);
	}
	public static void main(String[] args) {
		String s = "devendra gautm" ;
		print(0,s) ;
		System.out.println("\n after skip the alphabets a");
//		skipalpha(0,s) ;
		
		skipalpha(0,s,"") ;  // if we use an extra string so we pas a space
	}

}
