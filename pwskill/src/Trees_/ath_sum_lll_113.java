package Trees_;

public class ath_sum_lll_113 {

	public static int help(node root , long target) {
		if(root==null) return 0 ;
		int count = 0 ;
		if(root.val==target) count++ ;
		count  = count + help(root.left, target-root.val) + help(root.right, target-root.val) ;
		return count ;
	}
	public static int pathSum(node root, int targetSum) {
        if(root==null) return 0 ;
        return help(root, targetSum) + pathSum(root.left, targetSum) + pathSum(root.right, targetSum) ;
    }
	public static void main(String[] args) {
		node root = new node(10);  // Root node  
        node n1 = new node(5);  
        node n2 = new node(-3);  
        node n3 = new node(3);  
        node n4 = new node(2);  
        node n5 = new node(11);  
        node n6 = new node(3);  
        node n7 = new node(-2);  
        node n8 = new node(1);  

        root.left = n1;
        root.right = n2;
        n1.left = n3;
        n1.right = n4;
        n2.right = n5;
        n3.left = n6;
        n3.right = n7;
        n4.right = n8;
        
        int n = pathSum(root, 8) ;
        System.out.println("no of path is : "+ n);
	}

}
