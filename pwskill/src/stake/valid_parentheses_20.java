package stake;

import java.util.Stack;

public class valid_parentheses_20 {

	public static boolean isValid(String s) {
		int n = s.length() ;
		Stack<Character> st = new Stack<Character>();
		
		for(int i=0;i<n;i++) {
			char ch = s.charAt(i) ;
			
			if(ch == '(' || ch == '{' || ch == '[') {
				st.push(ch) ;
			}
			
			else {
				if(st.isEmpty()) return false;
				
				char top = st.peek();
				if((ch == ')' && top == '(') || 
				   (ch == '}' && top == '{') || 
				   (ch == ']' && top == '[')) {
					st.pop();
				} 
				else {
					return false;  // this is for s = "{[)]}"
				}
			}
		}
       return st.isEmpty() ; 
    }
	public static void main(String[] args) {
		
		String s = "()[]{}" ;
		boolean check = isValid(s) ;
		if(check==true) System.out.println("Valid parentheses ");
		else System.out.println("inValid parentheses ");
		
	}

}
