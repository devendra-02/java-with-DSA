package _2D_Array;

public class transpos_matrix {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,1,1},{2,2,2},{3,3,3},{4,4,4}} ;

		int r = arr.length ;
		int c = arr[0].length ;
	
	System.out.println(r+" "+c);
	
	for(int[] ele : arr) {
		for(int x : ele)
			System.out.print(x+" ");
	System.out.println();}

//	for the the transpos of matrix 
	
	System.out.println("After the transpos of matrix ");

	
	for(int i=0;i<c;i++) {                 
		for(int j=0;j<r;j++) {
			System.out.print(arr[j][i]+" ");// for trans "i" ki jgh "j" or "j" ki jgh "i"     
			}                               // for trans "c" ki jgh "r" or "r" ki jgh "c"    
		System.out.println();
	}
//.......................or.....................................................................
	System.out.println();
	
	for(int j=0;j<c;j++) {              //loop me i or j replce kr diye    
		for(int i=0;i<r;i++) {
			System.out.print(arr[i][j]+" ");
			}                                   
		System.out.println();
	}
	
//	store in new matrix 
	System.out.println("after stor in new array ");
	int[][] transpos = new int[c][r] ;
	
	for(int j=0;j<c;j++) {              //loop me i or j replce kr diye    
		for(int i=0;i<r;i++) {
			transpos[j][i] = arr[i][j] ;
			}      }                           
		
	for(int[] ele : transpos) {
		for(int x : ele)
			System.out.print(x+" ");
	System.out.println();}

	
	}
}
