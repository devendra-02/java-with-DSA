package Merge_and_Quick_Sorting;
import java.util.Scanner ;
public class Kth_largest_no {

	public static void print(int[] arr) {
		for(int ele : arr) {
			System.out.print(ele+" ");
		}
		System.out.println();
	}
	
	public static void swap(int[] arr,int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j] ;
		arr[j] = temp ;
	}
	
	public static int partion(int[] arr, int low ,int high) {
		int mid = (low+high)/2 ;
		int pivot = arr[mid] ; int pivotindex = mid ;
		int smallcount =  0 ;
		for(int i=low;i<=high;i++) {
			if(i==mid) continue ;
			if(arr[i]<pivot) smallcount++ ;
		}
		int correctindex = low+smallcount ;
		
		swap(arr, pivotindex, correctindex);
		
		while(low<correctindex && high>correctindex) {
			if(arr[low]<arr[correctindex]) low++ ;
			else if(arr[high]>arr[correctindex]) high-- ;
			else  
			swap(arr, low, high);
		}
		return correctindex ;
	}
	public static void Quicksort(int[] arr, int low ,int high,int k) {
		if(low>high) return ;
		int indx = partion(arr,low,high);

		if(indx==k) {
			ans = arr[indx];
			return ;
		}
		
		else if(k<indx) 
			Quicksort(arr, low, indx-1,k);
		
		else Quicksort(arr, indx+1, high,k);
		
	}
	public static int ans = 0 ;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {4,9,7,1,2,3,6,5,8};
		print(arr) ;
		int n = arr.length;
		System.out.println("enter the kth element ");
		int k = sc.nextInt();
		Quicksort(arr,0,n-1,n-k);    // n-k is the kth largest element of array 
		print(arr);
		System.out.println("kth element is "+ans);
		
	}

}




//import java.util.Random;
//
//class Solution {
//    private int partition(int[] arr, int low, int high) {
//        int pivot = arr[high];  // Choose last element as pivot
//        int i = low;            // Place for swapping smaller elements
//        
//        for (int j = low; j < high; j++) {
//            if (arr[j] <= pivot) {
//                swap(arr, i, j);
//                i++;
//            }
//        }
//        swap(arr, i, high);
//        return i;  // Correct position of the pivot
//    }
//
//    private int quickSelect(int[] arr, int low, int high, int k) {
//        if (low == high) return arr[low];
//
//        int pivotIndex = partition(arr, low, high);
//
//        if (pivotIndex == k) return arr[pivotIndex];
//        else if (pivotIndex > k) return quickSelect(arr, low, pivotIndex - 1, k);
//        else return quickSelect(arr, pivotIndex + 1, high, k);
//    }
//
//    public int findKthLargest(int[] arr, int k) {
//        int n = arr.length;
//        return quickSelect(arr, 0, n - 1, n - k);
//    }
//
//    private void swap(int[] arr, int i, int j) {
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }
//}



//import java.util.Random;
//
//class Solution {
//    // Randomized partition method
//    private int partition(int[] arr, int low, int high) {
//        // Select a random pivot index
//        Random rand = new Random();
//        int pivotIndex = low + rand.nextInt(high - low + 1);
//        
//        // Swap pivot with the last element to use the original partition logic
//        swap(arr, pivotIndex, high);
//        
//        // Partition the array
//        int pivot = arr[high];  
//        int i = low;            
//
//        for (int j = low; j < high; j++) {
//            if (arr[j] <= pivot) {
//                swap(arr, i, j);
//                i++;
//            }
//        }
//        swap(arr, i, high);
//        return i;  // Correct position of the pivot
//    }
//
//    private int quickSelect(int[] arr, int low, int high, int k) {
//        if (low == high) return arr[low];
//
//        int pivotIndex = partition(arr, low, high);
//
//        if (pivotIndex == k) return arr[pivotIndex];
//        else if (pivotIndex > k) return quickSelect(arr, low, pivotIndex - 1, k);
//        else return quickSelect(arr, pivotIndex + 1, high, k);
//    }
//
//    public int findKthLargest(int[] arr, int k) {
//        int n = arr.length;
//        // We need the (n-k)th element, 0-based index
//        return quickSelect(arr, 0, n - 1, n - k);
//    }
//
//    private void swap(int[] arr, int i, int j) {
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }
//}

