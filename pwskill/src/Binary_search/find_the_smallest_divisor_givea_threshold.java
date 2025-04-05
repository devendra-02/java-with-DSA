//package Binary_search;
//
//public class find_the_smallest_divisor_givea_threshold {
//
//	public static void main(String[] args) {
//		int[] arr = {1,2,3,4,5,11,12};
//		int n = arr.length;
//		int threshold = 15 ;
//		int max = Integer.MIN_VALUE;
//		for(int i=0;i<n;i++) {
//			max = Math.max(max, arr[i]);
//		}
//		System.out.println("maximum is "+max);
//		int d=0;
//		for(d=1;d<max;d++) {   // hear d is always start with 1
//			int sum = 0;
//			for(int i=0;i<n;i++) {
//				if(arr[i]%d==0) sum = sum+arr[i]/d ;  // kyo ki java me no ko 0 se divide ni krte 
//				else sum = sum+arr[i]/d+1 ;
//			}
//			if(sum<=threshold) {
//				System.out.println("sum is "+sum+d);
//				break ;
//			}
//		}
//	}
//
//}

//*********************************using binary search**********************************************************************

package Binary_search;

public class find_the_smallest_divisor_givea_threshold {

	public static void main(String[] args) {
		int[] arr = {44,22,33,11,1};
		int n = arr.length;
		int threshold = 5 ;
		int max = Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			max = Math.max(max, arr[i]);
		}
		System.out.println("maximum is "+max);
		int low = 1 , hi = max ;
		int d=1 ;   // d is the smallest no give the sum<= threshold when divide all the no by d
		while(low<=hi) { 
			int mid = low+(hi-low)/2 ;// hear d is always start with 1
			int sum = 0;
			for(int i=0;i<n;i++) {
				if(arr[i]%mid==0) sum = sum+arr[i]/mid ;  // kyo ki java me no ko 0 se divide ni krte 
				else sum = sum+arr[i]/mid+1 ;
			}
			if(sum<=threshold) {
				d=mid;
				hi=mid-1 ; 
			}
			else {
				low=mid+1 ;	
			}
		}
		System.out.println(d);
	}

}

