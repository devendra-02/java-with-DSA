package stake;

import java.util.Stack;

public class postfix_to_prifix {

	public static void main(String[] args) {
		String postfix = "953+4*6/-";
		
		System.out.println("postfix  : "+postfix);
		int n = postfix.length();
		
		Stack<String> val = new Stack<String>();
		
		for(int i=0;i<n;i++) {     // hear is the is the change 
			char ch = postfix.charAt(i);
			
			if(Character.isDigit(ch)) { 
				String s = "" + ch ;
				val.push(s);
			}
			else {
				String v2 = val.pop();          //if loop move from 0 to n-1 
				String v1 = val.pop();          // then 1st value is v2 and 2nd is v1
				String s = ch + v1 + v2 ;
				val.push(s) ;
			}
		}
		System.out.println("answer : "+val.pop());
	}

}
