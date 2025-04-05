package Queues;

class node{
	int val ;
	node next ;
	
	public node(int val) {
		this.val = val ;
	}
}
public class queue_implimentation_using_linledlist {

	public static class queuell{
		node head = null ;
		node tail = null ;
		int size = 0 ;
		
		public void add(int val) {         // to add element 
			node temp = new node(val) ;
			if(head==null) {
				head = tail = temp ;
			}
			tail.next = temp ;
			tail = tail.next ;     ////////////
			size++ ;
		}
		
		public int remove() {       // to  remove the element 
			if(size==0) {
				System.out.println("queue is empty ");
				return -1 ;
			}
			int data = head.val ;
			head = head.next ;
			size-- ;
			return data ;
        }
		
		public int peek() {       // to check the top element
			if(size==0) {
				System.out.println("queue is empty ");
				return -1 ;
			}
			return head.val ;
        }

		public boolean isEmpty() {     // to check queue is empty 
			if(size==0) {
				return true ;
			}
			return false ;
        }
		 
		public void display() {    // to print all the elements 
			if(isEmpty()) {
				System.out.println("queue is empty ");
				return ;
			}
			node temp = head ;
			while(temp!=null) {
				System.out.print(temp.val+" ");
				temp = temp.next ;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		queuell q = new queuell();
		System.out.println("is queue is empty "+q.isEmpty());
		q.add(7); 
		q.add(9); 
		q.add(6); 
		q.add(8); 
		q.display();
		System.out.println("peek element "+q.peek());
		q.remove();
		q.display();
		System.out.println("peek element "+q.peek());
		System.out.println("is queue is empty "+q.isEmpty());
	}

}
