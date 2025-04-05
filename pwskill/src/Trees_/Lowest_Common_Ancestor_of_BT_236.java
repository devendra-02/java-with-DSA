package Trees_;

public class Lowest_Common_Ancestor_of_BT_236 {

	public static boolean exist(node root , node cnode) {
		if(cnode==root) return true ;
		if(root==null) return false;
		
		 //  if any one condition is true then return true otherwise return false
		return exist(root.left, cnode) || exist(root.right, cnode) ; 
	}
    public static node lowestCommonAncestor(node root, node p, node q) {
       if(p==root || q==root) return root ;
        
        boolean plieInLST = exist(root.left, p) ;
        boolean qlieInLST = exist(root.left, q) ;
        
        // both p and q are in left subtree
        if(plieInLST==true && qlieInLST==true) return lowestCommonAncestor(root.left, p, q);
        // both p and q are in right sub tree 
        if(plieInLST==false && qlieInLST==false) return lowestCommonAncestor(root.right, p, q) ;
        
        // booth p and q are in  different sub trees
        return root ;
    }
	public static void main(String[] args) {
		
		node a = new node(3);  // Root node
        node b = new node(5);
        node c = new node(1);
        node d = new node(6);
        node e = new node(2);
        node f = new node(0);
        node g = new node(8);
        node h = new node(7);
        node i = new node(4);

        a.left = b;  
        a.right = c;
        b.left = d;  
        b.right = e;
        c.left = f;  
        c.right = g;
        e.left = h;  
        e.right = i;
       
        node ans = lowestCommonAncestor(a,d,h );
        System.out.println("lowest Common Ancestor is : "+ans.val);
	}

}
