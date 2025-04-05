package Queues;
import java.util.*;

public class Reorder_queue_using_stack {

	public static void main(String[] args) {
		Queue<Integer> t = new LinkedList<>();
		t.add(1);
		t.add(2);
		t.add(3);
		t.add(4);
		t.add(5);
		t.add(6);
		t.add(7);
		t.add(8);
		System.out.println(t);
		
		int n = t.size();
		Stack<Integer> st = new Stack<Integer>();
		for(int i=1;i<=n/2;i++) {
			st.push(t.remove());
		} // 5, 6, 7, 8
		
		while(!st.isEmpty()) {
			t.add(st.pop());
		}  // 5, 6, 7, 8, 4, 3, 2, 1
		
		for(int i=1;i<=n/2;i++) {
			st.push(t.remove());
		} // 4, 3, 2, 1
		
		while(!st.isEmpty()) {
			t.add(st.pop());
			t.add(t.remove());
		}  // 8, 4, 7, 3, 6, 2, 5, 1
		
		for(int i=1;i<=n;i++) {
			st.push(t.remove());
		} // empty
		
		while(!st.isEmpty()) {
			t.add(st.pop());
		}
		System.out.println(t);
	}

}
