package Trees_;

public class tree_implimentation {

	public static void main(String[] args) {
		node a = new node(1);
		node b = new node(4);
		node c = new node(3);
		node d = new node(2);
		node e = new node(6);
		node f = new node(5);
		
		a.left = b ; a.right = c ;
		b.left = d ; b.right = e ;
		c.right = f ;
		
		System.out.println(a.left.right.val);
	}

}
