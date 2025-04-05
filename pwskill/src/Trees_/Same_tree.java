package Trees_;

public class Same_tree {

	public static boolean isSameTree(node p, node q) {
		
		// check node values
		if (p == null && q == null) return true; // if both are leaf node 
        if (p == null || q == null) return false; // One node is empty, the other is not
        if (p.val != q.val) return false; // if values are not same 
        
        if(isSameTree(p.left, q.left)==false) return false ;
        if(isSameTree(p.right, q.right)==false) return false ;
        
        return true ;

    }
	public static void main(String[] args) {
		
		// first tree
		node a = new node(1);
		node b = new node(2);
		node c = new node(3);
		node d = new node(4);
		node e = new node(5);
		node f = new node(6);
		node g = new node(7);
		a.left = b ; a.right = c ;
		b.left = d ; b.right = e ;
		c.left = g ; c.right = f ;
		
		// second tree
		node aa = new node(1);
		node bb = new node(2);
		node cc = new node(3);
		node dd = new node(4);
		node ee = new node(5);
		node ff = new node(6);
		node gg = new node(7);
		aa.left = bb ; aa.right = cc ;
		bb.left = dd ; bb.right = ee ;
		cc.left = gg ; cc.right = ff ;
		
		if(isSameTree(a, aa)==true) {
			System.out.println("both trees are same ");
		}else {
			System.out.println("both trees are not same ");
		}
	}

}
