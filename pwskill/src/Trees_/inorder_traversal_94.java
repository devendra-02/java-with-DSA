package Trees_;
import java.util.*;

//..............a(1)
//............/      \
//.........b(2)       c(3)
//......../    \      /    \
//......d(4)  e(5)   f(6)  g(7)
//...................\
//...................h(8)

public class inorder_traversal_94 {

	public static List<Integer> inorderTraversal(node root) {
        List<Integer> result = new ArrayList<Integer>();
		Stack<node> st = new Stack<node>();
		node temp = root ;
		while(true) {
			if(temp!=null) {
				st.push(temp);
				temp = temp.left ;
			}
			else {
				if(st.size()==0) break ;
				
				node top = st.pop();
				result.add(top.val);
				temp = top.right ;
			}
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
        
        a.left = b; a.right = c;  
        b.left = d; b.right = e;  
        c.left = f; c.right = g; 
        f.right = h;
        
        List<Integer> ans = inorderTraversal(a);
        System.out.println(ans);
	}

}
