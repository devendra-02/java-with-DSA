//package linked_list;
//
//class reversell{
//	
//	void print(singlell a) {
//		singlell temp = a ;   // this is a shallow copy 
//		 while(temp!=null) {
//			 System.out.print(temp.val+" ");
//			 temp=temp.next ;
//		 }
//		System.out.println();
//	 }
//	
//	singlell reverse(singlell head) {
//		singlell c = head ;
//		singlell n = head ;
//		singlell p = null ;{
//			while(n!=null) {
//				n = c.next ;
//				c.next = p ;
//				p = c ;
//				c = n ;
//			}
//		}
//		return p ;
//	}
//}
//public class reverse_linked_list_206 {
//
//	public static void main(String[] args) {
//		reversell list = new reversell();
//		singlell a = new singlell(7);
//		singlell b = new singlell(9);
//		singlell c = new singlell(7);
//		singlell d = new singlell(6);
//		singlell e = new singlell(8);
//		singlell f = new singlell(5);
//		singlell g = new singlell(4);
//		singlell h = new singlell(9);
//		
//		a.next = b ;
//		b.next = c ;  
//		c.next = d ;  
//		d.next = e ;
//		e.next = f ;
//		f.next = g ;
//		g.next = h ;
//		
//		System.out.println("before sorting ");
//		list.print(a);
//		System.out.println("after reverse linked list  ");
//		list.print(list.reverse(a));
//		
//	}
//
//}

//********************************** using recursion *********************************************************************************************

package linked_list;

class reversell{
	
	void print(singlell a) {
		singlell temp = a ;   // this is a shallow copy 
		 while(temp!=null) {
			 System.out.print(temp.val+" ");
			 temp=temp.next ;
		 }
		System.out.println();
	 }
	
	singlell reverse(singlell head) {
		if(head==null || head.next==null) return head ;
		
		singlell a = head.next ;
		singlell nexthead = reverse(a ) ;
		a.next = head ;
		head.next = null ;
		
		return nexthead ;
	}
}
public class reverse_linked_list_206 {

	public static void main(String[] args) {
		reversell list = new reversell();
		singlell a = new singlell(7);
		singlell b = new singlell(9);
		singlell c = new singlell(7);
		singlell d = new singlell(6);
		singlell e = new singlell(8);
		singlell f = new singlell(5);
		singlell g = new singlell(4);
		singlell h = new singlell(9);
		
		a.next = b ;
		b.next = c ;  
		c.next = d ;  
		d.next = e ;
		e.next = f ;
		f.next = g ;
		g.next = h ;
		
		System.out.println("before sorting ");
		list.print(a);
		System.out.println("after reverse linked list  ");
		list.print(list.reverse(a));
		
	}

}
