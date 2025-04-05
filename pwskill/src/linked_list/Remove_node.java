
// delete nth node from the last of the linked list 

package linked_list;

class singlell{
	int val ;
	int size ;
	singlell next ;
	singlell() {}
	singlell(int val, singlell next) { this.val = val; this.next = next ; }
	
	public singlell(int val) {
		this.val = val ;
	}
	
	void print(singlell a) {
		singlell temp = a ;   // this is a shallow copy 
		 while(temp!=null) {
			 System.out.print(temp.val+" ");
			 temp=temp.next ;
		 }
		System.out.println();
	 }
	
	singlell deletenthnode(singlell head ,int index) {
		
//		if(head.next==null) {
//			return null;
//		}
//
//        int size = 0;
//        singlell temp = head;
//        while (temp != null) {
//            size++;
//            temp = temp.next;
//        }
//        
//		temp = head ;
//		if (index == size) {
//            return head.next;
//        }
//
//        // Reset temp to head
//        temp = head;
//        
//        // Find the (size - n)th node
//        for (int i = 1; i < size - index; i++) {
//            temp = temp.next;
//        }
//        
//        // Remove the nth node from the end
//        temp.next = temp.next.next;
//
//        return head;
//}
//******************************************************** OR *********************************************************************************************************	
		
		singlell slow = head ;
		singlell fast = head ;
		
		// move fast n steps 
		for(int i=1;i<=index;i++) {
			fast = fast.next;
		}
		if(fast==null) {
			head = head.next;
			return head ;
		}
		// move slow and fast together until fast reaches tail
		while(fast.next!=null) {
			fast=fast.next;
			slow=slow.next;
		}
		slow.next = slow.next.next;
		return head ;
	}
	
}

public class Remove_node {
	
	void print(singlell a) {
		singlell temp = a ;   // this is a shallow copy 
		 while(temp!=null) {
			 System.out.print(temp.val+" ");
			 temp=temp.next ;
			
		 }
		 System.out.println();
	 }

	public static void main(String[] args) {
		singlell list = new singlell();
		singlell a = new singlell(7);
		singlell b = new singlell(9);
		singlell c = new singlell(7);
		singlell d = new singlell(6);
		singlell e = new singlell(8);
		singlell f = new singlell(5);
		singlell g = new singlell(4);
		singlell h = new singlell(9);
		singlell i = new singlell(2);
		singlell j = new singlell(1);
		
		a.next = b ;
		b.next = c ;  
		c.next = d ;  
		d.next = e ;
		e.next = f ;
		f.next = g ;
		g.next = h ;
		h.next = i ;
		i.next = j ;
		 
		 int index = 5;
			System.out.println("inde is "+index);
		
			System.out.println("before ");
		list.print(a);
		
		a=list.deletenthnode(a, index);
		System.out.println("after ");
		list.print(a);
		
		
		 
	}

}