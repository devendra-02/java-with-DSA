package array_basic;

public class coppy_of_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr = {18,46,65,76,54};
		for(int ele : arr) {
			System.out.print(ele+" ");
		}
		System.out.println();
		int[]num = arr;
		for(int ele : num) {
			System.out.print(ele+" "); 
		}
	}

}
