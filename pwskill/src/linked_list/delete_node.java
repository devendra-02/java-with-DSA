package linked_list;
  
 class listNode { 
	 
	 void print(node a) {
		 node temp = a ;   // this is a shallow copy 
		 while(temp!=null) {
			 System.out.print(temp.data+" ");
			 temp=temp.next ;
		 }
		 System.out.println();
	 }
	 
	 void deletnode(node a) {
		 a.data = a.next.data ;
		 a.next = a.next.next ;
	 }
}
public class delete_node {
	public static void main(String[] args) {
		node a = new node(15) ;
		node b = new node(24) ;  // first we create a linked list 
		node c = new node(26) ;  //these all are deep copy new box is created
		node d = new node(35) ;
		node e = new node(48) ;
		node f = new node(57) ;
		
		a.next = b ;  // 10->20    // hear a is link with b   
		b.next = c ;  // 10->20->30
		c.next = d ;  // 10->20->30->40
		d.next = e ;  // 10->20->30->40->50
		e.next = f ;  // 10->20->30->40->50->60
		
		// Create an instance of ListNode and call print function
		listNode list = new listNode();  
		
		System.out.println("before deletion ");
		list.print(a);
		
		list.deletnode(c);  // now delete the element 
		System.out.println("after deletion ");
		list.print(a);
	}
  }

