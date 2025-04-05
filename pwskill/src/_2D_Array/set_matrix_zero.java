// *******************bad code because r*c me travel kr ra h ************************************************** 

//package _2D_Array;
//public class set_matrix_zero {
//	
//	public static void print(int[][] arr) {
//		int r = arr.length ;
//		int c = arr[0].length ;
//	
//		for(int i=0;i<r;i++) {
//			for(int j=0;j<c;j++) {
//				System.out.print(arr[i][j]+" ");
//				}
//			System.out.println();
//		}
//	}
//
//	public static void main(String[] args) {
//
//		int[][] arr = {{1,1,0,2},{3,4,5,1},{0,3,1,5}} ;
//		int r = arr.length , c =arr[0].length  ;
//		print(arr);
//		System.out.println();
//		
//		int[][] help = new int[r][c] ;
//		for(int i=0;i<r;i++) {
//			for(int j=0;j<c;j++) {
//				help[i][j] = arr[i][j] ;
//			}  }
//		print(help) ;
//		System.out.println();
//		
//		for(int i=0;i<r;i++) {
//			for(int j=0;j<c;j++) {
//				if(help[i][j]==0) {
//					for(int b=0;b<c;b++) {
//						arr[i][b]=0 ;  }
//					for(int a=0;a<r;a++) {
//						arr[a][j]=0 ;  }
//				} }  }
//		print(arr);
//	}
//}

// ................good code because ye r+c me travel kr ra h .........................................................
//........isme r+c ke extra index use hore h 

//package _2D_Array;
//public class set_matrix_zero {
//	
//	public static void print(int[][] arr) {
//		int r = arr.length ;
//		int c = arr[0].length ;
//	
//		for(int i=0;i<r;i++) {
//			for(int j=0;j<c;j++) {
//				System.out.print(arr[i][j]+" ");
//				}
//			System.out.println();
//		}
//	}
//	
//	public static void main(String[] args) {
//		
//		int[][] arr = {{1,1,0,2},{3,4,5,1},{0,3,1,5}} ;
//		int r = arr.length , c =arr[0].length  ;
//		print(arr);
//		System.out.println();
//		
//		boolean[] row = new boolean[r] ;
//		boolean[] col = new boolean[c] ;
//		
//		for(int i=0;i<r;i++) {
//			for(int j=0;j<c;j++) {
//				if(arr[i][j]==0) { row[i]=true ; col[j]=true  ; }
//			}  }
//		
//		for(int i=0;i<r;i++) {
//			if(row[i]==true) {
//				for(int j=0;j<c;j++) {
//					arr[i][j]=0 ;
//				}	}	}
//		
//		for(int j=0;j<c;j++) {
//			if(col[j]==true) {
//				for(int i=0;i<r;i++) {
//					arr[i][j]=0 ;
//				}	}	}
//		print(arr);
//	}
//}

// ++++++++++ ye upr kr dono  se best h ++++++++++++++++++++++++++++
//+++++++isme extra index use ni hori isme 0th row or column as a indexuse hora h+++++++++++

package _2D_Array;
public class set_matrix_zero {
	
	public static void print(int[][] arr) {
		int r = arr.length ;
		int c = arr[0].length ;
	
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(arr[i][j]+" ");
				}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		int[][] arr = {{0,1,5,2},{3,4,5,1},{0,3,1,5}} ;
		int r = arr.length , c =arr[0].length  ;
		print(arr);
		System.out.println();
		
		boolean zeroinrow = false ;
		boolean zeroincol = false ;
		
		for(int i=0;i<r;i++) {
			if(arr[i][0]==0) zeroinrow = true ;
		}
		for(int j=0;j<c;j++) {
			if(arr[0][j]==0) zeroincol = true ;
		}
		
		
		for(int i=1;i<r;i++) {
			for(int j=1;j<c;j++) {
				if(arr[i][j]==0) { arr[i][0]=0 ; arr[0][j]=0  ; }
			}  }
		
		for(int i=1;i<r;i++) {   // set ith row to 0
			if(arr[i][0]==0) {
				for(int j=0;j<c;j++) {
					arr[i][j]=0 ;
				}	}	}
		
		for(int j=1;j<c;j++) {   // set jth columc to 0
			if(arr[0][j]==0) {
				for(int i=0;i<r;i++) {
					arr[i][j]=0 ;
				}	}	}
		if(zeroinrow == true){  // set 0th row to 0
			for(int i=0;i<r;i++) {
				arr[i][0]=0 ;
			} }
		if(zeroincol == true){   // set 0th column to 0
			for(int j=0;j<c;j++) {
				arr[0][j]=0 ;
			} }
		print(arr);
	}
}
