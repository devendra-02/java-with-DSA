package linked_list;

class dll{
	dnode head ;
	dnode tail ;
	int size ;
	
	// for calculate size 
	void size() {
		size = 0 ;
		dnode temp = head ;
		while(temp!=null) {
			size++ ;
			temp = temp.next;
		}
		System.out.println("size of linked list is : "+size);
	}

	// print the linked list 
	void print(){   
		dnode temp = head ;
		while(temp!=null) {
			System.out.print(temp.val+" ");
			temp = temp.next ;
		}
		System.out.println();
	}
	
	// insert element at tail
	void insertattail(int val) {
		dnode temp = new dnode(val);
		if(size==0) head = tail = temp ;
		else {
			tail.next = temp ;
			temp.pre = tail ;
			tail = tail.next ;
		}
		size++ ;
	}
	
	// insert element at head
	void inseartathead(int val) {
		dnode temp = new dnode(val);
		if(size==0) head = tail = temp ;
		else {
			temp.next = head;
			head.pre = temp ;
			head = temp ;
		}
		size++ ;
	}

	// insert element at index 
	void insertatindex(int indx, int val) {
		if(indx==0) inseartathead(val);
		else if(indx==size) insertattail(val);
		else {
			dnode dummy = new dnode(val);
			dnode tempx = head;
			dnode tempy = head.next ;
			while(indx-1!=0) {
				tempx =  tempx.next ;
				tempy =  tempy.next ;
				indx--;
			}
			tempx.next = dummy ; dummy.pre = tempx ;
			dummy.next = tempy; tempy.pre = dummy ;
			size++ ;
		}
	}

	// delete head 
	void deletehead() {
		head = head.next;
		head.pre = null ;
		size-- ;
	}
	
	// delete tail
	void deletetail() {
		tail = tail.pre ;
		tail.next = null;
		size-- ;
	}
	
	// delete an index
	void deleteindx(int indx ) {
		if(indx==0) deletehead();
		else if(indx==size-1) deletetail();
		else {
		
		dnode temp = head;
		while(indx-1!=0) {
			temp =  temp.next ;
			indx--;
		}
		temp.next = temp.next.next ;
		temp =  temp.next ;
		temp.pre = temp.pre.pre ;
		size-- ;
		}
	}
}

public class inplimentation_doubly_linked_list {

	public static void main(String[] args) {
		
		dll list = new dll( );
		// use to calculate size
		list.size();
		
		// use to print linked list 
		list.print();
		
		// insert element at tail
		System.out.println("intersation at tail");
		list.insertattail(2);
		list.insertattail(5);
		list.print();
		
		//insert at head ; 
		System.out.println("inseration at heat ");
		list.inseartathead(4);
		list.inseartathead(6);
		list.print();
		
		// insert at index 
		System.out.println("inseart at inde 2 and 0");
		list.insertatindex(3, 9); // 0 base indexing 
		list.insertatindex(0, 7);
		list.print();
		
		// delete head
		System.out.println("delete head");
		list.deletehead();
		list.print();
		
		// delete tail
		System.out.println("delete tail");
		list.deletetail();
		list.print();
		
		//delete index
		System.out.println(" delete index ");
		list.deleteindx(2);   // 0 base indexing
		list.print();
		
		
		System.out.println("size of linked list :"+list.size);
	}

}
