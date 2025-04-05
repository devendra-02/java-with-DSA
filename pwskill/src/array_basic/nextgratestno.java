//package quesarraysh;
//
//public class nextgratestno {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int[] arr = {12,8,41,37,2,49,16,28,21};
//		int n = arr.length ;
//		int[] ans = new int[n];
//		ans[n-1] = -1 ;
//		for(int i=0;i<n-1;i++) {
//			int mx = Integer.MIN_VALUE;                    // hard way
//			for(int j=i+1;j<n;j++) {
//				mx = Math.max(mx, arr[j]);
//			}
//			ans[i]=mx;
//		}
//		for(int ele : arr) {
//			System.out.print(ele+" ");
//		}
//		System.out.println();
//		for(int ele : ans) {
//			System.out.print(ele+" ");
//		}
//	}
//
//}

package array_basic;

public class nextgratestno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {12,8,60,37,2,49,16,28,21};
		int n = arr.length ;
		int[] ans = new int[n];
		int neg = arr[n-1];
		ans[n-1]=-1 ;
		for(int i=n-2;i>=0;i--) {                             //  easy way
			ans[i]=neg ;
			neg = Math.max(neg, arr[i]);
		}
		for(int ele : arr) {
			System.out.print(ele+" ");
		}
		System.out.println();
		for(int ele : ans) {
			System.out.print(ele+" ");
		}
	}

}
