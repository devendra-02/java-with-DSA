package _2D_Array;

public class matrix_multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = {{1,2,1,2}};
		int[][] b = {{1,0,1},{2,1,0},{0,3,1},{1,2,3}};
		
		if (a[0].length != b.length) {
            System.out.println("Matrices cannot be multiplied");
            return ;
        }
		
		int[][] c = new int[a.length][b[0].length] ;
		
		for(int i=0;i<c.length;i++) {
			for(int j=0;j<c[0].length;j++) {
				c[i][j] = 0; 
				for(int k=0;k<b.length;k++) {
					c[i][j] = c[i][j] + a[i][k] * b[k][j] ;
				}
			}
		}
		
		for(int[] ele : c) {
			for(int x : ele)
				System.out.print(x+" ");
		System.out.println();}
	}

}
