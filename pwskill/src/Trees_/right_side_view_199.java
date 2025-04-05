package Trees_;

import java.util.*;

//..............a(1)             level - 0
//............/      \         
//.........b(2)       c(3)       level - 1
//......../    \      /    \   
//......d(4)  e(5)   f(6)  g(7)  level - 2
//...................\         
//...................h(8)        level - 3

public class right_side_view_199 {
	
	private static int levels(node a) {
		if(a==null)	return 0;
		
		int levels = 1 + Math.max(levels(a.left) , levels(a.right)) ;
		return levels ;
	}
	public static void NthLevel(node root , int level ,List<Integer> ans) {  
		if(root==null){
			return ;
		}
		
		if(level==n) {
			if(ans.size()==n) {
				ans.add(root.val) ;
			} else {
				ans.set(n,root.val);
			}
		}
		NthLevel(root.left, level+1 , ans);
		NthLevel(root.right, level+1 , ans);
		
		// for left side view use
//		NthLevel(root.right, level+1 , ans);
//		NthLevel(root.left, level+1 , ans);
	}

	public static List<Integer> rightSideView(node root) {
        List<Integer> ans = new ArrayList<Integer>();
        
        for(int i=0;i<=levels(root);i++) {
        	n = i ;           // level no 
        	NthLevel(root,0,ans);    // then print level i
        	
        	// if you remove this it work as a BFT
        	System.out.println();  
        }
        
        return ans ;
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
        
        System.out.println("level wise print ele");
        List<Integer> ans = rightSideView(a) ;
        System.out.println(ans);
	}

}