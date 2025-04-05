//package _2D_Array;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//public class pascals_tree {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner (System.in);
//		System.out.println("enter the value of n ");
//		int n = sc.nextInt() ;
//		
//		ArrayList<List<Integer>> ans = new ArrayList<>() ;
//		
//		for(int i=0;i<n;i++) {
//			ArrayList<Integer> l = new ArrayList<>() ;
//			for(int j=0;j<=i;j++) {
//			l.add(1) ;
//			}
//			ans.add(l) ;
//		}
//		for(int i=2;i<n;i++) {
//			for(int j=1;j<=i-1;j++) {
//		ans.get(i).set(j, ans.get(i-1).get(j) + ans.get(i-1).get(j-1));
//			}
//		}
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<i;j++) {
//				System.out.print(ans.get(i).get(j)+" ");
//			} 
//			System.out.println();
//			}
//	}
//
//}

//.................................or................................................................................................................................................

package _2D_Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class pascals_tree {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the value of n ");
		int n = sc.nextInt() ;
		
		ArrayList<List<Integer>> ans = new ArrayList<>() ;
		
		for(int i=0;i<n;i++) {
			ArrayList<Integer> l = new ArrayList<>() ;
			for(int j=0;j<=i;j++) {
			if(j==0 || j==i) l.add(1) ;
			else {
				l.add(ans.get(i-1).get(j) + ans.get(i-1).get(j-1)) ; }
			}
			ans.add(l) ;
		}

		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(ans.get(i).get(j)+" ");
			} 
			System.out.println();
			}
	}

}
