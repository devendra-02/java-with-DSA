

package linked_list;

class findlist{
	int val ;
	findlist next ;
	findlist() {}
	findlist(int val, findlist next) { this.val = val; this.next = next; }
	
	
	public findlist(int val) {
		this.val = val ;
	}
}
public class find_middle_node_876 {
	
	public static void print(findlist head) {
		findlist temp = head ; // it is a shallow copy jiske pas node a ka pura excess h 
//		for(int i=1;i<=5;i++) { // or
			while(temp!=null) {
			System.out.print(temp.val+" ");
			temp = temp.next ;
		}
	}
	
//    public static findlist midnode(findlist node) {        // it has more time complexity
//    	int size = 0 ;
//    	findlist temp = node ;
//    	while(temp!=null){
//    	temp = temp.next ;
//    	size++ ;
//    	}
//    	
//    	size = size/2 + 1;
//    	temp = node ;
//    	for(int i=1;i<size;i++) {
//    		temp = temp.next ;
//    	}
//    	return temp ;
//    }
	
//	public static findlist midnode(findlist node) {     // it has very less time complexity
//		findlist slow ;
//		findlist fast ;
//		slow=fast=node ;
//		while(fast.next!=null ) {
//			slow = slow.next ;
//			fast = fast.next.next ;
//			if(fast==null) {
//				return slow ;
//			}
//		}
//		return slow ;
//	}
	
//	**************************** OR *********************************************************
	
	public static findlist midnode(findlist node) {     // it has very less time complexity
	findlist slow ;
	findlist fast ;
	slow=fast=node ;
	while(fast!=null && fast.next!=null ) {    // is me pehle fast aayega fir fast.next ye  change nhi hogi dry run kr ke dekh
		slow = slow.next ;
		fast = fast.next.next ;
		
	}
	return slow ;
}
	
	public static void delet(findlist node) {
		
	}
    
	public static void main(String[] args) {
		findlist a = new findlist(11);
		findlist b = new findlist(12);
		findlist c = new findlist(13);
		findlist d = new findlist(14);
		findlist e = new findlist(15);
		
		a.next = b ;
		b.next = c ;  
		c.next = d ;  
		d.next = e ;
		
		print(a);
		
		System.out.println();
		System.out.println("middle element "+midnode(a).val);
		
		delet(e);
			}
}
