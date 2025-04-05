package linked_list;
class odddeven{
	
	void print(singlell a) {
		singlell temp = a ;   // this is a shallow copy 
		 while(temp!=null) {
			 System.out.print(temp.val+" ");
			 temp=temp.next ;
		 }
		System.out.println();
	 }
	
	singlell oddEvenList(singlell head) {
		singlell a = new singlell(0) ;
		singlell odd = a ;
		singlell b = new singlell(0) ;
		singlell even = b ;
		singlell temp = head;
		
		while(temp!=null) {
			odd.next = temp ;
			temp = temp.next ;
			odd = odd.next ;
			
			even.next = temp;
			if(temp==null) break ;
			even = even.next ;
			temp = temp.next ;
			}
		a = a.next ;
		b = b.next ;
		odd.next = b ;
		return a ;
	}
}
public class odd_even_linked_list_328 {

	public static void main(String[] args) {
		odddeven list = new odddeven();
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
		System.out.println("after sorting ");
		list.print(list.oddEvenList(a));
	}

}

