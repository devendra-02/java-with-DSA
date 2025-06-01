package _2D_Array;
public class Basics {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		
//		
//	int[][] arr = new int[2][3] ;
//	System.out.println("enter elements in array ");
//	
//	// length
//	
//	int r = arr.length ;  // no of rows
//	int c = arr[0].length ;     // no of columns 
//	
//	
//	// input 
//	
//	for(int i=0;i<r;i++) {
//		for(int j=0;j<c;j++) {
//			arr[i][j]=sc.nextInt()	;
//			}
//	}
//	//output
//	
//	for(int i=0;i<r;i++) {
//		for(int j=0;j<c;j++) {
//			System.out.print(arr[i][j]+" ");
//			}
//		System.out.println();
//	}
		
//..................................or...........................................................		
	
		//   input
		int[][] arr = {{1,2,3},{4,5,6}} ;
		
		// output 
		int n = arr.length ;
		System.out.println("zdfxdxddzdsfsdfsd"+n);
		for(int[] ele : arr) {
			for(int x : ele)
				System.out.print(x+" ");
		System.out.println();}
	}
}
