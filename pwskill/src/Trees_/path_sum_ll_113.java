package Trees_;
import java.util.*;
public class path_sum_ll_113 {

	public static List<Integer> deepcopy(List<Integer> arr) {
		List<Integer> copy = new ArrayList<Integer>();
		for(int ele : arr) {
			copy.add(ele);
		}
		return copy ;
	}
	public static void help(node root , int target , List<Integer> arr , List<List<Integer>> ans ) {
		if(root==null) return ;
		if(root.left==null && root.right==null ) {
			if(root.val==target) {
				arr.add(root.val);
				ans.add(arr);
			}
			return ;
		}
		arr.add(root.val) ;
		List<Integer> arr1 = deepcopy(arr);
		List<Integer> arr2 = deepcopy(arr);
		help(root.left, target-root.val, arr1, ans);
		help(root.right, target-root.val, arr2, ans);
	}
	public static List<List<Integer>> pathSum(node root, int targetSum) {
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		List<Integer> arr = new ArrayList<Integer>();
		help(root, targetSum, arr, ans);
		return ans ;
    }
	public static void main(String[] args) {
		
		node root = new node(5);  // Root node  
        node n1 = new node(4);  
        node n2 = new node(8);  
        node n3 = new node(11);  
        node n4 = new node(13);  
        node n5 = new node(4);  
        node n6 = new node(7);  
        node n7 = new node(2);  
        node n8 = new node(5);  
        node n9 = new node(1);  

        root.left = n1;  root.right = n2;  
        n1.left = n3;  
        n2.left = n4;  n2.right = n5;  
        n3.left = n6;  n3.right = n7;  
        n5.left = n8;  n5.right = n9;
        
        List<List<Integer>> ans = pathSum(root, 22);
        System.out.println(ans);
	}

}
