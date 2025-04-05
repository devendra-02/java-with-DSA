package array_basic;

public class Maximum_Value_of_Ordered_Triplet_I_2873 {
	
	public static long maximumTripletValue(int[] nums) {
        int n = nums.length;
        if (n < 3) return 0; // Not enough elements

        long maxTriplet = 0;
        int maxLeft = nums[0]; // Maximum nums[i] seen so far

        int[] maxRight = new int[n];
        maxRight[n - 1] = nums[n - 1];

        // Compute maxRight array (suffix max)
        for (int k = n - 2; k >= 0; k--) {
            maxRight[k] = Math.max(maxRight[k + 1], nums[k]);
        }

        // Iterate through the array to find the maximum triplet value
        for (int j = 1; j < n - 1; j++) {
            if (maxLeft > nums[j]) {
                maxTriplet = Math.max(maxTriplet, (long) (maxLeft - nums[j]) * maxRight[j + 1]);
            }
            maxLeft = Math.max(maxLeft, nums[j]);
        }

        return maxTriplet;
    }
	public static void main(String[] args) {
		
		int[] nums1 = {12, 6, 1, 2, 7};
        System.out.println(maximumTripletValue(nums1)); // Output: 77

        int[] nums2 = {1, 10, 3, 4, 19};
        System.out.println(maximumTripletValue(nums2)); // Output: 133

        int[] nums3 = {1, 2, 3};
        System.out.println(maximumTripletValue(nums3)); // Output: 0
    
	}

}
