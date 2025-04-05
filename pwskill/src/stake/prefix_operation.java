package stake;

import java.util.Stack;

public class prefix_operation {

	public static void main(String[] args) {
		String prefix = "-9/*+5346";
		
		System.out.println("prefix  : "+prefix);
		int n = prefix.length();
		
		Stack<Integer> val = new Stack<Integer>();
		
		for(int i=n-1;i>=0;i--) {     // if loop move from n-1 to 0 
			char ch = prefix.charAt(i);
			
			if(Character.isDigit(ch)) { 
				int count = ch -'0';
				val.push(count) ;
			}
			else {
				int v1 = val.pop();           // if loop move from n-1 to 0
				int v2 = val.pop();           // then 1st value is v1 and 2nd is v2
				if(ch=='+') val.push(v1+v2) ;
				if(ch=='-') val.push(v1-v2) ;
				if(ch=='*') val.push(v1*v2) ;
				if(ch=='/') val.push(v1/v2) ;
			}
		}
		System.out.println("answer : "+val.pop());
	}

}
