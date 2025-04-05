package cyclic_short;

import java.util.Arrays; // it allow to use Arrays.toString() and various methods 

public class _645_set_Mismatch {
	public static void swap(int[] arr,int i ,int j) {
		int temp = arr[i] ;
		arr[i] = arr[j] ;
		arr[j] = temp ;
	}
	public static int[] missmatch(int[] nums) {
		int i=0 ;
		int n = nums.length;
		while(i<n) {
			int corridx = nums[i]-1 ;
			if(nums[i]!=nums[corridx]) {
				swap(nums,i,corridx);
			}
			else {
				i++ ;
			}
		}
		for ( i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                return new int[]{nums[i], i + 1}; // [Duplicate, Missing]
            }
        }

        return new int[]{-1, -1}; // This should never be reached
    }
	public static void main(String[] args) {
		int[] arr = {3,2,2} ;    // does not support {3,2,2} so we sort the array first 
		
		System.out.println(missmatch(arr)); //it prints the memory reference instead of the elements. like - [I@5ca881b5
		System.out.println(Arrays.toString(missmatch(arr))); // Arrays.toString() is a method in the java.util.Arrays class that converts an array into a human-readable string representation.
	}
}

