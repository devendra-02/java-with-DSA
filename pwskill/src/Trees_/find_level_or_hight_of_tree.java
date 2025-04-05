package Trees_;

//  HIGHT = LEVEL - 1
// for level check in code of diplay.java 
public class find_level_or_hight_of_tree {

	public static int levels(node a) {
		if(a==null) return 0;
		int levels = 1 + Math.max(levels(a.left) , levels(a.right)) ;
		return levels ;
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
		
		int level =levels(a);
		System.out.println("levels of tree is : "+level);
		
		System.out.println("hight of tree is : " + (level-1));
	}

}
