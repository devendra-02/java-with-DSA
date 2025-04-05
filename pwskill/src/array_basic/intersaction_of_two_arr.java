package array_basic;

import java.util.Arrays;   // to use inbuild method like Arrays.sort() , Array.toString() etc 

public class intersaction_of_two_arr {
	
		public static int[] intersection(int[] nums1, int[] nums2) {
	       
			
	        Arrays.sort(nums1);  // ye dono arraya ko shor kr dega
	        Arrays.sort(nums2);  // if already shorted is hta do
	        
	        int i = 0, j = 0;
	        int[] temp = new int[Math.min(nums1.length, nums2.length)];
	        int index = 0;
	        
	        while (i < nums1.length && j < nums2.length) {
	            if (nums1[i] == nums2[j]) {
	                if (index == 0 || temp[index - 1] != nums1[i]) {   // check element already present to ni h 
	                    temp[index++] = nums1[i];
	                }
	                i++; j++;
	            } else if (nums1[i] < nums2[j]) {
	                i++;
	            } else {
	                j++;
	            }
	        }
	        temp = Arrays.copyOf(temp, index);          // Haan, Arrays.copyOf(temp, index) ka matlab yahi hai ki jitna index hoga, utna hi size ka naya array
	                                                    //  return hoga. Aur temp array ki size adjust ho jayegi (sirf index tak ki values ka ek naya array banega).
	        return temp ;
	    }
	   public static void main(String[] args) {
		   int[] arr = {7, 2, 5, 3, 5, 6};
		   int[] brr = {3, 5, 7, 8, 9, 1};
		
		System.out.println(intersection(arr, brr));    // it print array reference
		
		System.out.println(Arrays.toString(intersection(arr, brr)));       // hear array ko string me convert kiya h
	}
	}