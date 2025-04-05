package Binary_search;

public class peak_index_mountainarray {

	public static void main(String[] args) {
		int[] arr = {3,5,3,2,0} ;

		int n = arr.length ;
		int low = 1 , high = n-2 ;
		while (low<=high) {
			int mid = (low+high)/2 ;
			if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]) {
				System.out.println("peak element is "+arr[mid]+" with index "+mid);
			       return ;}
			if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]) 
				low = mid+1 ;
		    if(arr[mid]<arr[mid-1] && arr[mid]>arr[mid+1]) 
			high = mid-1 ;
		}
	}

}
