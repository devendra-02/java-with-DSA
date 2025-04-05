//package quesarraysh;
//
//public class mearge_two_shorted_arr {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		int []arra = {1,4,7,9} ;
//		int []arrb = {2,5,6,8} ; 
//		int n = arra.length+arrb.length;
//		System.out.println(n);
//		int []arrc = new int[n] ;
//		 int i=0 ,j=0 , k=0;
//		while(i<arra.length && j<arrb.length) {
//			if(arra[i]<=arrb[j]) {
//				arrc[k]=arra[i];
//				i++ ;	k++;
//			}
//			if(arrb[j]<=arra[i]) {
//				arrc[k]=arrb[j];
//				j++	; 
//			}
//			k++;
//		}
//		if(i==arra.length) { // now take elements from b only
//			while(j<arrb.length) {
//			arrc[k] = arrb[j];
//			j++; k++;
//			}
//			}
//			if(j==arrb.length) { // now take elements from a only
//			while(i<arra.length) {
//			arrc[k] = arra[i];
//			i++; k++;
//			}
//			}
//		for(int ele : arrc)
//			System.out.print(ele);
//	}
//
//}
//

//******************************************************* USING RECURSION*****************************************************

package array_basic;

public class mearge_two_shorted_arr {

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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a = {1,4,7,9,11,15} ;
		int [] b = {2,5,6,8} ; 
		print(a);
		print(b);
		int[] c = new int[a.length+b.length] ;
		shorte(a, b, c);
		print(c);
	}

}

