package Queues;
import java.util.* ;
public class reverse_first_k_element {

	public static void main(String[] args) {
		Queue<Integer> t = new LinkedList<Integer>();
		t.add(1);
		t.add(2);
		t.add(3);
		t.add(4);
		t.add(5);
		t.add(6);
		t.add(7);
		t.add(8);
		t.add(9);
		System.out.println("before reverse \n"+t);
		
		int k = 4 ;    // how many element you want reverse 
		
		Stack<Integer> st = new Stack<Integer>();
		for(int i=1 ; i<=k ; i++) {
			st.push(t.remove()) ;
		}
		while(!st.isEmpty()) {
			t.add(st.pop()) ;
		}
		for(int i=1 ; i<=t.size()-k ; i++) {
			t.add(t.remove()) ;
		}
		System.out.println("after reverse first "+k+" element \n"+t);
	}

}
