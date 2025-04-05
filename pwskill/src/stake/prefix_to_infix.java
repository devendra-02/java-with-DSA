package stake;

import java.util.Stack;

public class prefix_to_infix {

	public static void main(String[] args) {
		String prefix = "-9/*+5346";
		
		System.out.println("prefix  : "+prefix);
		int n = prefix.length();
		
		Stack<String> val = new Stack<String>();
		
		for(int i=n-1;i>=0;i--) {     // hear is the is the change 
			char ch = prefix.charAt(i);
			
			if(Character.isDigit(ch)) { 
				String s = "" + ch ;
				val.push(s);
			}
			else {
				String v1 = val.pop();           // if loop move from n-1 to 0
				String v2 = val.pop();           // then 1st value is v1 and 2nd is v2
				String s =  v1 + ch + v2 ;
				val.push(s) ;
			}
		}
		System.out.println("infix   : "+val.pop());
	}

}
