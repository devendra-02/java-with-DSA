package array_basic;
import java.util.Scanner;
public class two_pointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Q9: Write a program to reverse the array without using any extra array.
//		using two pointer
		
//		int[]arr = {10,20,30,40,50,60,70};
//		int n = arr.length ;
//		for(int ele : arr) {
//			System.out.print(ele +" ");
//		}
//		System.out.println();
//		int i =0 , j = n-1 ;
//		while(i<=j) {
//			int temp = arr[i];
//			arr[i] = arr[j];
//			arr[j] = temp ;
//			i++ ;
//			j-- ;
//			
//		}
//		for (int ele : arr) {
//			System.out.print(ele+" ");
//		}
		
//*********without two pointer
		
//		int[]arr = {10,20,30,40,50,60,70};
//		int n = arr.length ;
//		for(int ele : arr) {
//			System.out.print(ele +" ");
//		}
//		System.out.println();
//		for(int i=0;i<n/2;i++) {
//			int j = n-1-i;
//			int temp = arr[i];
//			arr[i]=arr[j];
//			arr[j] = temp ;
//		}
//		for(int ele : arr) {
//			System.out.print(ele+" ");
//		}
		
//********** using functionw	
		int[]arr = {10,20,30,40,50,60,70};
		int n = arr.length ;
		for(int ele : arr) {
			System.out.print(ele +" ");
		}
		System.out.println();
		int i =0 , j = n-1 ;  // kha se kha tk ka reverse krna h
		while(i<=j) {
		swap(arr,i,j);
			i++ ;
			j-- ;
			}
		for (int ele : arr) {
			System.out.print(ele+" ");
		}
		System.out.println();
	}
		public static void swap(int[]arr,int i,int j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp ;
		}
	}


