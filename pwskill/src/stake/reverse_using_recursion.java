package stake;

import java.util.Stack;

public class reverse_using_recursion {

	public static void reverse(Stack<Integer> a) {
		if(a.isEmpty()) return ;
		int top = a.pop();
		System.out.print(top+", ");
		reverse(a);
		a.push(top);
	}
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

		System.out.println("after reverse ");
		reverse(a);
		
	}
}
