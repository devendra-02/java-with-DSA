package Trees_;

import java.util.*;

public class Binary_Tree_Level_Order_Traversal_102 {
	
	// return level
	public static int levels(node a) {
		if(a==null) return 0;
		
		int levels = 1 + Math.max(levels(a.left) , levels(a.right)) ;
		return levels ;
	}
	
	public static void NthLevel(node root , int level , int nthlevel , List<Integer> arr) {
		if(root==null){
			return ;
		}
		if(level==nthlevel) arr.add(root.val);
		NthLevel(root.left, level+1 , nthlevel , arr);
		NthLevel(root.right, level+1 , nthlevel , arr);
	}
	
	public static List<List<Integer>> levelOrder(node root) {
        List<List<Integer>> ans = new ArrayList<>();
        int levels = levels(root) ;  // one base indexing 
        
        for(int i=0;i<=levels-1;i++) {
        	List<Integer> arr = new ArrayList<>();
        	NthLevel(root,0,i,arr);    // then print level i 
        	ans.add(arr) ;
        }
        return ans ;
    }
	
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
        
        List<List<Integer>> ans = levelOrder(a);
        System.out.println(ans);
	}
}
