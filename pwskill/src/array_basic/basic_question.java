package array_basic;
import java.util.Scanner;
public class basic_question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		Q1: Given an array of marks of students, if the mark of any student is less
//		than 35 print its roll number. [roll number here refers to the index of the array.
		
//		System.out.println("enter no student");
//		int n = sc.nextInt();
//		int[]arr = new int[n];
//		for(int i=0;i<n;i++) { 
//			System.out.print(" marks of roll no "+i+" ");
//			arr[i] = sc.nextInt();
//		}
//		System.out.println("roll no with less then 35 ");
//		for(int i=0;i<n;i++) {
//			if(arr[i]<35)
//				System.out.println(i);
//		}
//		
//		Q2: calcalute the sum of all the element inthe given array 
		
		int[]arr = {15,64,5,6,65,5,64,6,4,6};
		int l = arr.length;
		int sum=0 ;
		for(int i=0;i<l;i++)
			sum=sum+arr[i] ;
		
		System.out.println("sum of elements "+sum);
	}

}
