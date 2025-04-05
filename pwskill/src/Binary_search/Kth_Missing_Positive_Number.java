package Binary_search;

public class Kth_Missing_Positive_Number {

	public static void main(String[] args) {
		int[] arr = {2,3,4,7,11};
		int k = 5 ;   
		int n = arr.length ;

		int lo = 0 , hi = n-1 ;
		while(lo<=hi) {
			int mid=lo+(hi-lo)/2 ;
			int missed = arr[mid]-(mid+1) ;  // no of element are is missed at mid th position
			if(missed<k) lo = mid+1 ;
			else hi = mid-1 ;
		}
		System.out.println(hi+" "+ lo); // missed element is present in between hi & lo
		
//		kthmissedelement = arr[hi] + extra
//		                 = arr[hi] + k - (arr[hi] - (hi+1))
//		                 = arr[hi] + k - arr[hi] + (hi+1)
//		                 = k + (hi+1)
		
		int kthmissedelement = k+(hi+1) ; // yha (hi+1) ki jgh low bhi use kr skte h because jb loop tuttha h to
		System.out.println(kthmissedelement);                          // lo hmesha lo = (hi+1) 
	}

}
