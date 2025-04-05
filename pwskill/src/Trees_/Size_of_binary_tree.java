package Trees_;

// "size" = refers to the total number of nodes present in the tree

public class Size_of_binary_tree {
	
	private static int size(node a) {
		if(a==null) {
			return 0;
		}
		int ans_size = 1 + size(a.left) + size(a.right) ;
		
		return ans_size ;
	}
	public static void main(String[] args) {
		node a = new node(9);
		node b = new node(4);
		node c = new node(3);
		node d = new node(24);
		node e = new node(6);
		node f = new node(8);
		node g = new node(7);
		
		a.left = b ; a.right = c ;
		b.left = d ; b.right = e ;
		c.left = g ; c.right = f ;
		
		int size = size(a);
		System.out.println("size of binary tree = "+ size);
	}
}
