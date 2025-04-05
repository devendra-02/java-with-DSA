package Merge_and_Quick_Sorting;

import loops.continue_keyword;

public class quick_sort {

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
	
	public static int partion(int[] arr,int low ,int high) {
//		int pioelement = arr[low] ;int pioindex = low ;
//		int smallcount = 0 ;
//		for(int i=low+1;i<=high;i++) {   // calculate no of element less than pivot element 
//			if(arr[i]<=pioelement) smallcount++ ;
//		}
//		int correctindex = pioindex+smallcount;   // correct index pivot element 
		
//***************Randomized quick sort***************************************************************************************************
		int mid = (low+high)/2 ;
		int pioelement = arr[mid] ;int pioindex = mid ;
		int smallcount = 0 ;
		for(int i=low;i<=high;i++) {   // calculate no of element less than pivot element 
			if(i==mid) continue ;
			if(arr[i]<=pioelement) smallcount++ ;
		}
		int correctindex = low+smallcount;   // correct index pivot element 
//*****************************************************************************************************************************************		

		swap(arr,pioindex,correctindex);    // swap pivot with correct index 
		
		while(low<correctindex && high>correctindex) { // move all the small element in left and large in right 
			if(arr[low]<=pioelement) low++ ;
			else if(arr[high]>pioelement) high-- ;
			else if(arr[low]>pioelement && arr[high]<pioelement) swap(arr,low , high);
		}
		return correctindex ;
	}
	
public static void Quicksort(int[] arr,int low ,int high) {
	if(low>=high) return ;
    // move the pivot at correct place 
	// all right element < pivot & all left element > pivot 
		int indx = partion(arr, low, high);
		Quicksort(arr, low, indx-1);
		Quicksort(arr, indx+1, high);
		
	}
	public static void main(String[] args) {
	
		int[] arr = {4,9,7,1,2,3,6,5,8};
		print(arr) ;
		int n = arr.length;
		Quicksort(arr,0,n-1);
		print(arr);
	}

}
