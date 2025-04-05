package stake;

import java.util.Stack;   // compulsory for using stack in java 

public class Basics {

	public static void main(String[] args) {
		
//		Syntax of stake  
//		Stack<data type> name = new Stack<>();
		
		Stack<Integer> st = new Stack<>();
		
		// use to check stack is empty or not 
		System.out.println("is stake is empty :"+st.isEmpty());
		st.push(1);  // to insert element in stake 
		st.push(4);
		st.push(6);
		st.push(8);
		st.push(2);
		System.out.println(st);
		
		System.out.println("agter insert element at top ");
		st.push(3);
		st.push(5);
		
		System.out.println(st);
		
		// this remove element from top and return value of top element
		// st.pop() ;  
		 
		// element is removed and returned
		System.out.println(st.pop()+" is removed from stake "); 
		System.out.println(st);
		
		// it return the top element but can not remove 
		st.peek(); 
		System.out.println("top most element is "+st.peek());
		
		// return the size of element 
		st.size(); 
		System.out.println("size of stake is "+st.size());
		
		System.out.println("is stake is empty :"+st.isEmpty());
		
		System.out.println("adsfadsfadsfasdfasdfsdf");
		String s = "(" ;
		String d = "(" ;
		if(s==d) System.out.println("dfsdfsdfsdf");
	}
	
}
