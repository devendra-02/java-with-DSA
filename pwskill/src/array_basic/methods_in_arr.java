package array_basic;

import java.util.Arrays;

public class methods_in_arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr = {18,46,65,76,54};
		
		// for each loop 
		for(int ele : arr) {
			System.out.print(ele+" "); }
		
		Arrays.sort(arr);     //  use for shorting a array
		
		System.out.println();
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		
		System.out.println();
		arr = Arrays.copyOf(arr, 3);   // Haan, Arrays.copyOf(temp, index) ka matlab yahi hai ki jitna index hoga, utna hi size ka naya array
		                              //  return hoga. Aur temp array ki size adjust ho jayegi (sirf index tak ki values ka ek naya array banega).
		for(int ele : arr) {          
			System.out.print(ele+" "); }
	}

}
