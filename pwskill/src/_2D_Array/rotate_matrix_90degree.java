	// rotate matrix by 90 degrees clockwise.
package _2D_Array;

public class rotate_matrix_90degree {
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
	
		
		int[][] arr = {{1,1,1,1},{2,2,2,2},{3,3,3,3},{4,4,4,4}} ;

		print(arr) ;
		int r = arr.length , c = arr[0].length ;
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(i>=j) {
				int temp = arr[i][j] ;
				arr[i][j] = arr[j][i] ;
				arr[j][i] = temp ; }
			}  }
		
		System.out.println("After transpos ");
		
		print(arr) ;
	
		System.out.println("After moving 90 degree ");
		
		for(int i=0;i<r;i++) {
			int a=0 , b=c-1 ;
				while(a<=b) {
				int temp = arr[i][a] ;
				arr[i][a] = arr[i][b] ;
				arr[i][b] = temp ; 
				a++ ;
				b-- ;}
			 }
		print(arr) ;
	}

}
