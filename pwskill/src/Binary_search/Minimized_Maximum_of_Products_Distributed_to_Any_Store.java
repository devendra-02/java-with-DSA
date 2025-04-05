package Binary_search;

public class Minimized_Maximum_of_Products_Distributed_to_Any_Store {
	
	private static boolean ispossible(int[] quantities, int noofshop, int mid) {
	    int nos = 0 ;   // no of shops 
		for(int i=0;i<quantities.length;i++) {
			if(quantities[i]%mid==0) nos += quantities[i]/mid ;
			else nos += quantities[i]/mid + 1 ;
		}
		System.out.println(nos);
		if(nos>noofshop) return false ;
		else return true ;
	}

	public static void main(String[] args) {
		int[] quantities = {11,6} ;
		int n = quantities.length ;
		int noofshop = 6 ;
		int max = Integer.MIN_VALUE;
		
		for(int i=0;i<n;i++) {
			max = Math.max(max, quantities[i]) ;
		}
		System.out.println("max="+max);
		
		int minproduct = 0 ;  // minimum product to  be distributed at every shop
		int lo = 1 , hi = max ;
		while(lo<=hi) {
			int mid = lo+(hi-lo)/2 ;
			if(ispossible(quantities , noofshop ,mid)==true) {
				minproduct = mid ;
				hi = mid-1 ;
			}
			else {
				lo = mid+1 ;
			}
		}
		System.out.println("minimum product to bi didtribute = "+minproduct);
	}
}
