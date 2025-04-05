package shorting;

import java.util.Arrays;
import java.util.Scanner;

import loops.break_keyword;

public class shorted_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in) ;
		boolean sh = true ;
		
		int[] arr = new int[5] ;
		int n = arr.length ;
		
		System.out.println("enter the elements in arr ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt() ;
		}
		for(int ele : arr)
			System.out.print(ele+" ");
	
		for(int j=0;j<n-1;j++) {
			if(arr[j]>arr[j+1]) {
				sh = false ;
			break ; }
		}
		if(sh==true) System.out.println("shorted");
		else {
			System.out.println("unshorted");
			System.out.println("after the short");
			
			Arrays.sort(arr);     // built in sort function 
			
			for(int ele : arr)
				System.out.print(ele+" ");
		}
	}

}
