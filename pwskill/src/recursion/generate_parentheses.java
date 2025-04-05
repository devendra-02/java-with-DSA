package recursion;

import java.util.ArrayList;


public class generate_parentheses {

	static ArrayList<String> ans ;
	public static void gnrtparentheses(String s, int open , int close ,int n) {
		int m = s.length();
		if(m == 2*n) {
			ans.add(s) ;
			return ;
		}
		
		if(m==0 || open==close) {          //1         //  niche ke tino if else ka order same hona chahiye
			gnrtparentheses(s+"(", open+1, close, n);       // bs 1st or second ka upr  niche ho skta h
		}
		else if(open==n) {                 //2
			gnrtparentheses(s+")", open, close+1, n);
		}
		else if(open>close) {              //3
			gnrtparentheses(s+"(", open+1, close, n);
			gnrtparentheses(s+")", open, close+1, n);
		}
		
//	             OR 
		
//		if(open<n) gnrtparentheses(ans+'(', open+1, close, n);
//		if(close<open) gnrtparentheses(ans+')', open, close+1, n);
		
	}
	public static void main(String[] args) {
		int n = 3 ;
		ans = new ArrayList<String>() ;
		gnrtparentheses("",0,0,n);
		System.out.println(ans);
	}

}
