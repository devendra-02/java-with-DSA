package stake;

import java.util.Stack;

public class postfix_operation {

	public static void main(String[] args) {
		String postfix = "842-/73*+";
		System.out.println("postfix : "+postfix);
		int n = postfix.length();
		
		Stack<Integer> val = new Stack<Integer>();
		
		for(int i=0;i<n;i++) {
			char ch = postfix.charAt(i);
			
			if(Character.isDigit(ch)) { 
				int count = ch -'0';
				val.push(count) ;
			}
			else {
				int v2 = val.pop();         //if loop move from 0 to n-1
				int v1 = val.pop();         // then 1st value is v2 and 2nd is v1
				if(ch=='+') val.push(v1+v2) ;
				if(ch=='-') val.push(v1-v2) ;
				if(ch=='*') val.push(v1*v2) ;
				if(ch=='/') val.push(v1/v2) ;
			}
		}
		System.out.println("answer  : "+val.pop());
	}

}
