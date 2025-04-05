package _2D_Array;

import java.util.ArrayList;
import java.util.List;

public class _2D_arraylist {

	public static void main(String[] args) {
		
		List<Integer> a = new ArrayList<>() ;
		a.add(10) ; a.add(20) ;a.add(30) ;
		
		List<Integer> b = new ArrayList<>() ;
		b.add(40) ; b.add(50) ;
		
		List<Integer> c = new ArrayList<>() ;
		
		List<Integer> d = new ArrayList<>() ;
		d.add(60) ;
		
		//  2D array list me puri list add hoti h naki elements
		
		ArrayList<List<Integer>> arr = new ArrayList<>() ;
		arr.add(a) ; arr.add(b) ;arr.add(c); arr.add(d) ;
		
		// print syntex 
		
		for(int i=0;i<arr.size();i++) {
			for(int j=0;j<arr.get(i).size();j++) {
				System.out.print(arr.get(i).get(j)+" ");
			} 
			System.out.println();
			}

	}

}
