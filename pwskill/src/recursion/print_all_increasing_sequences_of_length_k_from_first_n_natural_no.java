package recursion;

public class print_all_increasing_sequences_of_length_k_from_first_n_natural_no {

		public static void subset(int i, String s,String ans) {
			if(ans.length()==4 || i==s.length()) {   
				if(ans.length()==4) {        // ensure that the length of string is 4 or not 
				System.out.println(ans);}
				return ;
			}
			char ch = s.charAt(i);
			subset(i+1, s, ans+ch); // take 
			subset(i+1, s, ans);  //not take
		}
		public static void main(String[] args) {
			String s = "123456" ;
			subset(0,s,"") ;      // we share the index , string and empty string
		}

	}
	