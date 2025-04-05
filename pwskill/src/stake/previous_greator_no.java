package stake;

import java.util.Stack;
import java.util.Arrays;

public class previous_greator_no {

	public static int[] firstpreviousgreaterelement(int[] arr) {
		int n = arr.length ;
		int ans[] = new int[n];
		Stack<Integer> st = new Stack<>();
		for(int i=0;i<n;i++) {
			
			while(!st.empty() && st.peek()<=arr[i]) {
				st.pop();
			}
			
			if(st.empty()) {
				ans[i] = -1 ;
			}else {
				ans[i] = st.peek() ;
			}
			st.push(arr[i]);
		}
		return ans ;
	}
	public static void main(String[] args) {
		int[] arr = {10,4,2,20,40,12,30};
		int[] ans = firstpreviousgreaterelement(arr);
		System.out.println(Arrays.toString(ans));
	}

}
