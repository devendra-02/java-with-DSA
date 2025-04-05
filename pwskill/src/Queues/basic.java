package Queues;

import java.util.LinkedList;
import java.util.Queue;

import java.util.*;  // it import everything like linked list , queue ,Scanner etc  
public class basic {

	public static void main(String[] args) {
		
		Queue<Integer> t = new LinkedList<Integer>();
		System.out.println("is quey is empty -"+t.isEmpty());
		t.add(1);
		t.add(2);
		t.add(3);
		t.add(4);
		t.add(5);
		System.out.println("size of queue "+t.size());
		System.out.println(t);
		System.out.println("is quey is empty -"+t.isEmpty());
		t.remove() ; // it remove the the element which is added first 
		             // it also return a valve
		System.out.println(t);
		t.poll();  // same as remove 
		System.out.println(t);
		System.out.println(t.peek()); // print top element which is added first 
		System.out.println(t.element());  // same as t.peek()
		System.out.println("size of queue "+t.size());
		
	}

}
