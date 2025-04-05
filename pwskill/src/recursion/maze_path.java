//package recursion;
//
//import java.util.Scanner;
//
//public class maze_path {
//	public static int maze(int row , int col , int n , int m) {
//		if(row==n || col==m) return 1 ;
//		int rightway = maze(row+1,col,n,m);
//		int lefthtway = maze(row,col+1,n,m);				
//		return rightway + lefthtway ;
//	}
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("enter a N ");
//		int n = sc.nextInt();
//		System.out.print("enter a M ");
//		int m = sc.nextInt();
//		System.out.println("no of ways "+maze(1,1,n,m));
//	}
//
//}

//*********************************************( use only two veriable veriable )**********************************************************************

package recursion;

import java.util.Scanner;

public class maze_path {
	public static int maze(int n , int m) {
		if(n==1 || m==1) return 1 ;
		int rightway = maze(n-1,m);
		int lefthtway = maze(n,m-1);				
		return rightway + lefthtway ;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a N ");
		int n = sc.nextInt();
		System.out.print("enter a M ");
		int m = sc.nextInt();
		System.out.println("no of ways "+maze(n,m));    // use only two variable
	}

}
