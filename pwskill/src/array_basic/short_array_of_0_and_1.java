package array_basic;

public class short_array_of_0_and_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		int [] arr = {1,0,0,1,1,0,0,0,1,0};
//		int n = arr.length ;
//		int noofzero = 0 , noofone = 0 ;
//		for(int i=0;i<n;i++) {
//			if(arr[i] == 0) 
//				noofzero = noofzero+1 ;
//			else noofone++ ;
//			}
//		System.out.println("no of zeros "+noofzero+" no of ones "+ noofone);;
//		
//		for(int i=0;i<n;i++)
//			if(i<noofzero) arr[i] = 0 ;
//			else arr[i] = 1 ;
//
//		for(int ele : arr)
//			System.out.print(ele);
//	}
//
//}
		
//**********************************************************************************************88

//		int [] arr = {1,0,0,1,1,0,0,0,1,0};      // condition 1
		int [] arr = {0,0,0,0,1,1,1,1};          // condition 2
		int n = arr.length ;
		for(int ele : arr)
			System.out.print(ele);
		System.out.println();
		int i = 0 , j = n-1 ;
		while(i<j) {
			if(arr[i]==0) i++ ;
			if(arr[j]==1) j-- ;
			if(i<j) break ;       // is line ki jgh if else bhi use kr skte h
			if(arr[i]==1 && arr[j]==0) {
				int temp = arr[i];
				arr[i] = arr[j] ;
				arr[j] = temp ;
			}
		}
		for(int ele : arr)
			System.out.print(ele);
	}
}