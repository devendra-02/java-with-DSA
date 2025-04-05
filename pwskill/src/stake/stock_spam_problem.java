/*  Stock Span Problem ka matlab ye hai ki humein har din ke stock price ke liye
yeh dekhna hai ki us din se pehle kitne consecutive (lagataar) din aise hain jisme 
stock price chhota ya barabar tha us din ke price ke.   
int[] arr = {10,4,5,90,120,80};
int[] ans = {1, 1, 2, 4, 5, 1};  */

package stake;
import java.util.Arrays;
import java.util.Stack;
public class stock_spam_problem {

//	USING FOR LOOP

//	public static int[] spamproblem(int[] price) {
//		int n = arr.length ;
//		int[] ans = new int[n];
//		ans[0]=1 ;                              // time complexity (n)²
//		for(int i=1;i<n;i++) {
//			ans[i]=1;
//			for(int j=i-1;j>=0 && price[i]>=price[j] ;j--) {
//				ans[i]++;
//			}  }
//		return ans ;
//	}
	
//	USING STACK
	
	public static int[] spamproblem(int[] price) {
		int n = price.length ;
		int[] ans = new int[n];                           
		Stack<Integer> st = new Stack<Integer>();   
		for(int i=0;i<n;i++) {                             // time complexity (n)
			while(!st.isEmpty() && price[st.peek()]<=price[i]) {
				st.pop();
			}
			if(st.isEmpty()) {
				ans[i]=i+1;
			}else {
				ans[i]=i-st.peek();
			}
			st.push(i);
			}
		return ans ;
	}
	
	public static void main(String[] args) {
		int[] arr = {10,4,5,90,120,80};
		int[] ans = spamproblem(arr) ;
		System.out.print("prices");
		System.out.println(Arrays.toString(arr));
		System.out.print("ans   ");
		System.out.println(Arrays.toString(ans));
	}

}
