package stake;

import java.util.Arrays;
import java.util.Stack;

public class Number_of_Visible_People_1944 {

	public static int[] canSeePersonsCount(int[] height){
		int n =  height.length ;
		int[] ans = new int[n];
		Stack<Integer> st = new Stack<Integer>();
		
		for(int i=n-1;i>=0;i--) {
			int count = 0 ;
			while(!st.isEmpty() && height[st.peek()]<height[i]) {
				st.pop();
				count++ ;
			}
			if(!st.isEmpty()) count++ ;
			
			ans[i] = count ;
			st.push(i) ;
		}
		return ans ;
	}
	public static void main(String[] args) {
		int[] heights = {10,6,8,5,11,9} ;
		int[] ans = canSeePersonsCount(heights) ;
		System.out.println(Arrays.toString(ans));
	}

}
