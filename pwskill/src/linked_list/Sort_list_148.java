package linked_list;
class shortlist{
	
	void print(singlell a) {
		singlell temp = a ;   // this is a shallow copy 
		 while(temp!=null) {
			 System.out.print(temp.val+" ");
			 temp=temp.next ;
		 }
		System.out.println();
	 }
	
	singlell merge(singlell list1 , singlell list2) {
		singlell ans = new singlell(-1);
		singlell a = ans ;
		while(list1!=null && list2 != null) {
			if(list1.val<list2.val) {
				a.next = list1;
				list1 = list1.next ;
			}else {
				a.next = list2;
				list2 = list2.next ;
			}
			a = a.next;  // ✅ Move the pointer forward
		}
		if(list1!=null) {   // hear add the remaining list of list1
				a.next = list1;
		}
		else{         // hear add the remaining list of list1
			a.next = list2;
	}
		return ans.next ;
 }
	
	singlell shortll(singlell head) {
		if(head==null || head.next==null) return head ;
		
		singlell fast = head , prev = null , slow = head ;
		
		while(fast != null && fast.next != null) {
			prev = slow;
            slow = slow.next;
            fast = fast.next.next;
		}
		prev.next = null;  // Split the list into two halves

        singlell left = shortll(head);
        singlell right = shortll(slow);
		
		singlell ans  = merge(left, right);
		return ans ;
	}
}
public class Sort_list_148 {

	public static void main(String[] args) {
		shortlist list =  new shortlist();
		singlell a = new singlell(37);
		singlell b = new singlell(82);
		singlell c = new singlell(15);
		singlell d = new singlell(94);
		singlell e = new singlell(37);
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
		
		System.out.println("before sorting ");
		list.print(a);
		System.out.println("after sorting ");
		list.print(list.shortll(a));
	}

}
