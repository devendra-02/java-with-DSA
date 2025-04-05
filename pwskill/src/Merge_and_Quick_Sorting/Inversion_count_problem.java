package Merge_and_Quick_Sorting;

public class Inversion_count_problem {
	
	public static void print(int[] arr) {
		for(int ele : arr)
			System.out.print(ele+" ");
		System.out.println();
	}
	public static int count = 0 ;
	
//	public static void inversioncount(int[] a , int[] b) {  //********instead of this function we use line no 32**************   
//		int i=0;int j=0;
//		while(i<a.length && j<b.length) {
//			if((long)a[i]>(long)b[j]) {      // convert element into long data type for large value
//				count = count+(a.length-i);
//				j++ ;
//			}
//			else i++ ;
//		}
//	}
	
	public static void merge(int[]a,int[]b,int[]c) {
		int i = 0,j=0,k=0 ;
		while(i<a.length && j<b.length) {
			if(a[i]<=b[j]) {
				c[k]=a[i] ;
				k++ ; i++;
			}
		else {    //  a[i]>b[j]
			
			count = count+(a.length-i);    //   this line is use for  Inversion count
					c[k]=b[j];
				j++ ; k++ ;
				}
			}
		
		while(i<a.length) {
			c[k]=a[i] ;
			k++ ; i++;
		}
		while(j<b.length) {
			c[k]=b[j] ;
			k++ ; j++;
		}
	}
	
	public static void sorted(int[] arr) {  // divide array into two parts 
		int n=arr.length ;
		if(n==1) {
			return ;
		}
		int[] a = new int[n/2];
		int[] b = new int[n-n/2];
		
		for(int i=0;i<n/2;i++) {
			a[i]=arr[i];
		}
		for(int i=0;i<n-n/2;i++) {
			b[i]=arr[i+n/2];
		}
		
		// further divide array into two parts until only 1 element in array
		sorted(a);    
		sorted(b);
		
		// count total no of inversion 
//		inversioncount(a,b);   //********instead of this function we use line no 32 **************
		
		// merge two  different array 
		merge(a, b, arr);
	}

	public static void main(String[] args) {
		int [] arr = {109,33,89,27,60,10,70} ;
		System.out.println("before shorting ");
		print(arr);
		sorted(arr);
		System.out.println("after shorting  ");
		print(arr);
		System.out.println("total count = "+count);
	}
}
