package Trees_;
import java.util.*;

//..............a(1)             level - 0
//............/      \         
//.........b(2)       c(3)       level - 1
//......../    \      /    \   
//......d(4)  e(5)   f(6)  g(7)  level - 2
//...................\         
//...................h(8)        level - 3

public class print_element_of_Nth_level {

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
		Scanner sc = new Scanner(System.in);
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
        
        System.out.print("enter the level you want to print : ");
        n = sc.nextInt();
        NthLevel(a, 0);
        
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
