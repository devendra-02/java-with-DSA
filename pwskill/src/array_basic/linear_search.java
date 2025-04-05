package array_basic;
import java.util.Scanner;
public class linear_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//-------------------Q5: Find the element 'x' in the array. Take array and x as input.
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("enter a terget element ");
//		int x = sc.nextInt();
//		System.out.print("enter a size of arry ");
//		int s = sc.nextInt();
//		System.out.print("enter a element in arr ");
//		int[]arr = new int[s];
//		for(int i=0;i<s;i++) {
//			arr[i] = sc.nextInt();
//		}
//		boolean flag = false ;
//		for(int i=0;i<s;i++) {
//			if(arr[i] == x) {
//				flag = true ;
//			break ;  
//			}
//				
//		}
//		if(flag==true)System.out.println("yes "+x+" is present in arr");
//		else System.out.println("no "+x+" is not present in arr");
		
		
		
//--------------------------Q6: Find the maximum value out of all the elements in the array.
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("enter a size of arry ");
//		int s = sc.nextInt();
//		System.out.print("enter a element in arr ");
//		int[]arr = new int[s];
//		for(int i=0;i<s;i++) {
//			arr[i] = sc.nextInt();
//		}
//		
//		int largestno = Integer.MIN_VALUE ;  // Integer.MIN_VALUE   -   YE SBSE CHOTI VALUE HOTI H  0r  Integer.MAX_VALUE  FOR LARGEST VALUE
//		System.out.println(largestno);
//		for(int i=0;i<s;i++) {
////			if(arr[i]>largestno)
////				largestno = arr[i];
//			
//			largestno = Math.max(largestno,arr[i]);
//			}
//		System.out.println("largest no is "+ largestno);
	
//---------------------Q7: find the second largest element in the given array
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a size of arry ");
		int s = sc.nextInt();
		System.out.print("enter a element in arr ");
		int[]arr = new int[s];
		for(int i=0;i<s;i++) {
			arr[i] = sc.nextInt();
		}
		
		int largestno = Integer.MIN_VALUE ;  // Integer.MIN_VALUE   -   YE SBSE CHOTI VALUE HOTI H  0r  Integer.MAX_VALUE  FOR LARGEST VALUE
		System.out.println(largestno);
		for(int i=0;i<s;i++) {
//			if(arr[i]>largestno)
//				largestno = arr[i];
			
			largestno = Math.max(largestno,arr[i]);
			}
		
		int secondlar = Integer.MIN_VALUE ;
		for(int i=0;i<s;i++) {
			if(arr[i]!=largestno)
			if(arr[i]>secondlar)
				secondlar = arr[i];
			
//			if(arr[i]!=largestno)
//			secondlar = Math.max(secondlar,arr[i]);
		}
		System.out.println("largest no is "+ largestno);
		System.out.println("second largest no is "+ secondlar);
		
	}

}
