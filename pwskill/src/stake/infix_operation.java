package stake;

import java.util.Stack;
public class infix_operation {

	public static void main(String[] args) {
		String s = "9-(5+3)*4/6";
		int k = 9-(5+3)*4/6 ;
		System.out.println("dsjfhkah "+k);
		int n = s.length();
		Stack<Integer> val = new Stack<Integer>();
		Stack<Character> op = new Stack<Character>();
		
		for(int i=0;i<n;i++) {
			char ch = s.charAt(i);
			
			if(Character.isDigit(ch)) { 
				int count = ch -'0';
				val.push(count) ;
			}
			
			else if(op.isEmpty() || ch=='(' || op.peek()=='(') {
				op.push(ch) ;
			}
			
			else if(ch==')') {
				while(op.peek()!='(') {
					int v2 = val.pop();
					int v1 = val.pop();
					if(op.peek()=='+') val.push(v1+v2) ;
					if(op.peek()=='-') val.push(v1-v2) ;
					if(op.peek()=='*') val.push(v1*v2) ;
					if(op.peek()=='/') val.push(v1/v2) ;
					op.pop() ;  
				}
				op.pop();
			}
			
			else {
				if(ch=='+' || ch=='-') {
					int v2 = val.pop();
					int v1 = val.pop();
					if(op.peek()=='+') val.push(v1+v2) ;
					if(op.peek()=='-') val.push(v1-v2) ;
					if(op.peek()=='*') val.push(v1*v2) ;
					if(op.peek()=='/') val.push(v1/v2) ;
					op.pop() ;  
					op.push(ch) ;     // first we pop the top operator then we push the operator
				}
				if(ch=='*' || ch=='/') {
					if(op.peek()=='+' || op.peek()=='-') {
						op.push(ch);
					}
					else {
						int v2 = val.pop();
						int v1 = val.pop();
						if(op.peek()=='*') val.push(v1*v2) ;
						if(op.peek()=='/') val.push(v1/v2) ;
						op.pop() ;  
						op.push(ch) ;
					}
				}
			}
		}
		// perform remaining operations of stack
		while(val.size()>1) {
			int v2 = val.pop();
			int v1 = val.pop();
			if(op.peek()=='+') val.push(v1+v2) ;
			if(op.peek()=='-') val.push(v1-v2) ;
			if(op.peek()=='*') val.push(v1*v2) ;
			if(op.peek()=='/') val.push(v1/v2) ;
			op.pop() ;  
		}
		
		System.out.println("output is : "+val.peek());
	}

	
}
