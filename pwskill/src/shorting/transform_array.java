package shorting;

public class transform_array {
	public static void print(int[] arr) {
		for(int ele : arr)
			System.out.print(ele+" ");
		
		System.out.println();
	}

	public static void main(String[] args) {
	
	int[] arr = {40,12,78,34,100,57,23} ;
	int n = arr.length ;
	print(arr);
	System.out.println("after the sort");
	
	int num = 0 ;
	for(int i=0;i<n;i++) {
		 
		int min = Integer.MAX_VALUE ;
		int mindx = -1; 
		for(int j=0;j<n;j++) {
			if(arr[j]<min && arr[j]>0) {
				min = arr[j] ;
				mindx = j ;  // index of min value
			} } 
		arr[mindx] = num ;
		num-- ;
	}
	for (int i = 0; i < arr.length; i++) 
	    arr[i] *= -1;
	print(arr);	
	}

}
