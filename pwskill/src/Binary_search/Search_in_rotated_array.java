package Binary_search;

public class Search_in_rotated_array {

	public static void print(int[] arr) {
		for(int ele : arr)
			System.out.print(ele+" ");
		
		System.out.println();
	}	
	public static void main(String[] args) {
		
		int[] arr = {3,4,5,6,7,0,1,2};
		int target = 7 ;
		int n = arr.length ;
		print(arr) ;
		int low = 0 , hi = n-1 ;
		
		while(low<=hi) {
			int mid = low + (hi-low)/2 ;
			if(arr[mid]==target) {
				System.out.println("yrs "+ mid);
				return ; }
			
			else if(arr[mid]<=arr[hi]) { // i am in right shorted arr  (mid to high everything is sorted )
				if(target>arr[mid] && target<=arr[hi]) low=mid+1 ;
				else hi = mid-1 ;}
			
			else { // i am in left shorted arr  (low to mid everything is sorted )
				if(target>arr[low] && target<=arr[mid]) hi=mid-1 ;
				else low = mid+1 ; }
		}

	}
}
