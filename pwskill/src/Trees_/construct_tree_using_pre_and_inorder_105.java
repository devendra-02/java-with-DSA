package Trees_;
import java.util.* ;
public class construct_tree_using_pre_and_inorder_105 {

		public node helper(int[] preorder, int[] inorder, int prelo, int prehi, int inlo, int inhi) {
	        if(prelo > prehi || inlo > inhi) return null;
	        node root = new node(preorder[prelo]);
	        int r = 0;
	        while(inorder[r] != preorder[prelo]) r++;
	        int leftsize = r - inlo;
	        root.left = helper(preorder, inorder, prelo + 1, prelo + leftsize, inlo, r - 1);
	        root.right = helper(preorder, inorder, prelo + leftsize + 1, prehi, r + 1, inhi);
	        return root;
	    }
    public node buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length ;
        return helper(preorder , inorder , 0 , n-1 , 0 , n-1 );
    }
	public static void main(String[] args) {
		
		// RUN ON LEET CODE ( Leet Code - 105 )
		
	}

}
