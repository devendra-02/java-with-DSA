package Queues;

import java.util.*;

class MyQueue {
	
	Stack<Integer> st ;
	Stack<Integer> temp ;
    public MyQueue() {
        st = new Stack<Integer>();
        temp = new Stack<Integer>();
    }
    
    public void push(int x) {
        while(!st.isEmpty()) {
        	temp.push(st.pop()) ;
        }
        temp.push(x);
        while(!temp.isEmpty()) {
        	st.push(temp.pop()) ;
        }
    }
    
    public int pop() {
    	int x = st.peek();
        st.pop() ;
        return x ;
    }
    
    public int peek() {
        return st.peek();
    }
    
    public boolean empty() {
        return st.isEmpty();
    }
}
public class implement_queue_using_stack {

	public static void main(String[] args) {
		
	}

}
