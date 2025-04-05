package Queues;

import java.util.Deque;
import java.util.LinkedList;

public class Deque_ {
	public static void main(String[] args) {
		Deque<Integer> de = new LinkedList<Integer>();
		de.addLast(1);
		de.addLast(2);
		de.addLast(3);
		
		de.addLast(4);    // to add at last 
		System.out.println(de);
		
		de.addFirst(5);   // to add at first 
		System.out.println(de);
		
		de.removeFirst();  // to remove first 
		System.out.println(de);
		
		de.removeLast();   // to remove last 
		System.out.println(de);
		
		// give first element
		System.out.println("peek first "+de.peekFirst());
		
		// give last element 
		System.out.println("peek last "+de.peekLast());
		
		de.removeAll(de);   // remove all elements 
		System.out.println(de);
		
		de.addLast(1); de.addLast(2); de.addLast(1); de.addLast(4); de.addLast(1); de.addLast(8); 
		System.out.println(de);
		
		de.removeFirstOccurrence(1) ;  // from starting jaha 1 aara h use remove krta h 
		System.out.println(de);
		
		de.removeLastOccurrence(1) ;  // from last jaha 1 aara h use remove krta h 
		System.out.println(de);
		
	}
}
