package Binary_search;

public class lower_bound {

	public static void main(String[] args) {
		
// given a shorted integer array and an integer x find the lower bound of x .
		int[] arr = {10,23,46,46,46,46,91,97,97,140,264} ;
		int n = arr.length ;
		System.out.println(n);
		int t = 295;
		int lb = n ;
		int lo = 0 , hi = n-1 ;
		
		while(lo<=hi) {
			int mid = lo+(hi-lo)/2 ;
       			if(arr[mid]>=t) {
//				 if(arr[mid]>t) {    // use for upper bound
				lb = Math.min(lb, mid) ;
				hi = mid-1 ;
			}
			else lo = mid+1 ;
		}
		System.out.println("lower bound is "+lb);
	}

}
