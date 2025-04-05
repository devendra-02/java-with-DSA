package linked_list;


class deletlist{
	int val ;
	deletlist next ;
	deletlist() {}
	deletlist(int val, deletlist next) { this.val = val; this.next = next ; }
	
	
	public deletlist(int val) {
		this.val = val ;
	}
}
public class delet_middle_node{
	
	public static void print(deletlist head) {
		deletlist temp = head ; 
			while(temp!=null) {
			System.out.print(temp.val+" ");
			temp = temp.next ;
		}
	}
	
	public static deletlist delet(deletlist node) {
		if(node.next==null) {
			System.out.println("only one ele") ;
			return null ;
		}
		deletlist slow ;
		deletlist fast ;
		slow=fast=node ;
		while(fast!=null && fast.next!=null ) {    // is me pehle fast aayega fir fast.next ye  change nhi hogi dry run kr ke dekh
			slow = slow.next ;
			fast = fast.next.next ;
			if(slow.next==null) {
				node.next = null ;
				return node ;
			}
		}
		System.out.println("middle element is "+slow.val);
		slow.val = slow.next.val ;
		slow.next = slow.next.next ;
		return node ;
	}
    
	public static void main(String[] args) {
		deletlist a = new deletlist(11);
		deletlist b = new deletlist(12);
		deletlist c = new deletlist(13);
		deletlist d = new deletlist(14);
		deletlist e = new deletlist(15);
		deletlist f = new deletlist(16);
		deletlist g = new deletlist(17);
		
		a.next = b ;
		b.next = c ;  
		c.next = d ;  
		d.next = e ;
		e.next = f ;
		f.next = g ;
		
		print(a);
		System.out.println();
		a=delet(a);
		print(a) ;
			}

	
}
