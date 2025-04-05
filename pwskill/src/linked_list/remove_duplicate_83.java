package linked_list;

class removeduplicate{
	
	void print(singlell a) {
		singlell temp = a ;   // this is a shallow copy 
		 while(temp!=null) {
			 System.out.print(temp.val+" ");
			 temp=temp.next ;
		 }
		System.out.println();
	 }
	
	singlell duplicates(singlell head) {
		singlell atemp = head ;
		singlell btemp = head ;
		
		while(btemp!=null) {
			if(atemp.val!=btemp.val) {
				atemp.next = btemp ;
				atemp=btemp ;
			}
			btemp = btemp.next ;
		}
		atemp.next=null ;
		return head ;
	}
}
public class remove_duplicate_83 {

	public static void main(String[] args) {
		removeduplicate list = new removeduplicate();
		singlell a = new singlell(37);
		singlell b = new singlell(37);
		singlell c = new singlell(15);
		singlell d = new singlell(15);
		singlell e = new singlell(15);
		singlell f = new singlell(63);
		singlell g = new singlell(63);
		singlell h = new singlell(89);
		singlell i = new singlell(89);
		
		a.next = b ;
		b.next = c ;  
		c.next = d ;  
		d.next = e ;
		e.next = f ;
		f.next = g ;
		g.next = h ;
		h.next = i ;
		
		list.print(a);
		
		list.print(list.duplicates(a));
	}

}
