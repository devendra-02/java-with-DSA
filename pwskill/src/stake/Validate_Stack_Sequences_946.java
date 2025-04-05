package stake;

import java.util.Stack;

public class Validate_Stack_Sequences_946 {

	public static boolean validateStackSequences(int[] pushed, int[] popped) {
		Stack<Integer> st = new Stack<Integer>();
		int j=0;
		
		for(int num : pushed) {
			st.push(num) ;
			while(!st.isEmpty() && st.peek()==popped[j]) {
				st.pop();
				j++ ;
			}
		}
		return st.isEmpty();
	}
	public static void main(String[] args) {
		int[] pushed = {1,2,3,4,5} ;
		int[] popped = {4,5,3,2,1} ;
		boolean ans = validateStackSequences(pushed, popped);
		
		if(ans==true) System.out.println("valid sequence ");
		else System.out.println("invalid sequence ");
	}

}
