package _2D_Array;

public class spiral_form_of_matrix {
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
		// TODO Auto-generated method stub
		
		int[][] arr = {{1,2,3,4},{5,6,7,8},{9,1,2,3}} ;

		print(arr) ;
		int r = arr.length , c = arr[0].length ;
		
		int minr = 0 ,maxr = r-1 ,minc = 0 , maxc = c-1 ;
		
		while(minr<=maxr && minc<=maxc) {
			
			//left to right 
			for(int j=minc;j<=maxc;j++) {
				System.out.print(arr[minr][j]+" ");
			}
			minr++ ;
			//top to bottom
			if(minr>maxr || minc>maxc) break ;
			for(int i=minr;i<=maxr;i++) {
				System.out.print(arr[i][maxc]+" ");
			}
			maxc-- ;
			// right to left 
			if(minr>maxr || minc>maxc) break ;
			for(int j=maxc;j>=minc;j--) {
				System.out.print(arr[maxr][j]+" ");
			}
			maxr-- ;
			// bottomo to top 
			if(minr>maxr || minc>maxc) break ;
			for(int i=maxr;i>=minr;i--) {
				System.out.print(arr[i][minc]+" ");
			}
			minc++ ;
			
		}
	}

}
