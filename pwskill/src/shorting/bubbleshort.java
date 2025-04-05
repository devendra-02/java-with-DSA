package shorting;

import java.util.Arrays;
import java.util.Scanner;

import loops.break_keyword;
public class bubbleshort {

	public static void print(int[] arr) {
		for(int ele : arr)
			System.out.print(ele+" ");
		
		System.out.println();
	}
	public static void main(String[] args) {
 		Scanner sc = new Scanner (System.in) ;
		
		int[] arr = new int[5] ;
		int n = arr.length ;
		
		System.out.println("enter the elements ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt() ;
		}
		print(arr) ;
		
//		for(int x=0;x<n-1;x++) {   // no of passes
//			for(int j=0;j<n-1-x;j++) {  // no of swaps
//				if(arr[j]>arr[j+1]) {
//					int temp = arr[j] ;
//					arr[j] = arr[j+1] ;
//					arr[j+1] = temp ;
//				} } }
		
		// 2.  more optmize - check after every pass array is sorted or not
		
//		for(int x=0;x<n-1;x++) {   // no of passes
//			for(int j=0;j<n-1-x;j++) {  // no of swaps
//				if(arr[j]>arr[j+1]) {
//					int temp = arr[j] ;
//					arr[j] = arr[j+1] ;
//					arr[j+1] = temp ;
//				} } 
//			boolean sh = true ;
//			for(int j=0;j<n-1;j++) {   // check sorted or not 
//				if(arr[j]>arr[j+1]) {
//					sh = false ;
//				break ; } }
//			if(sh==true) break ;
//			}
		
		// after the merge inner two loops
		
		for(int x=0;x<n-1;x++) {   // no of passes
			boolean sh = true ;
			for(int j=0;j<n-1-x;j++) {  // no of swaps
				if(arr[j]>arr[j+1]) {
					int temp = arr[j] ;
					arr[j] = arr[j+1] ;
					arr[j+1] = temp ;
					sh = false ;
				} } 
			if(sh==true) break ;
			}
		System.out.println("after the bubble sort");
		print(arr) ;
	}

}
