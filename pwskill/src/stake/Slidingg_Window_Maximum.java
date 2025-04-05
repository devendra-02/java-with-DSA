package stake;
import java.util.*;
public class Slidingg_Window_Maximum {

	public static int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length ;
        int[] ans = new int[n-k+1];
        int z = 0 ;
        
        Stack<Integer> st =  new Stack<Integer>();
        int[] nge = new int[n];     // next greater element 
        st.push(n-1);
        nge[n-1] = n ;
        
        for(int i=n-2;i>=0;i--) {          // calculating the next greater element 
        	while(st.size()>0 && nums[i]>nums[st.peek()]) st.pop() ;
        	if(st.size()==0) nge[i] = n ;
        	else nge[i] = st.peek();
        	st.push(i);
        }
        int j = 0 ;
        for(int i=0;i<n-k+1;i++) {
        	if(j>=i+k) {
                j = i ;
            }    
        	int max = nums[j];
        	while(j<i+k) {
        		max = nums[j];
        		j = nge[j];
        	}
        	ans[z++] = max ;
        }
        return ans ;
    }
	public static void main(String[] args) {
		int[] nums = {1,3,-1,-3,5,3,6,7};
		for(int ele : nums) {
			System.out.print(ele+" ");
		}System.out.println();
		int k = 3 ;
		int[] ans = maxSlidingWindow(nums, k);
		for(int ele : ans) {
			System.out.print(ele+" ");
		}
	}

}
