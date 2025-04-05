package Trees_;
import java.util.*;

//..............a(1)             level - 0
//............/      \         
//.........b(2)       c(3)       level - 1
//......../    \      /    \   
//......d(4)  e(5)   f(6)  g(7)  level - 2
//...................\         
//...................h(8)        level - 3

public class level_order_traversal_BF {

	public static void BFT(node root) {
		Queue<node> t = new LinkedList<node>();
		if(root!=null) t.add(root) ;
		
		while(!t.isEmpty()) {
			node temp = t.remove();
			System.out.print(temp.val+" ");
			if(temp.left!=null) t.add(temp.left);
			if(temp.right!=null) t.add(temp.right);
		}
	}
	
	public static void DFT(node root) {
		Stack<node> st = new Stack<node>();
		if(root!=null) st.add(root) ;
		
		while(!st.isEmpty()) {
			node temp = st.pop();
			System.out.print(temp.val+" ");
			if(temp.right!=null) st.push(temp.right);
			if(temp.left!=null) st.push(temp.left);
		}
	}
	
	// this will print the nth level of tree 
	public static void NthLevel(node root , int level) {  
		if(root==null){
			return ;
		}
		
		if(level==n) System.out.print(root.val+" ");
		NthLevel(root.left, level+1);
		NthLevel(root.right, level+1);
	}
	
	static int n ;
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
        
        System.out.println("Breath first treaversal ");
        BFT(a);
        
        System.out.println();
        
        System.out.println("Deafth first treaversal ");
        DFT(a);
        
        System.out.println();
        
        // if no of level in tree known 
        // hear no of level are 3 as you see in upper 
        System.out.println("level wise print ele");
        
        for(int i=0;i<=3;i++) {
        	n = i ;           // level no 
        	NthLevel(a,0);    // then print level i
        	
        	// if you remove this it work as a BFT
        	System.out.println();  
        }
	}

}