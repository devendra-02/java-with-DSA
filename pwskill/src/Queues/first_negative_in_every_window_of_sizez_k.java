package Queues;

import java.util.*;

public class first_negative_in_every_window_of_sizez_k {

	static List<Integer> firstNegInt(int arr[], int k) {
		ArrayList<Integer> ans = new ArrayList<Integer>();
		Queue<Integer> t = new LinkedList<Integer>();
		
		int n = arr.length ;
		for(int i=0;i<n;i++) {     // adding negative value index
			if(arr[i]<0) t.add(i) ;
		}
		for(int i=0;i<n-k+1;i++) {
			while (!t.isEmpty() && t.peek() < i) {
                t.remove();
            }

            // Check if there's a valid negative number in the current window
            if (!t.isEmpty() && t.peek() <= i + k - 1) {
                ans.add(arr[t.peek()]); // First negative number in the window
            } else {
                ans.add(0); // No negative number in the window
            }    
		}
		return ans ;
    }
	public static void main(String[] args) {
		int[] arr = {12, -1, -7, 8, -15, 30, 16, 28} ;
		int k = 3 ;
		for(int ele : arr) {
			System.out.print(ele+"   ");
		}System.out.println();
		 List<Integer> result  = firstNegInt(arr, k) ;
		 System.out.println(result);
	}

}
