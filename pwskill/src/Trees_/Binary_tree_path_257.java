package Trees_;

import java.util.ArrayList;
import java.util.List;

//             1
//           /   \
//         4       3
//       /  \     / \
//      2    6   7   5
//          /  
//         8 

public class Binary_tree_path_257 {

	public static void path(node root , String s , List<String> ans) {
		if(root==null) return ;
		if(root.right==null && root.left==null) {
			s += root.val ;
			ans.add(s);
			return ;
		}
		path(root.left, s+root.val+"->", ans);
		path(root.right, s+root.val+"->", ans);
	}
	public static List<String> binaryTreePaths(node root) {
        List<String> ans = new ArrayList<String>();
        path(root, "", ans);
        return ans ;
    }
	public static void main(String[] args) {
		node a = new node(1);
		node b = new node(4);
		node c = new node(3);
		node d = new node(2);
		node e = new node(6);
		node f = new node(5);
		node g = new node(7);
		node h = new node(8);
		a.left = b ; a.right = c ;
		b.left = d ; b.right = e ;
		c.left = g ; c.right = f ;
		e.left= h ;
		
		List<String> ans = binaryTreePaths(a);
		System.out.println(ans);
	}

}
