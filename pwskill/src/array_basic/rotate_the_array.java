package array_basic;

public class rotate_the_array {
	
//	rotate the array to the right by k steps
//	Input: Array[] = {1, 3, 5, 7, 9}, K = 2.
//			Output: 7 9 1 3 5

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int []nums = {1,2,3,4,5,6,7};
//		int k = 4 ;
//		k%= nums.length;
//
//		reverse(nums, 0, nums.length - 1);
//		reverse(nums, 0, k-1);
//		reverse(nums, k, nums.length - 1);
//		
//		for(int ele : nums) {
//			System.out.print(ele);
//		}
//	}
//	public static void reverse(int[] nums, int start, int end) {
//		while (start < end) {
//		int temp = nums[start];
//		nums[start] = nums[end];
//		nums[end] = temp;
//		start++;
//		end--;
//		}
//		}
//}

	
	public static void rotate(int[] nums, int k) {
		int n = nums.length;
		k = k % n;
		reverse(nums, 0, n - 1);
		reverse(nums, 0, k - 1);
		reverse(nums, k, n - 1);
	}

	public static void reverse(int[] nums, int start, int end) {
		while (start < end) {
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 10;
		rotate(nums, k);
		System.out.println("Rotated Array:");
		for (int num : nums) {
			System.out.print(num + " ");
		}
	}
}

