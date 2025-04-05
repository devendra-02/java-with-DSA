package linked_list;

class cyclenode{
	singlell startingnode(singlell head) {
		singlell slow ;
		singlell fast ;
		slow=fast=head ;
		while(fast!=null && fast.next!=null ) {    // is me pehle fast aayega fir fast.next ye  change nhi hogi dry run kr ke dekh
			slow = slow.next ;
			fast = fast.next.next ;
			if(slow==fast) {
				break ;
			}
		}
		if(fast==null || fast.next==null) {
			return null ;
		}
		singlell temp = head ;
		while(temp!=slow) {
			temp = temp.next;
			slow = slow.next;
		}
		return slow ;
	}
}
public class cycle_node_142 {

	public static void main(String[] args) {
		cyclenode node = new cyclenode();
		singlell a = new singlell(37);
		singlell b = new singlell(82);
		singlell c = new singlell(15);
		singlell d = new singlell(94);
		singlell e = new singlell(28);
		singlell f = new singlell(63);
		singlell g = new singlell(47);
		singlell h = new singlell(89);
		
		a.next = b ;
		b.next = c ;  
		c.next = d ;  
		d.next = e ;
		e.next = f ;
		f.next = g ;
		g.next = h ;
		h.next = d ; // hear is loop 
		
		singlell ans = node.startingnode(a);
		if(ans==null) {
			System.out.println("there is no loop ");
		}else {
			System.out.println("loop start at "+ans.val);
		}
	}

}
