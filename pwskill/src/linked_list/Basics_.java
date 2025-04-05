package linked_list;

 class node{
	  int data ;
     node next ;   // line @1 -line @1 -line @1 -line @1 -line @1 -line @1
	
	 public node(int data){
		this.data = data ;
	}
}

public class Basics_ {
	
	public static void print(node head) {
		node temp = head ; // it is a shallow copy jiske pas node a ka pura excess h 
//		for(int i=1;i<=5;i++) { // or
			while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.next ;
		}
	}
	public static void main(String[] args) {
		node a = new node(10) ;
		node b = new node(20) ;
		node c = new node(30) ;  //these all are deep copy new box is created
		node d = new node(40) ;
		node e = new node(50) ;
		node f = new node(60) ;
		
		System.out.println(a);  // this is different for all 
		
//		yha hmm a ke next me b noe dal re h in line @1
		a.next = b ;  // 10->20    // hear a is link with b   
		b.next = c ;  // 10->20->30
		c.next = d ;  // 10->20->30->40
		d.next = e ;  // 10->20->30->40->50
		e.next = f ;  // 10->20->30->40->50->60
		
		print(a);
		
//		System.out.println(a.data);
//		System.out.println(a.next.data);
//		System.out.println(a.next.next.data);
//		System.out.println(a.next.next.next.data);
//		System.out.println(a.next.next.next.next.data);
	}
}