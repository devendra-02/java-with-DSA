package Trees_;

//             a(1)
//            /   \
//         b(2)   c(3)
//        /    \  
//       d(4)   e(5)
//      /   \      \
//     f(6)   g(7)  h(8)
//            /       \
//          i(9)       j(10)
//         /    \        \
//       k(11)  l(12)    m(13)

//  longest path in it 11 → 9 → 7 → 4 → 2 → 5 → 8 → 10 → 13

public class Diameter_of_binary_tree_543 {
	
	// bed code because of time complexity is (n square) 
	// because of recursion use in recursion function
	private static int levels(node a) {
		if(a==null) return 0;
		
		int levels = 1 + Math.max(levels(a.left) , levels(a.right)) ;
		return levels ;
	}
	public static int diameterOfBinaryTree(node root) {
        if(root==null) return 0;
        
        int rootdia = levels(root.left) + levels(root.right) ;
        int leftdia = diameterOfBinaryTree(root.left);
        int rightdia = diameterOfBinaryTree(root.right);
        
        return Math.max(rootdia, Math.max(leftdia, rightdia)) ;
    }
	
	// good code because of time complexity is (n)
	static int diameter ;
	private static int levelssss(node root) {
		if(root==null) return 0;
		
        int leftdia = levelssss(root.left);
        int rightdia = levelssss(root.right);
        int rootdia = leftdia + rightdia ;
        diameter = Math.max(diameter, rootdia);
        
		int levels = 1 + Math.max(leftdia , rightdia) ;
		return levels ;
	}
	public static int diameterOfTree(node root) {
        if(root==null) return 0;
        diameter = 0 ;
        levelssss(root) ;
        return diameter ;
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
        node i = new node(9);  
        node j = new node(10);  
        node k = new node(11);  
        node l = new node(12);  
        node m = new node(13);  
 
        a.left = b; a.right = c;  
        b.left = d; b.right = e;  
        d.left = f; d.right = g;  
        g.left = i;  
        i.left = k; i.right = l;  
        e.right = h;  
        h.right = j;  
        j.right = m;
        
        int largestdiameter = diameterOfBinaryTree(a) ;
        System.out.println("largest diameter of binary tree is "+largestdiameter);
        
        int largediamtr = diameterOfTree(a) ;
        System.out.println("diameter using best method "+largediamtr);
	}

}
