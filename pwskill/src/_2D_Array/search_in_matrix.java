package _2D_Array;

public class search_in_matrix {
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
		
		int[][] arr = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
		print(arr);
		int target = 16 ;
	
		
		int m = arr.length , n = arr[0].length ;
		int i = 0 , j = n-1 ;
		
		while(i<m && j>=0) {
			if(arr[i][j]==target) {
				System.out.println(target+" value is present at "+i+","+j+" index");
				return ;}
			else if(arr[i][j]>target) j-- ;   // go left 
			else i++ ;
		}
		System.out.println("element not present in it ");
	}

}
