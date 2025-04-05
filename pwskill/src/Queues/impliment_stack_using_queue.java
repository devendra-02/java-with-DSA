package Queues;

import java.util.*;

class MyStack {
    Queue<Integer> t;

    public MyStack() {
        t = new LinkedList<>();
    }

    public void push(int x) {
        t.add(x);
        int size = t.size();
        for (int i = 0; i < size - 1; i++) {
            t.add(t.remove());
        }
    }

    public int pop() {
        return t.remove();
    }

    public int top() {
        return t.peek();
    }

    public boolean empty() {
        return t.isEmpty();
    }
}

public class impliment_stack_using_queue {

	public static void main(String[] args) {
		MyStack obj = new MyStack();
		// Check if stack is empty initially
        System.out.println(obj.empty()); // Expected output: true

        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.push(5);

        System.out.println(obj.top());   // Expected output: 5
        System.out.println(obj.pop());   // Expected output: 5
        System.out.println(obj.top());   // Expected output: 4

        obj.push(6);
        obj.push(7);
        System.out.println(obj.top());   // Expected output: 7
        System.out.println(obj.pop());   // Expected output: 7
        System.out.println(obj.top());   // Expected output: 6

        System.out.println(obj.empty()); // Expected output: false (Stack is not empty yet)
	}

}
