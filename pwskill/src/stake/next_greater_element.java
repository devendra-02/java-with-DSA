package stake;
import java.util.Stack;

public class next_greater_element {

    public static int[] nextGreater(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];

        // Initialize answer array with -1 (default for elements without NGE)
        for (int i = 0; i < n; i++) {
            ans[i] = -1;
        }

        Stack<Integer> st = new Stack<>();

        // Traverse the array from right to left
        for (int i = n - 1; i >= 0; i--) {
            // Pop elements from stack while they are smaller than the current element
            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }

            // If stack is not empty, then the top element is the next greater element
            if (!st.isEmpty()) {
                ans[i] = st.peek();
            }

            // Push current element to stack
            st.push(arr[i]);
        }
        
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 1, 8, 6, 3, 4};
        int[] ans = nextGreater(arr);

        // Print the next greater elements
        for (int num : ans) {
            System.out.print(num + " ");
        }
    }
}
