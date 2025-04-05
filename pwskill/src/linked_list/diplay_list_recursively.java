package linked_list;

public class diplay_list_recursively {
	
	public static void displayrecursively(node head) {
		if(head==null) return ;
		System.out.print(head.data+" ");
		displayrecursively(head.next);
		System.out.println(head.data);  // for reverse print 
	}
	public static void main(String[] args) {
		
//		Basics_.node a = new Basics_.node(11); // if node data type define inside the Basics_ class in Basics code 
		
		node a = new node(11) ;
		node b = new node(22) ;
		node c = new node(33) ;  //these all are deep copy new box is created
		node d = new node(44) ;
		node e = new node(55) ;
		node f = new node(66) ;
		
		a.next = b ;  // 10->20    // hear a is link with b   
		b.next = c ;  // 10->20->30
		c.next = d ;  // 10->20->30->40
		d.next = e ;  // 10->20->30->40->50
		e.next = f ;  // 10->20->30->40->50->60
		
		displayrecursively(a);
	}
}
