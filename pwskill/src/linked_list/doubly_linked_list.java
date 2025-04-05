package linked_list;

class dnode{
	int val ;
	dnode next ;
	dnode pre ;  // previous node 
	
	dnode(int val){
		this.val = val ;
	}
}




public class doubly_linked_list {    //  main class of file 

	// print the linked list from start 
	public static void printstart(dnode head) {
		dnode temp = head ;
		while(temp!=null) {
			System.out.print(temp.val+" ");
			temp = temp.next ;
		}
		System.out.println();
	}
	
	// print the linked list from the end 
	public static void printend(dnode tail) {
		dnode temp = tail ;
		while(temp!=null) {
			System.out.print(temp.val+" ");
			temp = temp.pre ;
		}
		System.out.println();
	}
	
	// print the linked list from index n 
	public static void printlist(dnode node) {
		dnode temp = node ;
		
		while(temp.pre!=null) {
			temp = temp.pre ;
		}
		// n
		printstart(temp);
	}
	public static void main(String[] args) {
		dnode a = new dnode(10);
		dnode b = new dnode(20);
		dnode c = new dnode(30);
		dnode d = new dnode(40);
		dnode e = new dnode(50);
		dnode f = new dnode(60);
		dnode g = new dnode(70);
		
		a.next = b; b.pre = a;
		b.next = c; c.pre = b;
		c.next = d; d.pre = c;
		d.next = e; e.pre = d;
		e.next = f; f.pre = e;
		f.next = g; g.pre = f;
		
		System.out.println("print from start ");
		printstart(a);
		System.out.println("print from end ");
		printend(g);
		System.out.println("print linked list from any node ");
		printlist(e);	
		
	}
}
