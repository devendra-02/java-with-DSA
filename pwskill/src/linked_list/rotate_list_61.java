package linked_list;

class rotateclass{
	
	void print(singlell a) {
		singlell temp = a ;   // this is a shallow copy 
		 while(temp!=null) {
			 System.out.print(temp.val+" ");
			 temp=temp.next ;
		 }
		System.out.println();
	 }
	
	singlell rotate(singlell head ,int k) {
		if(head==null || k==0 || head.next==null){
            return head ;
        }
        int n = 0;   // size of linked list 
        singlell temp = head ;
		while(temp!=null) {
			n++ ;
			temp = temp.next ;
		}
		k = k % n; 
        if(k==0){
            return head ;
        }
        singlell slow = head ;
        singlell fast = head ;
		for(int i=1;i<=k;i++) {
			fast = fast.next ;
		}
		while(fast.next!=null) {
			fast = fast.next ;
			slow = slow.next ;
		}
		singlell newhead = slow.next ;
		fast.next= head ;
		slow.next = null ;
		
		return newhead ;
	}
}
public class rotate_list_61 {

	public static void main(String[] args) {
		rotateclass list = new rotateclass();
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
		System.out.println("before ");
		list.print(a);
		System.out.println("after ");
		list.print(list.rotate(a, 3));
	}

}
