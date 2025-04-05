//package linked_list;
//
//class palindromll{
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
//		if(head==null || head.next==null) return head ;
//		
//		singlell a = head.next ;
//		singlell nexthead = reverse(a) ;
//		a.next = head ;
//		head.next = null ;
//		
//		return nexthead ;
//	}
//	
//public boolean palindrome(singlell head) {
//	singlell newhead = new singlell(head.val);
//	singlell t1 = head.next ;
//	singlell t2 = newhead ;
//	while(t1!=null) {
//		singlell temp = new singlell(t1.val);
//		t2.next = temp ;
//		t1 = t1.next ;
//		t2 = t2.next ;
//	}
//	newhead = reverse(newhead);
//	t1 = head ;
//	t2 = newhead ;
//	
//	while(t1!=null) {
//		if(t1.val!=t2.val) {
//			return false ;
//		}
//		t1 = t1.next ;
//		t2 = t2.next ;
//	}
//        return true ;
//    }
//}
//public class palindrome_LL_234 {
//
//	public static void main(String[] args) {
//		palindromll list = new palindromll();
//		singlell a = new singlell(7);
//		singlell b = new singlell(9);
//		singlell c = new singlell(7);
//		singlell d = new singlell(6);
////		singlell e = new singlell(6);
//		singlell f = new singlell(7);
//		singlell g = new singlell(9);
//		singlell h = new singlell(7);
//		
//		a.next = b ;
//		b.next = c ;  
//		c.next = d ;  
//		d.next = f ;
////		e.next = f ;
//		f.next = g ;
//		g.next = h ;
//		
//		if(list.palindrome(a)==true) {
//			list.print(a); 
//			System.out.println(" is palindrom");
//		}else {
//			list.print(a); 
//			System.out.println(" is not a palindrom ");
//		}
//	}
//
//}

//*********************** divide linked list into two half ***********************************************************************

package linked_list;

class palindromll{
	
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
		singlell nexthead = reverse(a) ;
		a.next = head ;
		head.next = null ;
		
		return nexthead ;
	}
	
public boolean palindrome(singlell head) {
	singlell slow = head ;
	singlell fast = head ;
	
	while(fast.next!=null && fast.next.next!=null) {
		slow = slow.next;
		fast = fast.next.next ;
	}
	
	fast = reverse(slow.next);
	slow.next = null ;
	slow = head;
	while(slow!=null && fast!=null) {
		if(slow.val!=fast.val) {
			return false ;
		}
		slow = slow.next ;
		fast = fast.next ;
	}
	return true ;
    }
}
public class palindrome_LL_234 {

	public static void main(String[] args) {
		palindromll list = new palindromll();
		singlell a = new singlell(7);
		singlell b = new singlell(9);
		singlell c = new singlell(7);
		singlell d = new singlell(6);
		singlell e = new singlell(6);
		singlell f = new singlell(7);
		singlell g = new singlell(9);
		singlell h = new singlell(7);
		
		a.next = b ;
		b.next = c ;  
		c.next = d ;  
		d.next = e ;
		e.next = f ;
		f.next = g ;
		g.next = h ;
		
		list.print(a);
		if(list.palindrome(a)==true) {
			System.out.println(" is palindrom");
		}else {
			System.out.println(" is not a palindrom ");
		}
	}

}
