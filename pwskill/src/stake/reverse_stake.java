package stake;

import java.util.Stack;

public class reverse_stake {

	public static void main(String[] args) {
		Stack<Integer> a = new Stack<>();
		
		a.push(1);  // to insert element in stake 
		a.push(4);
		a.push(6);
		a.push(8);
		a.push(2);
		a.push(3);
		a.push(5);
		
		System.out.println("before ");
		System.out.println(a);
		
		Stack<Integer> b = new Stack<Integer>(); // new stack
		
		while(a.isEmpty()!=true) {  // run until stack is empty
			b.push(a.pop());
		}
		
		System.out.println("after reverse ");
		System.out.println(b);
	}

}
