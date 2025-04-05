package stake;

import java.util.Stack;

public class copy_st_in_another_st_in_same_order {

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
		System.out.println(a+"\n");
		
		Stack<Integer> temp = new Stack<Integer>(); // temporary stack
		while(a.isEmpty()!=true) {  // run until stack is empty
			temp.push(a.pop());
		}System.out.println("afre copy in temp stack");
		System.out.println(temp+"\n");
		
		Stack<Integer> b = new Stack<Integer>(); // new stack
		while(temp.isEmpty()!=true) {  // run until stack is empty
			b.push(temp.pop());
		}
		System.out.println("after copy ");
		System.out.println(b+"\n");
		
		System.out.println("reversed arr \n"
				+b.reversed());    // reverse the stack
	}

}
