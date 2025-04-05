package array_basic;

public class passing_array_to_method {
	
	
//	public static void change(int x) {
//		x = 10 ;
//	}
////	    is concept ko pass by value  
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int x=5 ;                    
//		System.out.println(x);      
//		change(x);
//		System.out.println(x);
//	}

	public static void change(int[] arr) {
		arr[0]=55;
		                //  array ke case me  pass by refetence ota h
 	}
//	    is concept ko pass by refetence bolte h
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {10,20,30,40};
		System.out.println(arr[0]);
		change(arr);
		System.out.println(arr[0]);
	}
}
