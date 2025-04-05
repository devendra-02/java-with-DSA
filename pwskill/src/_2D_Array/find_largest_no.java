package _2D_Array;
import java.util.Scanner;
public class find_largest_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in) ;
		
		System.out.println("enter the data ");
		
		int[][] arr = new int[3][3] ;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				arr[i][j] = sc.nextInt();
			}   }
		
		for(int[] ele : arr) {
			for(int x : ele) {	
		System.out.print(x+" ");
	    	}
			System.out.println();
    	}
		int max = Integer.MIN_VALUE ;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				max = Math.max(max, arr[i][j]);
			}   }
		System.out.println("largest no is "+max);
	}
}
