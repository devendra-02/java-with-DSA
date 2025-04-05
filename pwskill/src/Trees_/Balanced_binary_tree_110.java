package Trees_;
import java.util.*;

//..............a(1)
//............/      \
//.........b(2)       c(3)
//......../    \      /    \
//......d(4)  e(5)   f(6)  g(7)
//...................\
//...................h(8)

public class Balanced_binary_tree_110 {

	// bed code because of time complexity is (n square) 
	// because of recursion use in recursion function 
	public static int levels(node a) {
		if(a==null) return 0;
		int levels = 1 + Math.max(levels(a.left) , levels(a.right)) ;
		return levels ;
	}
	public static boolean isBalanced(node root) {
		if(root==null) return true ;
		
		int diff = Math.abs(levels(root.left) - levels(root.right)) ;
		if(diff>1) return false ;
		
//		boolean leftsubtree = isBalanced(root.left);
//		if(leftsubtree==false) return false ;
//		boolean rightsubtree = isBalanced(root.right);
//		if(rightsubtree==false) return false ;
//        return true ;
		
//		 ************** OR ***************
		
		return isBalanced(root.left) && isBalanced(root.right);

	}
	
	
	// good code because of time complexity is (n)
	static boolean ans ;
	public static int levelsssssss(node root) {
		if(root==null) return 0;
		int leftlevel = levelsssssss(root.left);
		int rightlevel = levelsssssss(root.right);
		
		int diff = Math.abs(rightlevel - leftlevel);
		if(diff>1) ans = false ;
		
		int levels = 1 + Math.max(leftlevel,rightlevel);
		return levels ;
	}
	
	public static boolean isBalanceded(node root) {
		ans = true;
		levelsssssss(root);
		return ans ;
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
        
        boolean isbal = isBalanced(a);
        if(isbal==true) {
        	System.out.println("Binary tree is balanced ");
        }else {
        	System.out.println("Binary tree is not balanced ");
        }
	}

}