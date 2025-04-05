package stake;

import java.util.Stack;

public class remove_all_adjacent_duplicate {
	
	public static String removeDuplicates(String s) {
		
		int n = s.length() ;
		Stack<Character> st = new Stack<Character>();
		
		for(int i=0;i<n;i++) {
			char ch = s.charAt(i) ;
			
			if(st.isEmpty()) {
				st.push(ch) ;
			}
			
			else if(ch==st.peek()) {
				st.pop() ;
			}
			else {
				st.push(ch);
			}
		}
		StringBuilder result = new StringBuilder();
        for (char ch : st) {
            result.append(ch);
        }
	    return result.toString() ;
	}
	public static void main(String[] args) {
		String s = "abbaca" ;
		System.out.println("before : "+s);
		System.out.println("after  : "+removeDuplicates(s));
	}
}
