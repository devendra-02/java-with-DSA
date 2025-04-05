package _2D_Array;
import java.util.Scanner;

import javax.imageio.metadata.IIOMetadataFormatImpl;
public class store_data_of_student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in) ;
		
		System.out.println("enter the data ");
		
		int[][] arr = new int[4][2] ;
		for(int i=0;i<4;i++) {
			for(int j=0;j<2;j++) {
				arr[i][j] = sc.nextInt();
			}
			
		}
		for(int[] ele : arr) {
			for(int x : ele) {	
		System.out.print(x+" ");
	    	}
			System.out.println();
    	}
    }
}
