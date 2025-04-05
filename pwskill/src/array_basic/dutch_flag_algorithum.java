package array_basic;

public class dutch_flag_algorithum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//*************** without dutch flag ********************************************		
//		int [] arr = {0,1,2,0,1,2,0,1,2,0};
//		int n = arr.length ;
//		int noofzero = 0 , noofone = 0 , nooftwo = 0 ;
//		for(int i=0;i<n;i++) {
//			if(arr[i] == 0) noofzero++ ;
//			if(arr[i] == 1) noofone++ ;
//			if(arr[i] == 2) nooftwo++ ;
//			}
//		System.out.println("no of zeros "+noofzero);
//		System.out.println("no of one "+noofone);
//		System.out.println("no of two "+nooftwo);
//		
//		for(int i=0;i<n;i++) {
//			if(i<noofzero) arr[i] = 0 ;
//		if(i>noofzero-1 && i<noofone+noofzero) arr[i] = 1 ;
//		if(i>noofone+noofzero-1 && i<noofone+noofzero+nooftwo) arr[i] = 2 ;
//		}
//		for(int ele : arr)
//			System.out.print(ele);
//	}
//
//}
		
//********************** with dutch flag ***************************************************8		

		int [] arr = {0,1,2,0,1,2,0,1,2,0};
		int n = arr.length ;
		int low = 0 , mid = 0 , high = n-1 ;
		while(mid<=high ) {
			if(arr[mid]==0) {
				int temp = arr[mid];
			arr[mid] = arr[low] ;
			arr[low] = temp ;
			low++ ; mid++ ;}
			
			else if(arr[mid]==1) {
				mid++ ;
			}
			else{
				int temp = arr[mid];
				arr[mid] = arr[high] ;
				arr[high] = temp ;
				high-- ;
			}
		}
		for(int ele:arr)
			System.out.print(ele);
		}
	}