package _2D_Array;

public class add_two_matrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arra = {{1,5,1,1},{2,2,2,2},{3,3,3,3},{4,4,4,4}} ;
		int[][] arrb = {{1,1,1,1},{2,2,2,2},{3,3,3,3},{4,4,4,4}} ;
		
		int r = arra.length ;
		int c = arra[0].length ;
		
		int[][] sum = new int[r][c] ;
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<r;j++) {
				sum[i][j] = arra[i][j] + arrb[i][j] ;
			}
			
		}
		
		for(int[] ele : sum) {
			for(int x : ele )
				System.out.print(x+" ");
			System.out.println();
		}
	}

}