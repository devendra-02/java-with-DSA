

// detect that loop is present or not ( yes or not )

package linked_list;
class cycle{
	boolean detect(singlell head) {
		singlell slow ;
		singlell fast ;
		slow=fast=head ;
		while(fast!=null && fast.next!=null ) {    // is me pehle fast aayega fir fast.next ye  change nhi hogi dry run kr ke dekh
			slow = slow.next ;
			fast = fast.next.next ;
			if(slow==fast) {
				return true ;
			}
		}
		return false ;
	}
}
public class cycle_detection_141 {

	public static void main(String[] args) {
		cycle list = new cycle();
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
		h.next = d ; // create a cycle

		boolean cycle = list.detect(a);
		if(cycle==true) System.out.println("there is a cycle ");
		else System.out.println("not a cycle ");
	}

}
