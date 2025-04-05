package Trees_;
import java.util.*;

//..............a(1)
//............/      \
//.........b(2)       c(3)
//......../    \      /    \
//......d(4)  e(5)   f(6)  g(7)
//...................\
//...................h(8)

public class postorder_traversal_145 {
	public static List<Integer> postorderTraversal(node root) {
        List<Integer> result = new ArrayList<Integer>();
		Stack<node> st = new Stack<node>();
		if(root!=null) st.push(root);
		while(!st.isEmpty()) {
			node temp = st.pop();
			result.add(temp.val) ;
			if(temp.left!=null) st.push(temp.left);
			if(temp.right!=null) st.push(temp.right);
		}
       Collections.reverse(result);  // use to reverse the list
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
        
        a.left = b; a.right = c;  
        b.left = d; b.right = e;  
        c.left = f; c.right = g; 
        f.right = h;
        
        List<Integer> ans = postorderTraversal(a);
        System.out.println(ans);
	}

}
