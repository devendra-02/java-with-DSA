package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class print_element {

	public static void main(String[] args) {
		Queue<Integer> t = new LinkedList<Integer>();
		Queue<Integer> u = new LinkedList<Integer>();
		t.add(1);
		t.add(2);
		t.add(3);
		t.add(4);
		t.add(5);
		
		while(t.size()>0) {
			System.out.print(" "+t.peek());
			u.add(t.remove());  // hear we also use t.poll();
		}
		System.out.println();
		while(u.size()>0) {
			t.add(u.poll());  // like hear  
		}
		System.out.println("t="+t);
		System.out.println("u="+u);
	}

}
