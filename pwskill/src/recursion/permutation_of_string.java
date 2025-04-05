package recursion;

public class permutation_of_string {

	public static void permutation(String ans, String s) {
		if(s.length()==0) {
			System.out.println(ans);
			return ;
		}
		for(int i=0;i<s.length();i++) {
			char ch =  s.charAt(i) ;
			String left = s.substring(0, i) ;   // hear 0 to i means 0 to i-1 
			String right = s.substring(i+1) ;
			permutation(ans+ch,left+right);
		}
		
	}
	public static void main(String[] args) {
		  String s =  "abcd" ;
		  permutation("",s);

	}

}
