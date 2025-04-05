//******** perform all the operations like insertion, deletion, updating, printing index or list *******************

package linked_list;

class SLL{
	 node head ; // Start       // ye node basics class me bna huaa h
	 node tail ;  // end
	 int size ;
	 
	 void print() {
			node temp = head ; // it is a shallow copy jiske pas node a ka pura excess h 
//			for(int i=1;i<=5;i++) { // or
				while(temp!=null) {
				System.out.print(temp.data+" ");
				temp = temp.next ;
			}
				System.out.println();
		}
	 
		void size() {
			System.out.println("length of linked list "+size+"\n");
		}
		
	void insertAtEnd(int val) {  // insert at the end 
		node temp =  new node(val);  // from Basic_ code file 
		if(head==null) head=tail=temp ;
		else {
			tail.next = temp ;
			tail = temp ;
		}
		size++ ;
	}
	
	void insertatbegning(int val) {  // insert element at beginning 
		node temp = new node(val) ;
		if(head==null) head=tail=temp ;
		else {
			temp.next=head ;
			head = temp ;
		}
		size++ ;
	}
	
	void insert(int indx , int val) {
		if(indx==0) {        // at beginning 
			insertatbegning(val);
			return ;
		}
		if(indx==size) {    // at end 
			insertAtEnd(val);
			return ;
		}
		if(indx>size || indx<0) {
			System.out.println(indx+" is inavlid index \n");
			return ;
		}
		node temp = new node(val) ;
		if(head==null) head=tail=temp ;
		
		else {
			node x = head ;
			for(int i=1;i<indx;i++) {
				x=x.next ;
			}
			temp.next = x.next ;
			x.next = temp ;
			size++ ;
		}
	}
	
	int get(int idx) throws Error{   // throws Error is use to give error 
		
		if(idx==0)   return head.data;      // at beginning 
			
		if(idx==size-1)   return tail.data ;    // at end 
			
		if(idx>=size || idx<0)  {   // it throw the error 
			throw new Error("bhai wrong index dala h ");
		}
		
			node x = head ;
			for(int i=1;i<=idx;i++) {
				x=x.next ;	}
		return x.data ;
	    
	}
	
    void set(int idx , int value) throws Error{   // throws Error is use to give error 
		
		if(idx==0)  head.data = value ;      // at beginning 
			
		if(idx==size-1)  tail.data = value ;    // at end 
			
		if(idx>=size || idx<0)  {   // it throw the error 
			throw new Error("bhai wrong index dala h ");
		}
		
			node x = head ;
			for(int i=1;i<=idx;i++) {
				x=x.next ;	}
		x.data =value ;
	    
	}
    
    void delete(int indx ) {
		if(indx==0) {        // at beginning 
			head = head.next;
			size-- ;
			return ;
		}
		if(head==null || indx>size || indx<0)  {   // throws Error is use to give error
			throw new Error("bhai wrong index h ya fir list khali h ");
		}
		
		node temp = head ;
			for(int i=1;i<=indx-1;i++) {
				temp = temp.next;
			}
			if(temp.next==tail) tail = temp ;  // last element delete krenge to tail bhi -1 krna pdega
			temp.next = temp.next.next ;
			size-- ;
	} 
}
public class implimentation_of_two_LL_160 {
	public static void main(String[] args) {
		SLL list = new SLL();
		list.insertAtEnd(12);    // insert at end  
		list.insertAtEnd(23);
		
		list.print();  // to print complete linked list
		list.size();
//		System.out.println("size of list : "+list.size); // we can not print it because it is private 
		
		list.insertAtEnd(78); // add new node at end 
		System.out.println("adding element at the end");
		list.print();
		list.size();

		list.insertatbegning(34);   // insert element at beginning 
		list.insertatbegning(45);
		System.out.println("adding element at the start");
		list.print();  
		list.size();
		
		list.insert(5, 10);  // insert element at index you want (we do 0 indexing )
		System.out.println("adding element at the given index");
		list.print();
		list.size();

		int idx = 3;   // print element of index you want
		System.out.println("element at index "+idx+" is : "+list.get(idx)+"\n");
		
		
		list.set(2 , 99) ; // update the element 
		System.out.println("after update the element ");
		list.print();
		
		int idxe =5 ;  // deleting the index
		list.delete(idxe);
		System.out.println("after deliting index "+idxe);
		list.print();
	}
}
