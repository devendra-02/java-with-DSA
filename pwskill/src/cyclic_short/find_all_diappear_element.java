//leet code 448 - find all the number disappear in an array 

package cyclic_short;

import java.util.ArrayList;

public class find_all_diappear_element {
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
			if(arr[j]!=j+1) ans.add(j+1);
		}
		return ans ;
	}
	
	public static void main(String[] args) {
		int[] arr = {3, 1,4, 4, 5};
		System.out.println(disappear(arr));
		for(int ele : arr ) {
			System.out.print(" "+ ele);
		}
		
	}
}
