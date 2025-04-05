package Merge_and_Quick_Sorting;

public class Merge_Sort {
	
	public static void print(int[] arr) {
		for(int ele : arr)
			System.out.print(ele+" ");
		System.out.println();
	}
	
	public static void shorte(int[]a,int[]b,int[]c) {
		int i = 0,j=0,k=0 ;
		while(i<a.length && j<b.length) {
			if(a[i]<=b[j]) {
				c[k]=a[i] ;
				k++ ; i++;
			}
		else {
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
		// merge two  different array 
		shorte(a, b, arr);
	}

	public static void main(String[] args) {
		int [] arr = {1,4,2,5,7,9,11,6,8,15} ;
		System.out.println("before shorting ");
		print(arr);
		sorted(arr);
		System.out.println("after shorting  ");
		print(arr);
	}

}
