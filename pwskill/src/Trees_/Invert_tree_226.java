package Trees_;

public class Invert_tree_226 {

	public node invertTree(node root) {
		if(root == null) {
			return null ;
		}
		node temp = root.left;
		root.left = root.right;
		root.right = temp;
		
		invertTree(root.left);
		invertTree(root.right);
		
		return root;
    }
	public static void main(String[] args) {
		node a = new node(1);
		node b = new node(4);
		node c = new node(3);
		node d = new node(2);
		node e = new node(6);
		node f = new node(5);
		node g = new node(7);
		a.left = b ; a.right = c ;
		b.left = d ; b.right = e ;
		c.left = g ; c.right = f ;

	}

}