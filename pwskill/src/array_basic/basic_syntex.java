package array_basic;
import java.util.Scanner;
public class basic_syntex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		int []arr = new int[5];
//		arr[0] = 10 ;
//		arr[1] = 20 ;
//		arr[2] = 30 ;
//		arr[3] = 40 ;
//		arr[4] = 50 ;
//		
////		System.out.println(arr[1]);  0r
//		for(int i=1;i<=5;i++)
//			System.out.print(arr[i]+" ");
		
//					or
		
//		Scanner sc = new Scanner(System.in);
//		int[]arr = new int[7];
//		for(int i=0;i<=6;i++) {
//			arr[i] = sc.nextInt();}
//		
//		for(int i=0;i<=6;i++) {
//			System.out.print(arr[i]+" ");}
		
		int[]arr = {21,54,64,64,64,66,4,6,65,45,5,5,8,5,} ;
		int l = arr.length;
		System.out.println(l);
		for(int i=0;i<=l;i++) 
			System.out.print(arr[i]+" ");
}
}
