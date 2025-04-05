//package recursion;
//
//public class print_all_ele_of_array {
//	
//	public static void print(int i,int arr[]) {
//		if(i==arr.length) return ;
//		System.out.print(" "+arr[i]);
//		print(i+1, arr);
//	}
//	public static void main(String[] args) {
//		int[] arr = {4,7,1,3,8,6,9,3,6};
//		for(int ele : arr)
//			System.out.print(" "+ele);
//		System.out.println();
//		System.out.println(" print by recurson ");
//		print(0,arr) ;
//		
//	}
//
//}

//**************************( in string )*******************************************************************************************

package recursion;

public class print_all_ele_of_array {
	
	public static void print(int i,String s) {
		if(i==s.length()) return ;
		System.out.print(" "+s.charAt(i));
		print(i+1,s);
	}
	public static void main(String[] args) {
		String s = "devendra gautm" ;
		print(0,s) ;
		
	}

}
