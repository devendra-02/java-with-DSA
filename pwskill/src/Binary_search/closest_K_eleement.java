package Binary_search;

import java.util.ArrayList;
import java.util.Collections;   // use for array list sorting

public class closest_K_eleement {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12};
		int n = arr.length;
		int k = 4 ;
		int x = 12;
		ArrayList<Integer> ans = new ArrayList<Integer>();
		
		if(x<arr[0]) {         // if x is less then 0 th element 
			for(int i = 0;i<k;i++) {
				ans.add(arr[i]) ;
			}
			for(int i=0;i<ans.size();i++) {
				System.out.print(ans.get(i)+" ");   }
		}
		else if(x>arr[n-1]) {    // if x is greater than n-1 th element 
			for(int i = n-k;i<n;i++) {
				ans.add(arr[i]) ;
			}
			for(int i=0;i<ans.size();i++) {
				System.out.print(ans.get(i)+" ");   }
		}else {
            // Handle the case where x is between arr[0] and arr[n-1]
		int lo = 0 , hi = n-1 ;
		int lb = n ;
		while(lo<=hi) {    // find lower bound 
			int mid = lo+(hi-lo)/2 ;
       			if(arr[mid]>=x) {
				lb = Math.min(lb, mid) ;
				hi = mid-1 ;
			}
			else lo = mid+1 ;
		}
		System.out.println("lower bound is "+lb);
		
		lo = lb-1 ; hi = lb ;
		while(k>0) {
			if(lo<0) { 
				ans.add(arr[hi]) ;
				hi++ ;
			}
			else if(hi>=n) {
				ans.add(arr[lo]) ;
				lo-- ;
			}
			else if(Math.abs(arr[lo]-x)<=Math.abs(arr[hi]-x)) {
				ans.add(arr[lo]) ;
				lo-- ;
			}
			else {
				ans.add(arr[hi]) ;
				hi++;
			}
			k-- ;  // decreas k by 1 
		}  // while loop end here
		} 
		 Collections.sort(ans);  // Sort the list to print in ascending order
	        for (int i = 0; i < ans.size(); i++) {
	            System.out.print(ans.get(i) + " ");
	        }
	}

}
