//package quesarraysh;
//
//public class trapping_rain_problem {
//
//	public static void main(String[] args) {
//		int[] arr = {0,1,0,2,1,0,1,3} ;
//		System.out.println("arr length"+arr.length);
//		
//		int largestindex = 0;
//		for(int i=1;i<arr.length;i++) {
//			if(arr[i]>arr[largestindex]) {
//				largestindex = i ;
//		}
//	 }
//		System.out.println("largest index"+largestindex);
//	
//		int water = 0 ;
//		int a=0;
//		for(int i=0;i<=largestindex;i++) {
//			if(arr[i]>arr[a]) {
//				
//				for(int j=a+1;j<i;j++) {
//				
//					water = water + (arr[a]-arr[j]);
//				}
//				a=i;
//			}
//		}
//		
//		System.out.println("water"+water);
//  }
//
//}







//package quesarraysh;
//
//public class trapping_rain_problem {
//
//	public static void main(String[] args) {
//		int[] arr = {4,0,3,1,0,1,2,0,1,0} ;
//		int n = arr.length ;
//		System.out.println("arr length"+n);
//		
//		int largestindex = 0;
//		for(int i=1;i<arr.length;i++) {
//			if(arr[i]>arr[largestindex]) {
//				largestindex = i ;
//		}
//	 }
//		System.out.println("largest index"+largestindex);
//	
//		int water = 0 ;
//		int a=n-1;
//		for(int i=n-1;i>=largestindex;i--) {
//			if(arr[i]>arr[a]) {
//				
//				for(int j=a-1;j>i;j--) {
//				
//					water = water + (arr[a]-arr[j]);
//				}
//				a=i;
//			}
//		}
//		
//		System.out.println("water"+water);
//  }
//
//}


package array_basic;

public class trapping_rain_problem {

	public static void main(String[] args) {
		int[] arr = {4,2,0,3,2,5} ;
		int n = arr.length ;
		System.out.println("arr length"+n);
		
		int largestindex = 0;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>arr[largestindex]) {
				largestindex = i ;
		}
	 }
		System.out.println("largest index"+largestindex);
	
		int water = 0 ;
		
		int a=0;
		for(int i=0;i<=largestindex;i++) {
			if(arr[i]>arr[a]) {
				
				for(int j=a+1;j<i;j++) {
				
					water = water + (arr[a]-arr[j]);
				}
				a=i;
			}
		}
		
		 a=n-1;
		for(int i=n-1;i>=largestindex;i--) {
			if(arr[i]>arr[a]) {
				
				for(int j=a-1;j>i;j--) {
				
					water = water + (arr[a]-arr[j]);
				}
				a=i;
			}
		}

		
		System.out.println("water"+water);
  }

}