package Trees_;

public class Sum_of_tree_nodes {
	private static int sum(node a) {
		if(a==null) {
			return 0 ;
		}
		int sum = a.val+sum(a.left)+sum(a.right) ;
		return sum ;
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
	
	int sum = sum(a) ;
	System.out.println("sum of nodes = "+sum);
	}
}
