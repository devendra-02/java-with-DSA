//package array_basic;
//import java.util.ArrayList;
//public class duplicate_no {
//	
//	public static void main(String[] args) {
//		int[] arr = {4,3,2,7,8,2,3,2,1} ;
//		int n = arr.length ;
//		ArrayList<Integer> ans = new ArrayList<Integer>();
//		
//		for(int i=0;i<n;i++) {
//			for(int j=i+1;j<n;j++) {
//				if(arr[i]==arr[j]) {
//					if (!ans.contains(arr[i])) {     // Avoid adding duplicates
//                        ans.add(arr[i]);}
//					break ; } 
//			}
//		}
//		System.out.println("duplicates no "+ ans);
//	}
//}

package array_basic;

import java.util.ArrayList;

public class duplicate_no {
	public static void swap(int[] arr ,int i ,int j){
		int temp = arr[i] ;
		arr[i] = arr[j] ;
		arr[j] = temp ;
	}
	
	public static ArrayList<Integer> disappear(int[] arr){
		int n = arr.length;
		int i = 0 ;
		while(i<n) {
			int ele = arr[i] ; // element should be ele-1 position 
			if(arr[i]==i+1 || arr[i]==arr[ele-1]) i++ ;
			else {
				swap(arr,i,ele-1);
			}
		}
		
		ArrayList<Integer> ans = new ArrayList<Integer>();
		for(int j=0;j<n;j++) {
			if(arr[j]!=j+1) ans.add(arr[j]);
		}
		return ans ;
	}
	
	public static void main(String[] args) {
		int[] arr = {4,3,2,7,8,2,3,1};
		System.out.println(disappear(arr));
		for(int ele : arr ) {
			System.out.print(" "+ ele);
		}
		
	}
}
