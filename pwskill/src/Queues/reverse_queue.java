package Queues;
import java.util.*;
public class reverse_queue {

	public static void main(String[] args) {
		Queue<Integer> t = new LinkedList<Integer>();
		t.add(1);
		t.add(2);
		t.add(3);
		t.add(4);
		t.add(5);
		System.out.println("before reverse \n"+t);
		Stack<Integer> st = new Stack<Integer>();
		while(t.size()!=0) {
			st.push(t.remove()) ;
		}
		while(!st.isEmpty()) {
			t.add(st.pop()) ;
		}
		System.out.println("after reverse \n"+t);
	}

}
