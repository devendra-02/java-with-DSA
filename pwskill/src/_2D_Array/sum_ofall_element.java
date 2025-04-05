package _2D_Array;
import java.util.Scanner;
public class sum_ofall_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in) ;
		
		System.out.println("enter the data for addition  ");
		
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
		int sum = 0 ;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				sum = sum + arr[i][j] ;
			}   }
		System.out.println("largest no is "+sum);
	}
}
