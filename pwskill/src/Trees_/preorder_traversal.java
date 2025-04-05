package Trees_;
import java.util.*;

//..............a(1)
//............/      \
//.........b(2)       c(3)
//......../    \      /    \
//......d(4)  e(5)   f(6)  g(7)
//...................\
//...................h(8)

public class preorder_traversal {
	public static List<Integer> preorderTraversal(node root) {
        List<Integer> result = new ArrayList<Integer>();
		Stack<node> st = new Stack<node>();
		
		if(root!=null) st.push(root);
		
		while(!st.isEmpty()) {
			node temp = st.pop();
			result.add(temp.val) ;
			if(temp.right!=null) st.push(temp.right);
			if(temp.left!=null) st.push(temp.left);
		}
		return result ;
    }
	public static void main(String[] args) {
		
		node a = new node(1);  // Root node  
		node b = new node(2);  
		node c = new node(3);  
		node d = new node(4);  
        node e = new node(5);  
        node f = new node(6);  
        node g = new node(7);  
        node h = new node(8);
        
        a.left = c; a.right = b;  
        b.left = d; b.right = e;  
        c.left = f; c.right = g; 
        f.right = h;
        
        List<Integer> ans = preorderTraversal(a);
        System.out.println(ans);
	}

}
