package Binary_search;

public class first_and_last_element {

	public static void main(String[] args) {
		int[] arr = {10} ;
		int[] ans = {-1,-1} ;
		int n = arr.length ;
		int target = 10 ;
		int lowerbound = n ;
		int upperbound = n ;
		
		int low = 0 , high = n-1 ;
		boolean flag = false ;
		while (low<=high) {
			int mid = (low+high)/2 ;
			if(arr[mid]==target) {
				flag = true;
				break ;
			}
			else if(arr[mid]<target) low = mid+1 ;
			else if(arr[mid]>target) high = mid-1 ;
		}
		
		if(flag==false) { 
			for(int ele : ans)
				System.out.print(ele+" ");
			return ;}
		
		int lo = 0 , hi = n-1 ;
		while(lo<=hi) {
			int mid = (lo+hi)/2 ;
			if(arr[mid]>=target) {
					 lowerbound = Math.min(mid, lowerbound) ;
					 ans[0]=lowerbound ;
				hi = mid-1 ;
			}
			else lo = mid+1 ;
		}
	    lo = 0 ; hi = n-1 ;
		while(lo<=hi) {
			int mid = (lo+hi)/2 ;
				 if(arr[mid]>target) {    // use for upper bound
					 upperbound = Math.min(mid, upperbound) ;

				hi = mid-1 ;
			}
			else lo = mid+1 ;
		}
		 ans[1]=upperbound-1 ;
		for(int ele : ans)
			System.out.print(ele+" ");

	}

}
