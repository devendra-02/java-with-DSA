package Binary_search;

public class Capacity_To_Ship_Packages_Within_D_Days {
	
	public static boolean ispossible(int c, int[] arr, int d) {
		int n = arr.length ;
		int load = 0 ;
		int days = 1 ;
		for(int i=0;i<n;i++) {
			if(load+arr[i]<=c) {
				load+=arr[i] ;
			}
			else {
				load =arr[i];
				days++ ;
			}
		}
		if(days>d) return false ;
		else return true ;
	}

	public static void main(String[] args) {
		int[] arr = {3,2,2,4,1,4} ;
		int n = arr.length ;
		int day = 3 ;
		int max = Integer.MIN_VALUE;
		int sum = 0;
		
		for(int i=0;i<n;i++) {
			sum = sum + arr[i] ;
			max = Math.max(max, arr[i]) ;
		}
		System.out.println("max="+max+" sum="+sum);
		int mincapacity = max ;
		int lo=max , hi = sum ;
		while(lo<=hi) {
			int mid=lo+(hi-lo)/2 ;
			if(ispossible(mid,arr,day)==true) {
				mincapacity = mid ;
				hi=mid-1;
			}
			else {
				lo=mid+1 ;
			}
		}
		System.out.println("minimun capacity is = "+mincapacity);
	}
}
