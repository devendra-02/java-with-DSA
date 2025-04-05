package Trees_;

import java.util.*;
import java.util.Queue;

public class Level_Order_Traversal_using_queue_102 {
	static class pair{
		node nod ;
		int level ;
		pair(node nod , int level){
			this.nod = nod ;
			this.level = level ;
		}
	}
	
//	1st METHOD
//	without using return statement
	public static void LOT(node root) {
		int previouslvl = 0 ;
		Queue<pair> t = new LinkedList<pair>();
		if(root!=null) t.add(new pair(root,0)) ;
		
		while(!t.isEmpty()) {
			pair front = t.remove();
			node temp = front.nod ;
			int lvl = front.level ;
			
			if(previouslvl!=lvl) {
				System.out.println();
				previouslvl++ ;
			}
			System.out.print(temp.val+" ");
			if(temp.left!=null) t.add(new pair(temp.left , lvl+1)) ;
			if(temp.right!=null) t.add(new pair(temp.right , lvl+1));
		}
	}
	
//	2nd METHOD
//	using return statement
	public static int levels(node a) {
		if(a==null) return 0;
		
		int levels = 1 + Math.max(levels(a.left) , levels(a.right)) ;
		return levels ;
	}
	
	public static void lvloftrever(node root , List<List<Integer>> ans) {
		int previouslvl = 0 ;
		Queue<pair> t = new LinkedList<pair>();
		if(root!=null) t.add(new pair(root,0)) ;
		
		while(!t.isEmpty()) {
			pair front = t.remove();
			node temp = front.nod ;
			int lvl = front.level ;
			
			if(previouslvl!=lvl) {
				previouslvl++ ;
			}
			ans.get(lvl).add(temp.val);
			if(temp.left!=null) t.add(new pair(temp.left , lvl+1)) ;
			if(temp.right!=null) t.add(new pair(temp.right , lvl+1));
		}
	}
//	using return statement
	public static List<List<Integer>> levelOrder(node root) {
        List<List<Integer>> ans = new ArrayList<>();
        int levels = levels(root) ;  // one base indexing 
        
        for(int i=0;i<=levels-1;i++) {
        	List<Integer> arr = new ArrayList<>();
        	ans.add(arr) ;
        }
        lvloftrever(root , ans );
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
        
//    	1st METHOD
//    	without using return statement
        LOT(a);  // LOT - levelordertreversal
        
        System.out.println();
        
//    	2nd METHOD
//    	using return statement
        List<List<Integer>> ans = levelOrder(a);
        System.out.println(ans);
	}

}
