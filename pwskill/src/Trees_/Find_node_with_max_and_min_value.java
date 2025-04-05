package Trees_;

public class Find_node_with_max_and_min_value {
	
	private static int maximum(node a) {
		if(a==null) {
			return 0;
		}
		
		int max = Math.max(a.val,Math.max( maximum(a.left) , maximum(a.right) ) );
		return max;
	}
	
	private static int minimum(node a) {
		if(a.left==null && a.right==null) {
			return a.val;
		}
		
		int min = Math.min(a.val,Math.min( minimum(a.left) , minimum(a.right) ) );
		
		return min ;
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
		
		int max = maximum(a) ;
		System.out.println("maximum value is - "+max);
		
		int min = minimum(a) ;
		System.out.println("maximum value is - "+min);
	}

}
