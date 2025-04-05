// Q. Missing Number  
// Given an array arr containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

package cyclic_short;
import java.util.Scanner;
public class Missing_Numbe {
	
public static void print(int[] arr) {
	for(int ele : arr) {
		System.out.print(ele+" ");
	}
	System.out.println();
}

public static void swap(int[] arr , int i, int j) {
	int temp = arr[i];
	arr[i] = arr[j];
	arr[j] = temp ;
}

public static void cyclicsort(int[] arr) {
	int n = arr.length ;
	int i = 0 ;
	while(i<n) {
		if(arr[i]==i || arr[i]==n) i++ ;
	
		else swap(arr,i,arr[i]);
	}
	for(int j=0;j<n;j++) {
		if(arr[j]!=j) {
			System.out.println("missing element is "+j);
			return ;
		}
	}
	System.out.println("missing element is "+i);
}

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in) ;
//		System.out.println("enter the size of array ");
//		int m = sc.nextInt();
//		int[] arr = new int[m];
//		System.out.println("enter the element in array ");
//		for(int i=0;i<m;i++) {
//			arr[i] = sc.nextInt();
//		}
		int[] arr = {3, 7, 1, 9, 4, 2, 8, 5,0};
		print(arr);
		cyclicsort(arr);
		print(arr);

	}

}
