package stake;

import java.util.Stack;

public class push_at_index {

	public static void pushatbottom(int ele , Stack<Integer> a) {
		Stack<Integer> b = new Stack<>();
		while(a.isEmpty()!=true) {  // run until stack is empty
			b.push(a.pop());
		}
		a.push(ele);
		while(b.isEmpty()!=true) {  // run until stack is empty
			a.push(b.pop());
		}
	}
	
	public static void pushatindx(int ele ,int indx , Stack<Integer> a) {
		Stack<Integer> b = new Stack<>();
		while(a.size()-indx+1!=0) {  // no need to use decrement because every iteration size is calculated 
			b.push(a.pop());
		}
		a.push(ele);
		while(b.isEmpty()!=true) {  // run until stack is empty
			a.push(b.pop());
		}
	}
	public static void main(String[] args) {
		Stack<Integer> a = new Stack<>();
		
		a.push(1);  // to insert element in stake 
		a.push(2);
		a.push(3);
		a.push(4);
		a.push(5);
		a.push(6);
		a.push(7);
		
		System.out.println("before ");
		System.out.println(a);
		
//		push at bottom 
		pushatbottom(9 , a);
		System.out.println("after push at buttom");
		System.out.println(a);
		
		
//		push at index
		pushatindx(8,4, a);
		System.out.println("insert 8 at index 4");
		System.out.println(a);
		
	}

}
