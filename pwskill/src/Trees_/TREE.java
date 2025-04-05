package Trees_;



//                a(1)
//              /      \
//           b(2)       c(3)
//          /    \      /    \
//        d(4)  e(5)   f(6)  g(7)
//                     \
//                     h(8)

//..............a(1)
//............/      \
//.........b(2)       c(3)
//......../    \      /    \
//......d(4)  e(5)   f(6)  g(7)
//...................\
//...................h(8)

public class TREE {

	public static void main(String[] args) {

		node a = new node(1);  // Root node  
		node b = new node(2);  
		node c = new node(3);  
		node d = new node(4);  
        node e = new node(5);  
        node f = new node(6);  
        node g = new node(7);  
        node h = new node(8);
        
        a.left = b; a.right = c;  
        b.left = d; b.right = e;  
        c.left = f; c.right = g; 
        f.right = h;
	}

}
