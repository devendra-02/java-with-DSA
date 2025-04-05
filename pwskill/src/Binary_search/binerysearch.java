package Binary_search;

public class binerysearch {

	public static void main(String[] args) {
		int[] arr = { 10,23,46,89,91,97,107,140,264} ;
		int n = arr.length ;
		int t = 46 ;  // target
		int low = 0 , high = n-1 ;
		boolean flag = false ;
		int ind = -1 ;
		while (low<=high) {
			int mid = (low+high)/2 ;
			if(arr[mid]==t) {
				ind = mid ;
				flag = true;
				break ;
			}
			else if(arr[mid]<t) low = mid+1 ;
			else if(arr[mid]>t) high = mid-1 ;
		}
		
		if(flag==true) System.out.println("yes target is present "+ind);
		else System.out.println("no target is not present");
	}  

}
