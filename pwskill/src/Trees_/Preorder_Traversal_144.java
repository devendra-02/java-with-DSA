package Trees_;
import java.util.* ;

// Types of traversals :-   in-order , pre-order , post-order traversal

//                1
//        2               3
//    4       5       6       7
//          8           9          
public class Preorder_Traversal_144 {
	
	public static void preorderwithnoreturn(node a) {
		if (a==null) { return; }
		
		
		
		System.out.print(a.val+", "); // display the current node 
		preorderwithnoreturn(a.left);
		preorderwithnoreturn(a.right);
	}

	public static List<Integer> preorder(node root) {
		List<Integer> result = new ArrayList<Integer>();
		if (root==null) { return result ; }
		
		result.add(root.val);// add the current node 
		 result.addAll(preorder(root.left));
	        result.addAll(preorder(root.right));
		
		return result ;
	}
	
	public static void postorder(node a) {
		if (a==null) { return; }
		
		postorder(a.left);
		System.out.print(a.val+", "); // display the current node 
		postorder(a.right);
	}
	
	public static void Inorder(node a) {
		if (a==null) { return; }
		
		Inorder(a.left);
		Inorder(a.right);
		System.out.print(a.val+", "); // display the current node 
	}
	
	public static void main(String[] args) {
		node a = new node(1);
		node b = new node(2);
		node c = new node(3);
		node d = new node(4);
		node e = new node(5);
		node f = new node(6);
		node g = new node(7);
		node h = new node(8);
		node i = new node(9);
		
		
		a.left = b ; a.right = c ;
		b.left = d ; b.right = e ;
		c.left = f ; c.right = g ;		
		e.left = h ; f.right = i ;		
		
		System.out.println("preorder ");
		List<Integer> result = preorder(a) ;
		System.out.println(result);
		
		System.out.println("preorderwithnoreturn ");
		preorderwithnoreturn(a);
		System.out.println();
		
		System.out.println("postorder ");
		postorder(a);
		System.out.println();

		
		System.out.println("Inorder ");
		Inorder(a);
		System.out.println();

	}

}