package Trees_;

//  my tree is given bellow every node has two node 

//             1
//      4          3
//    2   6      7   5
//          8 
public class Display {

	
//	 This is for BFS        // ** not correct** 
	
//	public static void displayBFS(node a , int n) {
//		if (a==null) {
//			return;
//		}
//		if(n==1) {
//			System.out.print(a.val+", ");
//			n++ ;
//		}
//		if(a.left!=null) {
//			System.out.print(a.left.val+", ");
//		}
//		if(a.right!=null) {
//			System.out.print(a.right.val+", ");
//		}
//		displayBFS(a.left , n);
//		displayBFS(a.right , n);
//	}
	
	
	public static void displayDFS(node a) {
		if (a==null) {
			return;
		}
		
		// display the current node 
		System.out.print(a.val+", ");
		
		displayDFS(a.left);
		displayDFS(a.right);
	}
	
	public static void main(String[] args) {
		node a = new node(1);
		node b = new node(4);
		node c = new node(3);
		node d = new node(2);
		node e = new node(6);
		node f = new node(5);
		node g = new node(7);
		node h = new node(8);
		a.left = b ; a.right = c ;
		b.left = d ; b.right = e ;
		c.left = g ; c.right = f ;
		e.right = h ;
		
//		System.out.println("Breath first search ");
//		displayBFS(a,1);
		
		System.out.println();
		
		System.out.println("Depth first search ");
		displayDFS(a);
	}

}
