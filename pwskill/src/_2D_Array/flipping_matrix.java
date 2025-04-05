

//...............leetcode 861............


package _2D_Array;

public class flipping_matrix {
	public static void print(int[][] grid) {
		int r = grid.length ;
		int c = grid[0].length ;
	
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(grid[i][j]+" ");
				}
			System.out.println();
		}
	}

	public static void main(String[] args) {
	
		int[][] grid = {{0,1,1,1},{1,0,1,0},{1,1,0,0},};
		int r = grid.length , c = grid[0].length ;
		
		print(grid) ;
		System.out.println("after the row flip ");
	
		for(int i=0;i<r;i++) {
			if(grid[i][0]==0) {   //flip the row 
				for(int j=0;j<c;j++) {
					if(grid[i][j]==0) grid[i][j] = 1 ;
					else grid[i][j] = 0 ;
				} } }
		
		print(grid) ;
		System.out.println("after the column flip ");
		
		 
				for(int j=0;j<c;j++) {
					int noofzero = 0 , noofones = 0 ;
					for(int i=0;i<r;i++) {
						if(grid[i][j]==0) noofzero++ ;
						else noofones++ ;
					}
					if(noofzero>noofones) {
						for(int i=0;i<r;i++) {
					if(grid[i][j]==0) grid[i][j] = 1 ;
					else grid[i][j] = 0 ;
				} } }
		
				print(grid) ;
				
				int matrixScore = 0 ;
				int x = 1 ;
				for(int j=c-1;j>=0;j--) {
						for(int i=0;i<r;i++) {
							matrixScore = matrixScore + (grid[i][j]*x) ;
							}
						x = x*2 ;
						}
				System.out.println(matrixScore);
	}

}
