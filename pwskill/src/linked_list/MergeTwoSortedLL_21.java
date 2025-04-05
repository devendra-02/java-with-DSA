package linked_list;
class ListNode{
	int val ;
	ListNode next ;
	ListNode() {}
	ListNode(int val, ListNode next) { this.val = val; this.next = next ; }
	
	public ListNode(int val) {
		this.val = val ;
	}
	
	void print(ListNode a) {
		ListNode temp = a ;   // this is a shallow copy 
		 while(temp!=null) {
			 System.out.print(temp.val+" ");
			 temp=temp.next ;
		 }
		System.out.println();
	 }
	
	 ListNode merge(ListNode list1 , ListNode list2) {
			ListNode ans = new ListNode(-1);
			ListNode a = ans ;
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
			while(list1!=null) {
					a.next = list1;
					list1 = list1.next ;
					a = a.next;  // ✅ Move forward
			}
			while(list2!=null) {
				a.next = list2;
				list2 = list2.next ;
				a = a.next;  // ✅ Move forward
		}
			return ans.next ;
	 }
}
public class MergeTwoSortedLL_21 {

	public static void main(String[] args) {
		ListNode list = new ListNode();
		ListNode a = new ListNode(0);
		ListNode b = new ListNode(3);
		ListNode c = new ListNode(6);
		ListNode d = new ListNode(9);
		ListNode e = new ListNode(12);
		ListNode f = new ListNode(18);
		
		ListNode aa = new ListNode(4);
		ListNode bb = new ListNode(6);
		ListNode cc = new ListNode(11);
		ListNode dd = new ListNode(14);
		ListNode ee = new ListNode(16);
		ListNode ff = new ListNode(20);
		
		
		a.next = b ;
		b.next = c ;  
		c.next = d ;  
		d.next = e ;
		e.next = f ;
		
		aa.next = bb ;
		bb.next = cc ; 
		cc.next = dd ;
		dd.next = ee ;
		ee.next = ff ;
		
		System.out.println("first linked list ");
		list.print(a);
		System.out.println("second linked list ");
		list.print(aa);
		System.out.println("after mearge the both Linked list");
		list.print(list.merge(a, aa));
	}
}
