package stake;

import java.util.Stack;

class Min_Stack_155 {
    Stack<Integer> st;
    Stack<Integer> mst;

    public Min_Stack_155() {
        st = new Stack<>();
        mst = new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
        if (mst.isEmpty() || mst.peek() >= val) {
            mst.push(val);
        }
    }
    
    public void pop() {
        if (!st.isEmpty()) {
            if (st.pop().equals(mst.peek())) {  // Use equals() to avoid issues with int comparison
                mst.pop();
            }
        }
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return mst.peek();
    }

    public static void main(String[] args) {
    	Min_Stack_155 obj = new Min_Stack_155();
        obj.push(5);
        obj.push(2);
        obj.push(1);
        obj.push(3);
        System.out.println("Min: " + obj.getMin()); // 1
        obj.pop();
        obj.pop();
        System.out.println("Min after pops: " + obj.getMin()); // 2
        obj.pop();
        System.out.println("Min after pops: " + obj.getMin()); // 5
    }
}
