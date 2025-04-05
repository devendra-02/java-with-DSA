package linked_list;

class reverse{
	
	void print(singlell a) {
		singlell temp = a ;   // this is a shallow copy 
		 while(temp!=null) {
			 System.out.print(temp.val+" ");
			 temp=temp.next ;
		 }
		System.out.println();
	 }
	
	void reverselist(singlell head) {
		singlell c = head ;
		singlell n = head ;
		singlell p = null ;
			while(n!=null) {
				n = c.next ;
				c.next = p ;
				p = c ;
				c = n ;
			}
		}

	    public singlell reverseBetween(singlell head, int left, int right) {
	        if(left==right ) return head ;
	        singlell temp = head ;
	        singlell a = null ;
	        singlell b = null ;
	        singlell c = null ;
			singlell d = null ;
			int n = 1 ;
			while(temp!=null) {
				if(n==left-1) a = temp;
	            if(n==left) b = temp;
	            if(n==right) c = temp;
	            if(n==right+1) d = temp;

				temp = temp.next ;
				n++ ;
			}
			
			if(a!=null) a.next = null ;
			if(c!=null) c.next = null ;
			
			reverselist(b);
			if(a!=null) a.next = c ;
			b.next = d ;
			if(a==null) return c ;
			return head ;
	    }
}
public class reverse_linked_list_ll_92 {

	public static void main(String[] args) {
		reverse list = new reverse();
		singlell a = new singlell(7);
		singlell b = new singlell(9);
		singlell c = new singlell(7);
		singlell d = new singlell(6);
		singlell e = new singlell(8);
		singlell f = new singlell(5);
		singlell g = new singlell(4);
//		singlell h = new singlell(9);
//		singlell i = new singlell(2);
//		singlell j = new singlell(1);
		
		a.next = b ;
		b.next = c ;  
		c.next = d ;  
		d.next = e ;
		e.next = f ;
		f.next = g ;
//		g.next = h ;
//		h.next = i ;
//		i.next = j ;
		
		System.out.println("before reversrsing ");
		list.print(a);
		System.out.println("afer reversrsing ");
		list.print(list.reverseBetween(a, 3, 6));
	}

}
