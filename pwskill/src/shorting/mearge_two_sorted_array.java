package shorting;

public class mearge_two_sorted_array {
	
	public static void shorted(int[] a,int[] b,int[] c) {
		int i=0,j=0,k=0 ;
		
		while(i<a.length && j<b.length) {
			if(a[i]<=b[j]) {
				c[k]=a[i];
				i++ ;
			}
			else {
				c[k]=b[j];
			    j++ ;  
			}
			k++ ;
		}
		while(i<a.length) {
			c[k]=a[i];
			k++ ; i++ ;
		}
		while(j<b.length) {
			c[k]=a[j];
			k++ ; j++ ;
		}
	}

	public static void print(int[] arr) {
		for(int ele : arr)
			System.out.print(ele+" ");
		
		System.out.println();
	}
	public static void main(String[] args) {
		
		int [] a = {1,4,7,9,11,15} ;
		int [] b = {2,5,6,8} ; 
		
		print(a) ;		
		print(b) ;	
		
		int[] c = new int[a.length+b.length] ;
		shorted(a,b,c) ;
		
		print(c);
	}

}
