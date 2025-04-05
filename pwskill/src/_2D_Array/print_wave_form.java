package _2D_Array;

public class print_wave_form {
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
 
		int[][] arr = {{1,2,3},{5,6,7},{9,1,2},{4,5,6}} ;

		print(arr) ;
		int r = arr.length , c = arr[0].length ;
		
		System.out.println("wave form ");
		
		
		for(int i=0;i<r;i++) {
			if(i%2==0) {
				for(int j=0;j<c;j++){
				System.out.print(arr[i][j]+" "); 
				} }
			
				if(i%2!=0) {
					for(int j=c-1;j>=0;j--){
				System.out.print(arr[i][j]+" "); 
				
				} }
			}
	}

}
