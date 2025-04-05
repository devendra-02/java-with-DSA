package stake;

import java.util.Stack;

public class infix_to_prefix {

	public static void main(String[] args) {
		String infix = "8/(4-2)+7*3";
		System.out.println("infix : "+infix);
		int n = infix.length();
		
		Stack<String> val = new Stack<String>();
		Stack<Character> op = new Stack<Character>();
		
		for(int i=0;i<n;i++) {
			char ch = infix.charAt(i);
			
			if(Character.isDigit(ch)) { 
				String s = ""+ch ;
				val.push(s);
			}
			
			else if(op.isEmpty() || ch=='(' || op.peek()=='(') {
				op.push(ch) ;
			}
			
			else if(ch==')') {
				while(op.peek()!='(') {
					String v2 = val.pop();
					String v1 = val.pop();
					char o = op.pop() ;  
					String s = o+v1+v2 ;
					val.push(s);
				}
				op.pop();
			}
			
			else {
				if(ch=='+' || ch=='-') {
					String v2 = val.pop();
					String v1 = val.pop();
					char o = op.pop() ;  
					String s = o+v1+v2 ;
					val.push(s);  
					// push
					op.push(ch) ;     // first we pop the top operator then we push the operator
				}
				if(ch=='*' || ch=='/') {
					if(op.peek()=='+' || op.peek()=='-') {
						op.push(ch);
					}
					else {
						String v2 = val.pop();
						String v1 = val.pop();
						char o = op.pop() ;  
						String s = o+v1+v2 ;
						val.push(s); 
						// push
						op.push(ch) ;
					}
				}
			}
		}
		// perform remaining operations of stack
		while(val.size()>1) {
			String v2 = val.pop();
			String v1 = val.pop();
			char o = op.pop() ;  
			String s = o+v1+v2 ;
			val.push(s); 
		}
		String prifix = val.pop();
		System.out.println("prifix : "+prifix);
	}

}
