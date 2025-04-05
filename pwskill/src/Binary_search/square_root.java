package Binary_search;

public class square_root {

	public static void main(String[] args) {
		int num = 225 ;
		
		int low = 0 , high = num ;
		while (low<=high) {
			int mid = (low+high)/2 ;
			if((mid*mid)==num) {
				System.out.println("square root is "+mid);
			       return ;}
			if((mid*mid)<num) 
				low = mid+1 ;
		    if((mid*mid)>num) 
			high = mid-1 ;
		}
		System.out.println(high);
	}

}
