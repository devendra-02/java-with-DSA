package stake;

import java.util.Stack;

public class largest_rectangle_in_histogram_84 {

	public static int largestrectangle(int[] heights) {
		int n = heights.length ;
		Stack<Integer> st = new Stack<Integer>();
		
		int[] LGE = new int[n] ;
		int[] RGE = new int[n] ;
		
		for(int i=0;i<n;i++) {
			while(!st.isEmpty() && heights[st.peek()]>=heights[i]) {
				st.pop() ;
			}
			if(st.empty())  LGE[i] = 0 ;
			else LGE[i] = st.peek()+1 ;
			
			st.push(i);
		}
		
		while(!st.empty()) st.pop();
		
		for(int i=n-1;i>=0;i--) {
			while(!st.isEmpty() && heights[st.peek()]>=heights[i]) {
				st.pop() ;
			}
			if(st.empty())  RGE[i] = n-1 ;
			else RGE[i] = st.peek()-1 ;
			
			st.push(i);
		}
		int max = 0 ;
		for(int i=0;i<n;i++) {
			max = Math.max(max,heights[i]*(RGE[i]-LGE[i]+1));
		}
		return max ;
	}
	public static void main(String[] args) {
		int[] hight = {2,1,5,6,2,3} ;
		int ans = largestrectangle(hight) ;
		System.out.println("largest element is "+ans);
	}
}
